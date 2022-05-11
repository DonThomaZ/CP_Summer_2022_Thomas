package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        String fileName = "out.txt";
        File myFile = new File(fileName);
        // appending to a file
        FileWriter fw = new FileWriter(myFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        //BufferedWriter bw = new BufferedWriter(fw, 1024);
        bw.write("This is my header");
        bw.newLine();
        bw.flush();
        bw.write("2nd line");
        bw.newLine();
        bw.write("3rd line");
        bw.close();
        fw.close();
    }
}
