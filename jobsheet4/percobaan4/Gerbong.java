package jobsheet4.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    // public void setPenumpang(Penumpang penumpang, int nomor){
    //     this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    // }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        int index = nomor - 1;
        if (index < 0 || index >= arrayKursi.length) {
            System.out.println("Nomor kursi " + nomor + " tidak valid!");
            return;
        }
        
        if (this.arrayKursi[index].getPenumpang() != null) {
            System.out.println("Gagal: Kursi nomor " + nomor + " sudah ditempati oleh " 
                + this.arrayKursi[index].getPenumpang().getNama() + "!");
        } else {
            this.arrayKursi[index].setPenumpang(penumpang);
            System.out.println("Berhasil memesan kursi nomor " + nomor + " untuk " + penumpang.getNama());
        }
    }

    public String info(){
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }

        return info;
    }
}
