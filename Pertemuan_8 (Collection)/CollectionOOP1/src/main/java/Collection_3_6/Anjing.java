/* NamaFile  : Anjing.java
 * Deskripsi : Kelas anak untuk anjing, berisi Atribut dan Method Clas Anjing
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

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
    
    // Override method prosedur ShowAll, menampilkan info lengkap Anjing
    @Override
    public void ShowAll() {
        System.out.println("================ ANJING ================");
        super.ShowAll();
        System.out.println("================ ANJING ================");
    }
}