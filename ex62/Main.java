package ex62;

public class Main {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5);
        GeometricObject r = new Rectangle(4, 6);

        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println();

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
