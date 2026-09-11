# Praktikum Pemrograman Berbasis Objek – Pertemuan 3   
##  Ennkapsulasi  



> Nama   : Muhammad Fauzi Fadillah
>
> NIM    : 254107020085
>
> Kelas  : TI_2G

---

# 3. Percobaan  

## 3.1 Percobaan 1 - Enkapsulasi

### Kode program Motor.java:  
 
```java
package jobsheet3.MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}

```

### Kode program MotorDemo.java:  
 
```java
package jobsheet3.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
```

### Output program
```code
Kontak Off
Kecepatan: 0
```

--- 

## 3.2 Percobaan 2 - Access Modifier

### Kode program Motor.java:  
 
```java
package jobsheet3.MotorEncapsulation;

public class Motor {
    private  int kecepatan = 0;
    private  boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if (kontakOn == true) {
            kecepatan += 5;
        }else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else {
            System.out.println("Kecepatan tidak bis berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}
```

### Kode program MotorDemo.java

```java
package jobsheet3.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
```

### Output program

```code
Kontak Off
Kecepatan: 0

Kecepatan tidak bisa bertambah karena Mesin Off! 

Kontak On
Kecepatan: 0

Kontak On
Kecepatan: 5

Kontak On
Kecepatan: 10

Kontak On
Kecepatan: 15

Kontak Off
Kecepatan: 0
```


### Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?  
Jawab:  
Karena terdapat kondisi variable kontakOn harus true, jika tidak maka menjalankan output peringatan tersebut  
2. Mengapa atribut kecepatan dan kontakOn diset private?  
Jawab:  
Agar tidak bisa diakses atau modif oleh class lain. Atributny juga seharusnya diubah/modif melalui method-method tertentu
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!  
Jawab:  
Update kode program Motor.java:  
```java
public void tambahKecepatan(){
        if (kontakOn == true) {
            if(kecepatan >= kecepatanMaks){
                System.out.println("Kecepatan sudah mencapai batas maksimum(100)");
            }else{
                kecepatan += 50;
            }
        }else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
```

Output program:  
```code
Kontak Off
Kecepatan: 0

Kecepatan tidak bisa bertambah karena Mesin Off! 

Kontak On
Kecepatan: 0

Kontak On
Kecepatan: 50

Kontak On
Kecepatan: 100

Kecepatan sudah mencapai batas maksimum(100)
Kontak On
Kecepatan: 100

Kecepatan sudah mencapai batas maksimum(100)
Kontak On
Kecepatan: 100

Kontak Off
Kecepatan: 0
```

---

## 3.4 Percobaan 3 - Access Modifier

### Kode program Anggota.java:  
 
```java
package jobsheet3.KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public float getSimpanan(){
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }

    public void pinjam(float uang){
        simpanan -= uang;
    }
}
```

### Kode program KoperasiDemo.java

```java
package jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
    }
}
```

### Output program

```code
Simpanan Iwan Setiawan : Rp100000.0
Simpanan Iwan Setiawan : Rp95000.0
```

---

## 3.5 Percobaan 4 - Konstruktor, Instansiasi

### Kode program Anggota.java
```java
package jobsheet3.KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public float getSimpanan(){
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }

    public void pinjam(float uang){
        simpanan -= uang;
    }
}
```

### Kode program KoperasiDemo.java

```java
package jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
        
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
    }
}
```

### Output program

```code
Simpanan Iwan : Rp0.0
Simpanan Iwan Setiawan : Rp100000.0
Simpanan Iwan Setiawan : Rp95000.0
```

---

