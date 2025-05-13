/* NamaFile  : Anabul.java
 * Deskripsi : Kelas induk untuk hewan peliharaan, berisi Atribut dan Method Clas Anabul
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

 public class Anabul {
    /* =================================== ATRIBUT ===================================== */
    private String nama;
    
    /* ==================================== METHOD ===================================== */
    // Konstruktor Anabul
    public Anabul(String nama) {
        this.nama = nama;
    }
    // Fungsi untuk mendapatkan Nama Anabul
    public String getNama() {
        return this.nama;
    }
    // Prosedur untuk menunjukkan bagaimana Anabul bersuara
    public void bersuara() {
        System.out.println("=========== " + this.getClass().getName() + " bersuara ===========");
    }
    // Prosedur untuk menunjukkan bagaimana Anabul bergerak
    public void bergerak() {
        System.out.println("=========== " + this.getClass().getName() + " bergerak ===========");
    }
    // Prosedur untuk menunjukkan info lengkap anabul
    public void ShowAll() {
        System.out.println("Nama\t: " + this.nama);
        this.bersuara();
        this.bergerak();
    }
}