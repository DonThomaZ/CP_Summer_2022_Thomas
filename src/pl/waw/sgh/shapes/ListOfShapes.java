package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfShapes {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(5.0, 6.0));
        shapeList.add(new Circle(2.0));
        shapeList.add(new Rectangle(4.5, 4.0));
        System.out.println(shapeList);
        Shape r1 = shapeList.get(0);
        Shape c1 = shapeList.get(1);
        System.out.println("Compare r1 to c1: " + r1.compareTo(c1));


        Collections.sort(shapeList);
        System.out.println(shapeList);


    }
}