## 3.6 Pertanyaan Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?  
Jawab:  
Getter adalah method untuk mengamnbil data berupa atribut yang diset private, sedangkan Setter sama tetapi tidak mengambil melainkan mengubah
2. Apa kegunaan dari method getSimpanan()?  
Jawab:  
untuk mengambil data atribut simpanan yang private, jadi atribut tersebut bisa diakses melalui method getter itu.
3. Method apa yang digunakan untuk menambah saldo?  
Jawab:  
Method setor, dengan menambahkan atribut simpanan dengan uang yang akan masuk
4. Apa yang dimaksud konstruktor?  
Jawab:  
method khusus untuk set atribut melalui parameter saat instansiasi objek kepada class tersebut
5. Sebutkan aturan dalam membuat konstruktor?  
Jawab:  
Nama class nya sama, tidak boleh return value
6. Apakah boleh konstruktor bertipe private?  
Jawab:  
boleh, tetapi hanya bisa digunakan di dalam class tersebut
7. Kapan menggunakan konstruktor dengan passing parameter?  
Jawab:  
ketika ingin set data langsung saat pembuatan objek
8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?  
Jawab:  
inisialisasi hanya memberik tipe data dan nama atribut, sedangkan instansiasi memberikan value nya sekaligus
9. Apa perbedaan inisialisasi method dan instansiasi method?  
Jawab:  
istilah tersebut digunakan untuk variable atau objek. 



# Tugas

## 1. Cobalah program dibawah ini dan tuliskan hasil outputnya  

### Kode program EncapDemo.java
```java
package jobsheet3.Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > 30){
            age = 30;
        }else{
            age = newAge;
        }
    }
}
```

### Kode program Main.java
```code
package jobsheet3.Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
```


### Output program
```code
Name : James
Age  : 30
```

--- 

## 2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

Jawab:  
Karena method setAge akan cek terlebih dahulu parameternya(newAge) apakah lebih besar dari 30, jika true maka age akan diubah ke 30. jika tidak maka akan sesuai dengan parameter nya.

---

## 3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

### Kode program EncapDemo.java
```java
package jobsheet3.Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > 30){
            age = 30;
        }else if(newAge < 18){
            age = 18;
        }else{
            age = newAge;
        }
    }
}
```

### Output program

```code
Name : James
Age  : 30

Name : Yaseri
Age  : 18
```

---

## 4. Sistem gudang kargo ekspedisi

### Kode program Kotainer.java

```java
package jobsheet3.Tugas;

public class Kontainer {
    private String id;
    private String namaPemilik;
    private double beratMuatan = 0;
    private double kapasitasMaks;

    public Kontainer(String id, String namaPemilik, double kapasitasMaks){
        this.id = id;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaks = kapasitasMaks;
    }
    
    public String getIdKontainer(){
        return id;
    }
    
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getBeratMuatanSaatIni(){
        return beratMuatan;
    }   

    public double getKapasitasMaksimal(){
        return  kapasitasMaks;
    }

    public void tambahMuatan(double tambahMuatan){
        if(beratMuatan + tambahMuatan > kapasitasMaks){
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }else{
            beratMuatan += tambahMuatan;
        }
    }

    public void turunkanMuatan(double turunMuatan){
        if(turunMuatan > beratMuatan){
            System.out.println("Maaf, berat muatan yang diturunkan tidak boleh melebihi muatan saat ini.");
        }else{
            beratMuatan -= turunMuatan;
        }
    }
}
```

### Kode program TestLogistik.java

```java
package jobsheet3.Tugas;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Sendiri", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        kontainerAlfa.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        kontainerAlfa.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.println("\nMembongkar muat/menurunkan barang seberat 1500 kg...");
        kontainerAlfa.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
```

### Output program

```code
Nama Pemilik Kontainer: PT. Maju Sendiri
Kapasitas Maksimal: 5000.0 kg

Memasukkan muatan baru seberat 6.000 kg...
Maaf, berat muatan melebihi kapasitas maksimal kontainer.
Berat muatan saat ini: 0.0 kg

Memasukkan muatan baru seberat 4.000 kg...
Berat muatan saat ini: 4000.0 kg

Membongkar muat/menurunkan barang seberat 500 kg...
Berat muatan saat ini: 3500.0 kg

Membongkar muat/menurunkan barang seberat 1500 kg...
Berat muatan saat ini: 2000.0 kg
```

## 5. Modifikasi soal kargo logistik di atas agar nominal berat muatan yang dibongkar/diturunkan dalam satu kali pemanggilan method turunkanMuatan() maksimal hanya boleh sebesar 50% dari total berat muatan saat ini.

