package pl.waw.sgh;

import java.io.*;
import java.util.Map;

public class BinaryFileReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "out.dat";
        File myFile = new File(fileName);
        FileInputStream fis = new FileInputStream(myFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<Integer, String> mapRead = (Map<Integer, String>)ois.readObject();
        ois.close();
        fis.close();

        for (Integer k : mapRead.keySet()) {
            System.out.println(k + ": " + mapRead.get(k));
        }

    }
}
