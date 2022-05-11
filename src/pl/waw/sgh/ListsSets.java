package pl.waw.sgh;

import java.util.*;

public class ListsSets {

    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(5);
        myInts.add(89);
        myInts.add(5);

        for (Integer el : myInts) {
            System.out.println(el);
        }
        System.out.println();
        for (int i=0;i<myInts.size();i++) {
            System.out.println(i + ": " + myInts.get(i));
        }
        if (myInts.contains(5))
            System.out.println("contains 5");

        System.out.println(myInts.indexOf(5));
        System.out.println(myInts.lastIndexOf(5));
        System.out.println();

        Set<Double> mySet = new HashSet<>();
        mySet.add(636.6);
        mySet.add(757.3);
        mySet.add(636.6);
        for (Double el : mySet) {
            System.out.println(el);
        }

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("5D", 24);
        myMap.put("3C", 13);

        for (String key: myMap.keySet()) {
            System.out.println(key + ": " + myMap.get(key));
        }

    }
}
