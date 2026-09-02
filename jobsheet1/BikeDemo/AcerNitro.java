package BikeDemo;

public class AcerNitro extends Laptop {
    public String kartuGrafis;
    public boolean rgbAktif;

    public void nyalakanKipasMaksimal() {
        System.out.println("Kipas pendingin menyala dalam kecepatan maksimal!");
    }
    public void mainGame(String game) {
        System.out.println("Memainkan game " + game + " dengan lancar menggunakan " + kartuGrafis + ".");
    }
    @Override
    public void cetakInformasi() {
        System.out.println("--- Info Laptop Gaming ---");
        super.cetakInformasi(); 
        System.out.println("GPU         : " + kartuGrafis);
        System.out.println("RGB Aktif   : " + rgbAktif + "\n");
    }
}