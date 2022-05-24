package pl.waw.sgh.shapes;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.ArrayList;
import java.util.List;

public class ManipulateShapes {

    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(5.0, 4.0);
//        Shape r1 = new Rectangle(5.0, 4.0);
//        r1.setParams(6.7, 8.9, 0.0);
//        System.out.println(r1);
//        System.out.println("R1 surface: " + r1.calcSurface());
//
//        Circle c1 = new Circle(2.0);
//        System.out.println(c1);
//        System.out.println("C1 surface: " + c1.calcSurface());

        TriangleHW t1 = new TriangleHW(1.0,1.0,1.0);
        t1.setParams(3.0,4.0,5.0);
        System.out.println("\nTriangle perimeter: " + t1.calcPerimeter());
        System.out.println("Triangle surface: " + t1.calcSurface());

        EquilateralTriangleHW et1 = new EquilateralTriangleHW(3.0);
        System.out.println("\nEquilateral triangle perimeter: " + et1.calcPerimeter());
        System.out.println("Equilateral triangle surface: " + et1.calcSurface());

        DiamondHW d1 = new DiamondHW(4.0, 3.0);
        System.out.println("\nDiamond perimeter: " + d1.calcPerimeter());
        System.out.println("Diamond surface: " + d1.calcSurface());



//        Shape sh1 = new Shape(4.0, 6.0);
//        System.out.println(sh1);

//        List<Shape> myShapes = new ArrayList<>();
//        myShapes.add(r1);
//        myShapes.add(c1);
//
//        for (Shape s : myShapes) {
//            System.out.println(s);
//            System.out.println(s.calcSurface());
//        }


    }
}
