package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " +original.area());
        System.out.println("Via copy: " + copy.area());

        // Area: 24
        // Via original: 40
        // Via copy: 40
    }
}
