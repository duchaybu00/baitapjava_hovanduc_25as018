package ex51;

public class Main {
    public static void main(String[] args) {
        // Test Point
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Test Line (Composition)
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());

        // Test LineSub (Inheritance)
        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);
        System.out.println("Length: " + ls1.getLength());
    }
}
