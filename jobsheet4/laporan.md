# Praktikum Pemrograman Berbasis Objek – Pertemuan 4   
##  Relasi Kelas: Aggregation, Composition, dan Dependency  



> Nama   : Muhammad Fauzi Fadillah
>
> NIM    : 254107020085
>
> Kelas  : TI_2G

---

# C. Langkah Kerja  

## Percobaan 1: Aggregation Satu-ke-Satu (Laptop dan Processor)  

### Kode program Laptop.java:  
 
```java
package jobsheet4.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){}

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setProc(Processor proc){
        this.proc = proc;
    }

    public Processor getProc(){
        return proc;
    }

    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
```

### Kode program Processor.java:  
 
```java
package jobsheet4.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    public Processor(){}

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setCache(double cache){
        this.cache = cache;
    }

    public double getCache(){
        return cache;
    }

    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %s\n", cache);
    }
}
```


### Kode program MainPercobaan.java:  
 
```java
package jobsheet4.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", p);

        l.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i7");
        p1.setCache(6);

        Laptop l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();

        Laptop l2 = new Laptop("Thinkpadd",
            new Processor("Intel i5", 3)
        );

        l2.info();
    }
}
```

### Output program
```code
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3.0
Merk Laptop = Thinkpad
Merk Processor = Intel i7
Cache Memory = 6.0
Merk Laptop = Thinkpadd
Merk Processor = Intel i5
Cache Memory = 3.0
```

--- 


## Percobaan 2: Aggregation dengan Relasi Ganda (Rental Mobil)  

### Kode program Mobil.java:  
 
```java
package jobsheet4.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil(){}

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
```

### Kode program Sopir.java:  
 
```java
package jobsheet4.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir(){}

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }


}
```


### Kode program Pelanggan.java:  
 
```java
package jobsheet4.percobaan2;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan(){}

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }

    public Mobil getMobil(){
        return mobil;
    }

    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }

    public Sopir getSopir(){
        return sopir;
    }

    public void setHari(int hari){
        this.hari = hari;
    }

    public int getHari(){
        return hari;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
```


### Kode program MainPercobaan2.java:  
 
```java
package jobsheet4.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya Total = " + p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
    }

}
```

### Output program
```code
Biaya Total = 1100000
Avanza
```

### Pertanyaan

--- 


## Percobaan 3: Aggregation dengan Dua Role ke Kelas yang Sama (Kereta Api)  

### Kode program KeretaApi.java:  
 
```java
package jobsheet4.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }

    public Pegawai getMasinis(){
        return masinis;
    }

    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }

    public Pegawai getAsisten(){
        return asisten;
    }

    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if(this.asisten != null){
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        
        return info;
    }
}
```

### Kode program Pegawai.java:  
 
```java
package jobsheet4.percobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String geNip(){
        return nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String info(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
```


### Kode program MainPercobaan3.java:  
 
```java
package jobsheet4.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}
```

### Output program
```code
Nama: Gaya Baru
Kelas: Bisnis
Masinis: Nip: 1234
Nama: Spongebob Squarepants

Asisten: Nip: 4567
Nama: Patrick Star
```

### Kode program MainPertanyaan.java:  
 
```java
package jobsheet4.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
```

### Output program
```code
Nama: Gaya Baru
Kelas: Bisnis
Masinis: Nip: 1234
Nama: Spongebob Squarepants
```

### Pertanyaan

--- 


## Percobaan  4: Array of Object dan Multiplicity (Gerbong, Kursi, dan Penumpang)  

### Kode program Penumpang.java:  
 
```java
package jobsheet4.percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp(){
        return ktp;
    }

    public String getNama(){
        return nama;
    }

    public String info(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";

        return info;
    }
}

```

### Kode program Kursi.java:  
 
```java
package jobsheet4.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor){
        this.nomor = nomor;
    }

    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang(){
        return penumpang;
    }

    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        
        return info;
    }
}
```


### Kode program Gerbong.java:  
 
```java
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

    public void setPenumpang(Penumpang penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
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
```


### Kode program MainPercobaan4.java:  
 
```java
package jobsheet4.percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
```

### Output program
```code
Kode: A
Nomor: 1
Penumpang: Ktp: 12345
Nama: Mr. Krab

Nomor: 2
Nomor: 3
Nomor: 4
Nomor: 5
Nomor: 6
Nomor: 7
Nomor: 8
Nomor: 9
Nomor: 10
```


### Pertanyaan  
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?  
Jawab:  
Jumlah kursi dalam Gerbong A adalah 10 kursi.

2. Perhatikan potongan kode if (this.penumpang != null) { ... } pada method info() dalam class Kursi. Apa maksud kode tersebut?  
Jawab:  
Kode tersebut berfungsi sebagai guard clause (pengecekan kondisi pengaman).

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1?
Jawab:  
Karena adanya perbedaan antara penomoran kursi untuk pengguna (human-friendly) dengan indeks array di Java

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1), menimpa Mr. Krab yang sudah duduk di sana. Apakah yang terjadi? Apakah Java memberi peringatan/error?  
Jawab:  
Referensi objek Mr. Krab pada kursi nomor 1 tertimpa dan digantikan sepenuhnya oleh objek budi. Java tidak memberikan peringatan ataupun error sama sekali, karena secara sintaksis operasi penugasan (assignment) nilai referensi baru ke variabel atau elemen array yang sudah ada adalah valid.

