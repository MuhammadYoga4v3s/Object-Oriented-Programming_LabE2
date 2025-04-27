/* NamaFile  : Anabul.java
 * Deskripsi : Kelas induk untuk hewan peliharaan, berisi Atribut dan Method Clas Anabul
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

 public class Anabul {
    /* =================================== ATRIBUT ===================================== */
    private String nama;
    
    /* ==================================== METHOD ===================================== */
    // Konstruktor Anabul
    public Anabul(String nama) {
        this.nama = nama;
    }
    // Prosedur untuk menunjukkan bagaimana Anabul bersuara
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    // Prosedur untuk menunjukkan bagaimana Anabul bergerak
    public void bergerak() {
        System.out.println("Hewan bergerak");
    }
    // Prosedur untuk menunjukkan info lengkap anabul
    public void tampilInfo() {
        System.out.println("Nama\t: " + this.nama);
        this.bersuara();
        this.bergerak();
    }
}