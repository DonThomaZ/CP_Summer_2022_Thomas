package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;

public class MapInsteadOfIf {
    public static void main(String[] args) {
        Map<Integer, String> mapOfDays = new HashMap<>();
        mapOfDays.put(1, "Mon");
        mapOfDays.put(2, "Tue");

        System.out.println(mapOfDays.get(2));
    }
}
