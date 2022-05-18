package pl.waw.sgh.obj;

public class Rectangle {
    private Integer sideA;
    private int sideB = 4;

//    public Rectangle() {
//        //sideA = 100;
//        //sideB = 2;
//    }
//
    public Rectangle() {
        this(40, 20);
        //sideA = 100;
        //sideB = 2;
    }



    public Rectangle(Integer sideA, int sideB) {
        setParams(sideA, sideB);
        //this.sideA = sideA;
        //this.sideB = sideB;
    }

    public void setParams(int a, int b) {
        if (a>0 && b>0) {
            this.sideA = a;
            sideB = b;
        } else {
            System.out.println("a and b must be > 0");
        }
    }

    public int calcSurface() {
        return sideA*sideB;
    }
}
