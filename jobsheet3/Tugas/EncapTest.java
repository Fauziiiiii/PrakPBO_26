package jobsheet3.Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());

        System.out.println();

        encap.setName("Yaseri");
        encap.setAge(17);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
