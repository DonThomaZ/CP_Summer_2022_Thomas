package pl.waw.sgh;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BinaryFileWriter {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> mapOfDays = new HashMap<>();
        mapOfDays.put(1, "Mon");
        mapOfDays.put(2, "Tue");
        mapOfDays.put(3, "Wed");

        String fileName = "out.dat";
        File myFile = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(myFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mapOfDays);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
