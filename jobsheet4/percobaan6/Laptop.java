package jobsheet4.percobaan6;

public class Laptop {
    private String merek;

    public Laptop(String merek){
        this.merek = merek;
    }

    public void cetakDokumen(Printer printer, String namaFile){
        System.out.println(merek + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}
