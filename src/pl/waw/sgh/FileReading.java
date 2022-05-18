package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        //String fileToRead = "src\\file.txt";
        //String fileToRead = "src" + File.separator + "file.txt";
        //String fileToRead = "src/file.txt";
        //String fileToRead = "h:\\tmp\\file.txt";
        //String fileToRead = "h:\\tmp\\file.txt";
        String fileToRead = "out.txt";
        File file = new File(fileToRead);
        Scanner scanner = new Scanner(file);
        int i=0;
        while (scanner.hasNextLine()) {
            String myLine = scanner.nextLine();
            String[] els = myLine.split(";");
            List<Integer> myInts = new ArrayList<Integer>();
            for (String el : els) {
                int number = Integer.parseInt(el);
                myInts.add(number);
            }
            for (Integer myNum : myInts) {
                System.out.println("El: " + myNum);
            }
            i++;
            System.out.println("Line " + i + ": " + myLine);
            System.out.println(Arrays.toString(els));
        }

    }
}
