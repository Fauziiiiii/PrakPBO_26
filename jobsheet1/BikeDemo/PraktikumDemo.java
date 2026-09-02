package BikeDemo;

public class PraktikumDemo {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone();
        hp1.merk = "Samsung";
        hp1.persenBaterai = 45;

        AC ac1 = new AC();
        ac1.merk = "Panasonic";
        ac1.suhuCelcius = 24;

        Laptop laptopUmum = new Laptop();
        laptopUmum.merk = "Laptop Generic";
        laptopUmum.sistemOperasi = "Windows 10";

        AcerSwift swift3 = new AcerSwift();
        swift3.merk = "Acer Swift 3";
        swift3.sistemOperasi = "Windows 11";
        swift3.warna = "Silver";
        swift3.beratKg = 1.2;

        AcerNitro nitroV15 = new AcerNitro();
        nitroV15.merk = "Acer Nitro V15";
        nitroV15.sistemOperasi = "Windows 11";
        nitroV15.kartuGrafis = "NVIDIA RTX 4050";
        nitroV15.rgbAktif = true;

        hp1.nyalakan();
        hp1.isiDaya(20);
        hp1.cetakInformasi();

        ac1.nyalakan();
        ac1.ubahSuhu(18);
        ac1.cetakInformasi();

        laptopUmum.nyalakan();
        laptopUmum.installSoftware("Microsoft Office");
        laptopUmum.cetakInformasi();
        System.out.println();

        swift3.nyalakan();
        swift3.aktifkanFingerprint();
        swift3.chargeTypeC();
        swift3.cetakInformasi();

        nitroV15.nyalakan();
        nitroV15.nyalakanKipasMaksimal();
        nitroV15.mainGame("Cyberpunk 2077");
        nitroV15.cetakInformasi();
    }
}
