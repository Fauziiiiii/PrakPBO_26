package jobsheet3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Sendiri", 5000);
        Scanner input = new Scanner(System.in);
        boolean berjalan = true;

        System.out.println("=== SISTEM MANAJEMEN LOGISTIK KONTAINER ===");
        System.out.println("ID Kontainer           : " + kontainerAlfa.getIdKontainer());
        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        while (berjalan) {
            System.out.println("\n------------------------------------------");
            System.out.println("Berat Muatan Saat Ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            System.out.println("PILIH OPERASI:");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda (1-3): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang akan ditambahkan (kg): ");
                    double tambah = input.nextDouble();
                    kontainerAlfa.tambahMuatan(tambah);
                    break;
                case 2:
                    System.out.print("Masukkan berat muatan yang akan diturunkan (kg): ");
                    double turun = input.nextDouble();
                    kontainerAlfa.turunkanMuatan(turun);
                    break;
                case 3:
                    berjalan = false;
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
        
        // System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        // System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainerAlfa.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainerAlfa.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        // kontainerAlfa.turunkanMuatan(500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // System.out.println("\nMembongkar muat/menurunkan barang seberat 1500 kg...");
        // kontainerAlfa.turunkanMuatan(1500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 2100 kg...");
        // kontainerAlfa.turunkanMuatan(2100);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