5. Modifikasi program sehingga tidak diperkenankan menduduki kursi yang sudah ada penumpang lain (tambahkan pengecekan pada Gerbong.setPenumpang() sebelum baris arrayKursi[nomor - 1].setPenumpang(...) dijalankan).  
Jawab:  
Update code program Gerbong.java  
```java
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
```

Output program:  
```code
Berhasil memesan kursi nomor 1 untuk Mr. Krab
Kode: A
Nomor: 1
Penumpang: Ktp: 12345
Nama: Mr. Krab

Nomor: 2
Nomor: 3
Nomor: 4
Nomor: 5
Nomor: 6
Nomor: 7
Nomor: 8
Nomor: 9
Nomor: 10
```

6. Bandingkan tiga bentuk relasi has-a yang sudah kita praktikkan: Laptop-Processor (Percobaan 1, 1-1), KeretaApi-Pegawai (Percobaan 3, dua relasi 1-1 bernama), dan Gerbong-Kursi (Percobaan 4, 1..*). Untuk kasus seperti apa kita akan memilih array, dan untuk kasus seperti apa kita akan memilih atribut bernama satu-satu?  
Jawab:  
Atribut bernama satu-satu (Percobaan 1 & 3): Dipilih ketika jumlah objek bagian (part) sedikit, tetap, dan masing-masing memiliki peran (role) semantik yang berbeda secara jelas (misalnya: atribut masinis dan asisten yang keduanya bertipe Pegawai).  
Array of Object (Percobaan 4): Dipilih ketika multiplicity bernilai jamak (misalnya 1..* atau 0..*), jumlah elemennya dinamis atau banyak, dan seluruh objek di dalamnya memiliki fungsi serta kedudukan yang seragam tanpa memerlukan nama variabel individual (misalnya: kumpulan elemen Kursi di dalam Gerbong).

7. Terapkan kriteria kode (siapa yang memanggil new) pada dua relasi has-a di Percobaan ini: GerbongKursi dan Kursi-Penumpang. Manakah yang Aggregation dan manakah yang Composition? Tunjukkan baris kode yang menjadi bukti untuk masing-masing  
Jawab:  
Gerbong - Kursi adalah Composition: Objek Kursi diinstansiasi secara internal oleh class Gerbong itu sendiri.
bukti code:  
    ```java
    this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    ```  
Kursi - Penumpang adalah Aggregation: Objek Penumpang diinstansiasi di luar (pada class main) dan disuntikkan ke class Kursi melalui setter. bukti code:  
```java
// main program
Penumpang p = new Penumpang("12345", "Mr. Krab");

// Kursi.java
public void setPenumpang(Penumpang penumpang) {
    this.penumpang = penumpang;
}
```



--- 


## Percobaan  5: Composition (Mobil dan Mesin)    

### Kode program Mesin.java:  
 
```java
package jobsheet4.percobaan5;

public class Mesin {
    private String tipe;

    public Mesin(){
        this.tipe = "4-silinder";
    }

    public String getTipe(){
        return tipe;
    }
}
```

### Kode program Mobil.java:  
 
```java
package jobsheet4.percobaan5;

public class Mobil {
    private String merek;
    private Mesin mesin;

    public Mobil(String merek){
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo(){
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin : " + mesin.getTipe());
    }
}
```


### Kode program MainPercobaan5.java:  
 
```java
package jobsheet4.percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza");
        mobil.tampilkanInfo();
    }
}
```

### Output program
```code
Mobil: Avanza
Mesin : 4-silinder
```

### Pertanyaan Percobaan 5  

1. Pada class Mobil, baris manakah yang menunjukkan bahwa Mesin adalah bagian yang “dimiliki
secara eksklusif” oleh Mobil (bukan sekadar “dipinjam”)?  
Jawab:  
    ```java
    this.mesin = new Mesin();
    ```

2. Apa yang terjadi secara desain jika ditambahkan method setMesin(Mesin mesin) pada class
Mobil? Apakah relasi ini akan tetap menjadi Composition? Jelaskan.  
Jawab:  
Dampaknya method setter akan merusak integritas desain Composition. Untuk relasi akan bergeser menjadi Aggregation. Setter memungkinkan objek Mesin di luar Mobil disuntikkan atau diganti kapan saja, sehingga lifecycle Mesin tidak lagi terikat eksklusif dengan Mobil

3. Bandingkan dengan Percobaan 1 (Laptop-Processor): sebutkan satu perbedaan baris kode yang
membuat salah satunya Aggregation dan yang lain Composition.  
Jawab:  
Aggregation (Percobaan 1): Objek part diterima lewat parameter constructor:
    ```java
    public Laptop(String merk, Processor proc) { this.proc = proc; }
    ```  

    Composition (Percobaan 5): Objek part diinstansiasi langsung menggunakan kata kunci new di dalam tubuh constructor:
    ```java
    public Mobil(String merek) { this.mesin = new Mesin(); }
    ```

