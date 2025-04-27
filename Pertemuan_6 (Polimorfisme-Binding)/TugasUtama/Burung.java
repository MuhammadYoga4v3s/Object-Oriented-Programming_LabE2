/* NamaFile  : Burung.java
 * Deskripsi : Kelas anak untuk burung, berisi Atribut dan Method Class Burung
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

public class Burung extends Anabul {
    /* ==================================== METHOD ===================================== */
    // Konstruktor Burung
    public Burung(String nama) {
        super(nama);
    }
    
    // Override method prosedur bergerak, menampilkan cara burung bersuara
    @Override
    public void bersuara() {
        System.out.println("Cuit!");
    }
    
    // Override method prosedur bergerak, menampilkan cara burung bergerak
    @Override
    public void bergerak() {
        System.out.println("Terbang dengan indah");
    }
    
    // Override method prosedur tampilInfo, menampilkan info lengkap burung
    @Override
    public void tampilInfo() {
        System.out.println("===== BURUNG =====");
        super.tampilInfo();
    }
}