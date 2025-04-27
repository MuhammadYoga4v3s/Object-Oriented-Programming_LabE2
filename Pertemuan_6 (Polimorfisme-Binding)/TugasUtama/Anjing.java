/* NamaFile  : Anjing.java
 * Deskripsi : Kelas anak untuk anjing, berisi Atribut dan Method Clas Anjing
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

public class Anjing extends Anabul {
    /* ==================================== METHOD ===================================== */
    // Konstruktor Anjing
    public Anjing(String nama) {
        super(nama);
    }
    
    // Override method prosedur bergerak, menampilkan cara anjing bersuara
    @Override
    public void bersuara() {
        System.out.println("Guk-guk!");
    }
    
    // Override method prosedur bergerak, menampilkan cara anjing bergerak
    @Override
    public void bergerak() {
        System.out.println("Melata dengan lincah");
    }
    
    // Override method prosedur tampilInfo, menampilkan info lengkap Anjing
    @Override
    public void tampilInfo() {
        System.out.println("===== ANJING =====");
        super.tampilInfo();
    }
}