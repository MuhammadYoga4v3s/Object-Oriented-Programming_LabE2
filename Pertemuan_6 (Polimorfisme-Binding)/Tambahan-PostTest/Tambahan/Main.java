/* NamaFile  : Main.java
 * Deskripsi : Program untuk demo polimorfisme overloading di Java
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

public class Main{
    public static void main(String[] args) {
        Person P;
        P = new Student("Sally");
        P.status(1);
    }
}

/* Program di atas mendemonstrasikan konsep polimorfisme dinamis dalam Java, 
di mana method yang dieksekusi ditentukan pada runtime berdasarkan tipe aktual objek, 
bukan tipe referensinya. Ketika kita membuat objek Student "Sally" 
dan menyimpannya dalam variabel bertipe Person, lalu memanggil method status(1), 
yang terjadi adalah:
method status() dari kelas Person dipanggil karena tipe referensi adalah Person. 
Namun, di dalam method status() terdapat pemanggilan this.isAsleep(hr) 
di mana this mengacu pada objek aktual yaitu Student. 
Inilah yang disebut runtime polymorphism - 
meskipun secara deklaratif memanggil method dari Person, 
Java secara cerdas mengetahui bahwa objek sebenarnya adalah Student sehingga 
memanggil override method isAsleep() dari kelas Student. */