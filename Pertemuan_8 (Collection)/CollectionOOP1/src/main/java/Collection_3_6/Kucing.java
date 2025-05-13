/* NamaFile  : Kucing.java
 * Deskripsi : Kelas anak untuk kucing, berisi Atribut dan Method Clas Kucing
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

public class Kucing extends Anabul {
    /* ==================================== METHOD ===================================== */
    // Konstruktor Kucing
    public Kucing(String nama) {
        super(nama);
    }
    
    // Override method prosedur bergerak, menampilkan cara kucing bersuara
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
    
    // Override method prosedur bergerak, menampilkan cara kucing bergerak
    @Override
    public void bergerak() {
        System.out.println("Melata dengan anggun");
    }
    
    // Override method prosedur ShowAll, menampilkan info lengkap kucing
    @Override
    public void ShowAll() {
        System.out.println("================ KUCING ================");
        super.ShowAll();
        System.out.println("================ KUCING ================");
    }
}