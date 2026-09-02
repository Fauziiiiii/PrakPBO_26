package BikeDemo;

public class Laptop {
    public String merk;
    public String sistemOperasi;

    public void nyalakan() {
        System.out.println("Laptop " + merk + " booting OS " + sistemOperasi + "...");
    }
    public void installSoftware(String software) {
        System.out.println("Menginstal " + software + " pada laptop " + merk + ".");
    }
    public void cetakInformasi() {
        System.out.println("Merk Laptop : " + merk);
        System.out.println("OS          : " + sistemOperasi);
    }
}
