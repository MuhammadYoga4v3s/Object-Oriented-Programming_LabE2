/* NamaFile  : MainKoleksi.java
 * Deskripsi : Kelas utama untuk demonstrasi penggunaan kelas generik Koleksi
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_5;

import java.util.HashMap;

public class MainKoleksi {
    public static void main(String[] args) {
        /* ================= DEMONSTRASI KOLEKSI DENGAN 10+ ELEMEN ================ */
        
        // 1. Koleksi Integer
        Koleksi<Integer> koleksiInt = new Koleksi<>(15);
        for (int i = 1; i <= 15; i++) {
            koleksiInt.add(i * 10);
        }
        System.out.println("\n=== Koleksi Integer ===");
        koleksiInt.showAll();
        
        // 2. Koleksi String
        Koleksi<String> koleksiStr = new Koleksi<>(12);
        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        for (String b : bulan) {
            koleksiStr.add(b);
        }
        System.out.println("\n=== Koleksi String (Bulan) ===");
        koleksiStr.showAll();
        
        // 3. Koleksi Double
        Koleksi<Double> koleksiDbl = new Koleksi<>(10);
        for (int i = 0; i < 10; i++) {
            koleksiDbl.add(Math.random() * 100);
        }
        System.out.println("\n=== Koleksi Double (Random) ===");
        koleksiDbl.showAll();
        
        // 4. Koleksi Character
        Koleksi<Character> koleksiChar = new Koleksi<>(13);
        for (char c = 'A'; c <= 'M'; c++) {
            koleksiChar.add(c);
        }
        System.out.println("\n=== Koleksi Character ===");
        koleksiChar.showAll();
        
        // 5. Koleksi Boolean
        Koleksi<Boolean> koleksiBool = new Koleksi<>(11);
        for (int i = 0; i < 11; i++) {
            koleksiBool.add(i % 3 == 0);
        }
        System.out.println("\n=== Koleksi Boolean ===");
        koleksiBool.showAll();
        
        /* ================= OPERASI PADA KOLEKSI ================ */
        // Demonstrasi operasi merge
        Koleksi<Integer> koleksi1 = new Koleksi<>(5);
        Koleksi<Integer> koleksi2 = new Koleksi<>(5);
        for (int i = 1; i <= 5; i++) {
            koleksi1.add(i);
            koleksi2.add(i * 10);
        }
        Koleksi<Integer> merged = koleksi1.merge(koleksi2);
        System.out.println("\n=== Hasil Merge ===");
        merged.showAll();
        
        // Demonstrasi operasi split
        Koleksi<Integer> split1 = new Koleksi<>(10);
        Koleksi<Integer> split2 = new Koleksi<>(10);
        merged.split(3, split1, split2);
        System.out.println("\n=== Hasil Split ===");
        System.out.println("Split 1:");
        split1.showAll();
        System.out.println("\nSplit 2:");
        split2.showAll();
        
        // Demonstrasi operasi delete
        koleksiStr.delete(5); // Menghapus bulan Juni
        System.out.println("\n=== Koleksi String setelah delete ===");
        koleksiStr.showAll();
    }
}