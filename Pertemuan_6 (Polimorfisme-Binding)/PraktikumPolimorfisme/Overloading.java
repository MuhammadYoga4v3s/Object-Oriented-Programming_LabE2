/* NamaFile  : Overloading.java
 * Deskripsi : Program untuk demo polimorfisme overloading di Java
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

// Kelas dasar abstrak untuk kupu-kupu
abstract class KupuKupu {
    // Method abstrak untuk gerakan kupu-kupu
    public abstract void Gerak();
}

// Kelas untuk tahap ulat (larva)
class Ulat extends KupuKupu {
    // Method untuk gerakan Ulat
    public void Gerak() {
        System.out.println("Merayap");
    }
    // Overloading method Gerak dengan parameter
    public void Gerak(String pohon, double jarak) {
        System.out.println("Merayap di Pohon " + pohon + ", Sejauh " + jarak);
    }
}

// Kelas untuk tahap kepompong
class Kepompong extends KupuKupu {
    // Method untuk gerakan kepompong
    public void Gerak() {
        System.out.println("Diam");
    }
}

// Kelas untuk tahap kupu-kupu dewasa
class KupuDewasa extends KupuKupu {
    // Method untuk gerakan KupuDewasa
    public void Gerak() {
        System.out.println("Terbang");
    }
    // Overloading method Gerak dengan parameter double
    public void Gerak(double jarakMeter) {
        System.out.println("Terbang " + jarakMeter + "M (desimal)");
    }
    // Overloading method Gerak dengan parameter int
    public void Gerak(int jarakMeter) {
        System.out.println("Terbang " + jarakMeter + "M (Eksak)");
    }
}

// Class utama untuk menjalankan program
public class Overloading {
    public static void main(String[] args) {
        // Membuat objek-objek
        Ulat ulat = new Ulat();
        Kepompong kepompong = new Kepompong();
        KupuDewasa kupu = new KupuDewasa();
        
        // Demo polimorfisme
        KupuKupu[] kupuKupu = new KupuKupu[3];
        kupuKupu[0] = ulat;
        kupuKupu[1] = kepompong;
        kupuKupu[2] = kupu;
        
        System.out.println("Demo Polimorfisme:");
        for (KupuKupu k : kupuKupu) {
            k.Gerak();  // Memanggil method yang sesuai dengan objek sebenarnya
        }
        
        // Demo overloading
        System.out.println("\nDemo Overloading:");
        ulat.Gerak("Mangga", 2.5);
        kupu.Gerak(10);
        kupu.Gerak(7.5);
    }
}

/*
1. Polimorfisme: Kemampuan objek untuk memiliki banyak bentuk
2. Overloading: Membuat beberapa method/fungsi dengan nama sama tapi parameter berbeda
*/