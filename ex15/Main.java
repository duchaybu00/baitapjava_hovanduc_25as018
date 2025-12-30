package ex15;

public class Main {
    public static void main(String[] args) {
        // Test Circle
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        System.out.println("Circle Area: " + c1.getArea());

        // Test Rectangle
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        System.out.println("Rectangle Area: " + r1.getArea());

        // Test Employee
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        e1.raiseSalary(10);
        System.out.println("New Salary after 10% raise: " + e1.getSalary());

        // Test InvoiceItem
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Drive", 888, 0.08);
        System.out.println(inv1);
        System.out.println("Total Price: " + inv1.getTotal());
    }
}
