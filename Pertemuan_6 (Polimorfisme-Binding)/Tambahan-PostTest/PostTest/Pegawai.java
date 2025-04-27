/* NamaFile  : Pegawai.java
 * Deskripsi : Berisi Method dan Atribut dari Class Pegawai
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

public class Pegawai{
    /* =================================== ATRIBUT ===================================== */
    private String Nama;
    private final int Gajipokok = 5000000;
    /* ==================================== METHOD ===================================== */
    // Prosedur untuk menetapkan nama dari pegawai
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    // Prosedur untuk menampilkan keseluruhan data Pegawai
    public void tampildata(){
        System.out.println("Nama : " + this.Nama + ", Gaji Pokok : " + this.Gajipokok);
    }
}