### Update kode program Kontainer.java

```java
public void turunkanMuatan(double turunMuatan){
    double maksTurunMuatan = beratMuatan / 2;
    
    if(turunMuatan > maksTurunMuatan){
        System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!.");
    }else{
        beratMuatan -= turunMuatan;
    }
}
```


### Update kode program TestLogistik.java

```java
package jobsheet3.Tugas;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Sendiri", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        kontainerAlfa.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        kontainerAlfa.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.println("\nMembongkar muat/menurunkan barang seberat 1500 kg...");
        kontainerAlfa.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 2100 kg...");
        kontainerAlfa.turunkanMuatan(2100);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
```

### Output program

```code
Nama Pemilik Kontainer: PT. Maju Sendiri
Kapasitas Maksimal: 5000.0 kg

Memasukkan muatan baru seberat 6.000 kg...
Maaf, berat muatan melebihi kapasitas maksimal kontainer.
Berat muatan saat ini: 0.0 kg

Memasukkan muatan baru seberat 4.000 kg...
Berat muatan saat ini: 4000.0 kg

Membongkar muat/menurunkan barang seberat 500 kg...
Berat muatan saat ini: 3500.0 kg

Membongkar muat/menurunkan barang seberat 1500 kg...
Berat muatan saat ini: 2000.0 kg

Membongkar muat/menurunkan barang seberat 2100 kg...
Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!.
Berat muatan saat ini: 2000.0 kg
```


## 6. Modifikasi kelas Main TestLogistik agar parameter jumlah berat barang yang dimasukkan (tambahMuatan) maupun berat barang yang dibongkar (turunkanMuatan) dapat menerima input nilai dinamis dari pengguna secara interaktif melalui terminal menggunakan utilitas java.util.Scanner.

### Modif kode program TestLogistik.java

```java
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
    }
}
```

### Output program

```code
=== SISTEM MANAJEMEN LOGISTIK KONTAINER ===
ID Kontainer           : REQ-9988
Nama Pemilik Kontainer : PT. Maju Sendiri
Kapasitas Maksimal     : 5000.0 kg

------------------------------------------
Berat Muatan Saat Ini: 0.0 kg
PILIH OPERASI:
1. Tambah Muatan
2. Turunkan Muatan
3. Keluar
Pilihan Anda (1-3): 1
Masukkan berat muatan yang akan ditambahkan (kg): 6000
Maaf, berat muatan melebihi kapasitas maksimal kontainer.

------------------------------------------
Berat Muatan Saat Ini: 0.0 kg
PILIH OPERASI:
1. Tambah Muatan
2. Turunkan Muatan
3. Keluar
Pilihan Anda (1-3): 1
Masukkan berat muatan yang akan ditambahkan (kg): 4000

------------------------------------------
Berat Muatan Saat Ini: 4000.0 kg
PILIH OPERASI:
1. Tambah Muatan
2. Turunkan Muatan
3. Keluar
Pilihan Anda (1-3): 2
Masukkan berat muatan yang akan diturunkan (kg): 2500
Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!.

------------------------------------------
Berat Muatan Saat Ini: 4000.0 kg
PILIH OPERASI:
1. Tambah Muatan
2. Turunkan Muatan
3. Keluar
Pilihan Anda (1-3): 2
Masukkan berat muatan yang akan diturunkan (kg): 1700

------------------------------------------
Berat Muatan Saat Ini: 2300.0 kg
PILIH OPERASI:
1. Tambah Muatan
2. Turunkan Muatan
3. Keluar
Pilihan Anda (1-3): 3
Terima kasih, program selesai.
```

## 7. Aplikasi pemesanan tiket bioskop

### Kode program Tiket.java
```java
package jobsheet3.Tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        

        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        

        this.statusPembayaran = false;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}
```

### Kode program TestBioskop.java

```java
package jobsheet3.Tugas;

public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.isStatusPembayaran());
    }
}
```

### Output program  
```code
Film: Avengers: Endgame
Harga Tiket: 35000.0
Status Lunas? false

Memproses pembayaran...
Status Lunas Terbaru? true
```