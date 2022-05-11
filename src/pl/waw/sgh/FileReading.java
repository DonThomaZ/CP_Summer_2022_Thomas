package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        String fileToRead = "file.txt";
        File file = new File(fileToRead);
        Scanner scanner = new Scanner(file);
        int i=0;
        while (scanner.hasNextLine()) {
            String myLine = scanner.nextLine();
            i++;
            System.out.println("Line " + i + ": " + myLine);
        }

    }
}
