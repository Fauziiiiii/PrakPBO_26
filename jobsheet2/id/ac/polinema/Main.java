package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 4);
        r.width = 6;
        r.height = 4;

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        // Area: 24
        // Perimeter: 20
    }
}
