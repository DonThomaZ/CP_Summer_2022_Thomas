package pl.waw.sgh.shapes;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.ArrayList;
import java.util.List;

public class ManipulateShapes {

    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle(5.0, 4.0);
        Shape r1 = new Rectangle(5.0, 4.0);
        r1.setParams(6.7, 8.9);
        System.out.println(r1);
        System.out.println("R1 surface: " + r1.calcSurface());

        Circle c1 = new Circle(2.0);
        System.out.println(c1);
        System.out.println("C1 surface: " + c1.calcSurface());

        //Shape sh1 = new Shape(4.0, 6.0);
        //System.out.println(sh1);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(r1);
        myShapes.add(c1);

        for (Shape s : myShapes) {
            System.out.println(s);
            System.out.println(s.calcSurface());
        }


    }
}
