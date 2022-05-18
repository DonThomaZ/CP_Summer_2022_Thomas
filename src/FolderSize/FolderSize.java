package FolderSize;

import java.io.File;
import java.util.Scanner;
// ****************** THOMAS ZARZECZNY 89349 ******************
public class FolderSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Specify the path of the chosen folder/file: ");
        String filepath = input.nextLine();

        String[] parts = filepath.split("/");
        int last = parts.length - 1;
        double output = 0, finalsize;
        finalsize = SizeCalculator(new File(filepath));

        if (finalsize < 500000){
            System.out.println("The size of " + parts[last] + " is: " +
                    finalsize + " Bytes");
        }
        if (finalsize >= 500000 && finalsize < 500000000){
            output = finalsize/1000000;
            System.out.println("The size of " + parts[last] + " is: " +
                    String.format("%.2f", output) + " MB");
        }
        if (finalsize >= 500000000){
            output = finalsize/1000000000;
            System.out.println("The size of " + parts[last] + " is: " +
                    String.format("%.2f", output) + " GB");
        }
    }


    public static double SizeCalculator(File filepath) {
        double size = 0;

        if (filepath.isDirectory()) {
            File[] files = filepath.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += SizeCalculator(files[i]);
            }
        } else {
            size += filepath.length();
        }
        return size;
    }
}