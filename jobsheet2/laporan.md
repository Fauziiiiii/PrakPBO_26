# Praktikum Pemrograman Berbasis Objek – Pertemuan 2   
##  Kelas dan Objek  



> Nama   : Muhammad Fauzi Fadillah
>
> NIM    : 254107020085
>
> Kelas  : TI_2G

---

# C. Langkah Kerja

### Langkah 2: Kelas Rectangle minimal dan objek pertama

Kode program Rectangle.java:   
```java
package jobsheet2.id.ac.polinema;

public class Rectangle {
    int width;
    int height;
}
```


Kode program Main.java:   
```java
package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 6;
        r.height = 4;

        System.out.println("Rectangle " + r.width + "x" + r.height);
    }
}
```

Output:  
```code
Rectangle 6x4
```


### Langkah 3 & 4:


