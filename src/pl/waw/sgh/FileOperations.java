package pl.waw.sgh;

import java.io.File;

public class FileOperations {

    public static void main(String[] args) {
        String fileName = "out.txt";
        File myFile = new File(fileName);
        System.out.println("Exists " + fileName + ": " + myFile.exists());
        System.out.println("Absolute " + fileName + ": " + myFile.isAbsolute());
        System.out.println("is file " + fileName + ": " + myFile.isFile());
        System.out.println("is dir " + fileName + ": " + myFile.isDirectory());
        System.out.println("size " + fileName + ": " + myFile.length());
        System.out.println("absolute path " + fileName + ": " + myFile.getAbsolutePath());

        String dirName = "h:\\";
        File myDir = new File(dirName);
        File[] files = myDir.listFiles();
        for (File f : files) {
            System.out.println(f + " " + f.length());
            //System.out.println(f.length());
        }
        System.out.println();
    }
}
