package BikeDemo;

public class AcerSwift extends Laptop {
    public String warna;
    public double beratKg;

    public void aktifkanFingerprint() {
        System.out.println("Sensor sidik jari diaktifkan. Login berhasil.");
    }
    public void chargeTypeC() {
        System.out.println("Mengisi daya laptop menggunakan port Type-C.");
    }
    @Override
    public void cetakInformasi() {
        System.out.println("--- Info Laptop Tipis ---");
        super.cetakInformasi();
        System.out.println("Warna       : " + warna);
        System.out.println("Berat       : " + beratKg + " Kg\n");
    }
}
