package pl.waw.sgh.obj;


public class ManipulateRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        //Rectangle r1 = new Rectangle(5, 10);
        //Rectangle r1 = new Rectangle();
        //r1.setParams(5, 10);
        //r1.sideB = 8;
        //r1.sideA = 23;
        System.out.println("Surface R1: " + r1.calcSurface());
        Rectangle r2 = new Rectangle(6, 7);
        //r2.setParams(6, 7);
        System.out.println("Surface R2: " + r2.calcSurface());
    }
}
