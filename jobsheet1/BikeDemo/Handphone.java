package BikeDemo;

public class Handphone {
    public String merk;
    public int persenBaterai;

    public void nyalakan() {
        System.out.println("Handphone " + merk + " menyala.");
    }
    public void isiDaya(int persen) {
        persenBaterai += persen;
        System.out.println("Mengisi daya... Baterai sekarang " + persenBaterai + "%.");
    }
    public void cetakInformasi() {
        System.out.println("--- Info Handphone ---");
        System.out.println("Merk    : " + merk);
        System.out.println("Baterai : " + persenBaterai + "%\n");
    }
}