4. Jika objek mobil di MainPercobaan5 di-set null setelah tampilkanInfo() dipanggil, apa yang terjadi pada objek Mesin miliknya? Bandingkan dengan nasib objek Processor pada Percobaan 1 seandainya objek Laptop-nya dihapus, apakah Processor tersebut masih bisa “diselamatkan” oleh kode lain? Kenapa Mesin tidak bisa?  
Jawab:  
Pada Percobaan 5: Objek Mesin akan otomatis kehilangan referensinya dan menjadi target pembersihan memori oleh Garbage Collector, karena tidak ada variabel lain di luar class Mobil yang menyimpan referensi ke objek Mesin tersebut.   
Pada Percobaan 1: Objek Processor tetap bertahan di memori meskipun objek laptop = null, karena sebelumnya telah dibuat di luar dan referensinya masih dipegang oleh variabel tersendiri (variabel p pada MainPercobaan1)

5. Coba (secara terpisah, boleh di file/package percobaan sendiri) tambahkan constructor kedua pada Mobil yang menerima parameter Mesin, mirip pola Percobaan 1: public Mobil(String merek, Mesin mesin) { this.merek = merek; this.mesin = mesin; }. Kalau constructor ini yang dipakai, apakah Mobil-Mesin berubah menjadi Aggregation? Jelaskan alasannya.  
Jawab:  
Ya, relasi berubah menjadi Aggregation. Ketika objek Mesin dibuat di luar class Mobil lalu dimasukkan melalui parameter constructor (constructor injection), objek Mesin tersebut memiliki lifecycle yang independen dan dapat eksis sebelum maupun sesudah objek Mobil dihancurkan.
--- 


## Percobaan  6: Dependency / Uses-A (Laptop Mencetak Dokumen ke Printer)    

### Kode program Laptop.java:  
 
```java
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
```

### Kode program Printer.java:  
 
```java
package jobsheet4.percobaan6;

public class Printer {
    private String merek;

    public Printer(String merek){
        this.merek = merek;
    }

    public void cetak(String namaFile){
        System.out.println("[" + merek + "] Mencetak " + namaFile + "...");
        System.out.println("[" + merek + "] Selesai.");
    }
}

```


### Kode program MainPercobaan6.java:  
 
```java
package jobsheet4.percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}
```

### Output program
```code
Thinkpad mengirim dokumen ke printer...
[Epson L3110] Mencetak Laporan.pdf...
[Epson L3110] Selesai.
```

### Pertanyaan Percobaan 6  

1. Apakah class Laptop pada percobaan ini memiliki atribut bertipe Printer? Bandingkan dengan Percobaan 1, di mana Processor disimpan sebagai atribut Laptop.  
Jawab:  
Pada Percobaan 6, class Laptop tidak memiliki atribut bertipe Printer.   
Berbeda dengan Percobaan 1, di mana Laptop menyimpan objek Processor ke dalam variabel instans/atribut (private Processor proc;), sehingga Laptop menyimpan state referensi ke Processor secara berkelanjutan.

2. Setelah method cetakDokumen() selesai dijalankan, apakah Laptop masih menyimpan referensi ke objek printer yang tadi dipakai? Jelaskan berdasarkan baris kode class Laptop.  
Jawab:  
Tidak, Laptop tidak menyimpan referensi tersebut. Parameter Printer printer pada method cetakDokumen(Printer printer, String namaFile) berstatus sebagai variabel lokal method. Begitu method selesai dieksekusi (scope method berakhir), seluruh variabel lokal di dalam stack frame akan dilepas dan Laptop tidak memiliki atribut penampung untuk mengingat objek printer tersebut.

3. Mengapa relasi Laptop-Printer pada percobaan ini disebut Dependency (uses-a), bukan Aggregation, meskipun sama-sama melibatkan dua objek yang saling berinteraksi?  
Jawab:  
Karena relasi ini bersifat sementara (transient). Class Laptop hanya menggunakan layanan dari class Printer saat operasi tertentu dijalankan saja (melalui parameter method), tanpa adanya kepemilikan struktur data (has-a) dalam bentuk atribut class.

4. Coba ubah kode Laptop supaya Printer disimpan sebagai atribut (mis. private Printer printerDefault, diisi lewat constructor atau setter, lalu dipakai kembali di cetakDokumen() tanpa parameter Printer). Apakah relasi ini sekarang berubah dari Dependency menjadi Aggregation? Jelaskan.  
Jawab:  
Ya, relasi tersebut berubah menjadi Aggregation.  Begitu Printer disimpan ke dalam variabel instans/atribut class Laptop dan disuplai dari luar (melalui constructor atau setter), hubungannya berubah dari sekadar menggunakan sesaat (uses-a) menjadi hubungan kepemilikan (has-a), di mana siklus hidup Printer tetap independen dari Laptop

--- 