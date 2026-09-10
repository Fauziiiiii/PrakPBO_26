# Praktikum Pemrograman Berbasis Objek – Pertemuan 2   
##  Kelas dan Objek  



> Nama   : Muhammad Fauzi Fadillah
>
> NIM    : 254107020085
>
> Kelas  : TI_2G

---

# C. Langkah Kerja

### Kode program Rectangle.java:  
 
```java
package jobsheet2.id.ac.polinema;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    int area() {
        return width * height; 
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```

### Kode program Student.java:  
 
```java
package jobsheet2.id.ac.polinema;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    Student(String name, String studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String describe(){
        return name + " (" + studentId + ", GPA: " + gpa + ") ";
    }
}

```


### Kode program Main.java:   
```java
package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);
        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " +original.area());
        System.out.println("Via copy: " + copy.area());

        System.out.println();
        
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 2);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }

        System.out.println();

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());
    }
}
```

### Output program
```code
Area: 24
Via original: 40
Via copy: 40

Area: 24, Perimeter: 20
Area: 6, Perimeter: 10
Area: 16, Perimeter: 20

Nadia (S001, GPA: 3.8) 
```


# Latihan

### Kode program Circle.java
```java
package jobsheet2.id.ac.polinema;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }

    double circumference(){
        return 2 * Math.PI * radius;
    }
}

```

### Kode program Main.java
```code
package jobsheet2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        double radius = 5;
        Circle c = new Circle(radius);
        System.out.println("Circle Area (radius: " + radius + "): " + c.area());
        System.out.println("Circle Circumference (radius: " + radius + "): " + c.circumference());
    }
}
```


### Output program
```code
Circle Area (radius: 5.0): 78.53981633974483
Circle Circumference (radius: 5.0): 31.41592653589793
```