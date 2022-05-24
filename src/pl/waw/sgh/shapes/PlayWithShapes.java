package pl.waw.sgh.shapes;

//import pl.waw.sgh.shapes.*;

import pl.waw.sgh.shapes.Rectangle;

public class PlayWithShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 4.0);
        r1.parB = 30.7;
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5.0, 4.0);
        //boolean is_r1_eq_r2 = r1 == r2;
        boolean is_r1_eq_r2 = r1.equals(r2);
        System.out.println("Is R1=R2: " + is_r1_eq_r2);



        String s1 = "abc";
        //String s2 = "a" + "bc";
        String s2 = new String("abc");
        if (s1==s2) {
            System.out.println("s1==s2");
        } else {
            System.out.println("s1!=s2");
        }

        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        } else {
            System.out.println("not s1.eqauls(s2)");
        }


    }
}
