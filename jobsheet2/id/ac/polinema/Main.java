package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " +original.area());
        System.out.println("Via copy: " + copy.area());

        System.out.println();

        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 2);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }

        System.out.println();

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());

        System.out.println();

        double radius = 5;
        Circle c = new Circle(radius);
        System.out.println("Circle Area (radius: " + radius + "): " + c.area());
        System.out.println("Circle Circumference (radius: " + radius + "): " + c.circumference());

        // Area: 24, Perimeter: 20
        // Area: 6, Perimeter: 10
        // Area: 16, Perimeter: 20
        // Nadia (S001, GPA: 3.8)
        // Circle Area (radius: 5.0): 78.53981633974483
        // Circle Circumference (radius: 5.0): 31.41592653589793
    }
}
