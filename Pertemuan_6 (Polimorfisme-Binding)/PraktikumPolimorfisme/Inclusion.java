/* NamaFile  : Coercion.java
 * Deskripsi : Program untuk mendemonstrasikan konsep casting dan coercion di Java
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

// Kelas dasar untuk kendaraan
class Vehicle {
    // Method menghitung harga sewa dasar
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle Price = " + fare);
    }
}

// Kelas turunan untuk mobil
class Car extends Vehicle {
    // Override method calRent untuk mobil
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga Sewa Mobil = " + fare);
    }
}

// Kelas turunan untuk bus
class Bus extends Vehicle {
}

public class inclusion {
    public static void main(String[] args) {
        // Polimorfisme inclusion - semua objek dianggap sebagai Vehicle
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();  // Coercion: Car dianggap sebagai Vehicle
        Vehicle bis = new Bus();    // Coercion: Bus dianggap sebagai Vehicle
        
        // Memanggil method dengan parameter sama
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);      // Akan memanggil versi Car
        bis.calRent(50, 1000);        // Akan memanggil versi Vehicle (karena tidak dioverride)
        
        // Demo method hitungSewa dengan polimorfisme Inclusion
        System.out.println("\nDemo hitungSewa:");
        hitungSewa(kendaraan, 50, 1000);
        hitungSewa(mobil, 50, 1000);
        hitungSewa(bis, 50, 1000);
    }
    
    // Method yang memanfaatkan polimorfisme inclusion
    static void hitungSewa(Vehicle v, int jarak, float harga) {
        System.out.print("Menghitung sewa: ");
        v.calRent(jarak, harga);
    }
}

/*
Analisis Keuntungan Polimorfisme Inclusion:
1. Method hitungSewa bisa menerima semua subclass Vehicle sehingga
Tidak perlu buat method terpisah untuk setiap jenis kendaraan
serta Bisa tambah jenis kendaraan baru tanpa ubah method hitungSewa
dan Mengurangi duplikasi kode
*/