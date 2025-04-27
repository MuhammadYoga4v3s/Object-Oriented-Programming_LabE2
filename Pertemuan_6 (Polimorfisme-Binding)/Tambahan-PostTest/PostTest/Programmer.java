/* NamaFile  : Programmer.java
 * Deskripsi : Berisi Method dan Atribut dari Class Programmer
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

 public class Programmer extends Pegawai{
    /* =================================== ATRIBUT ===================================== */
    private final int Bonus = 450000;
    /* ==================================== METHOD ===================================== */
    // Konstruktor Programmer
    public Programmer(String Nama){
        super.setNama(Nama);
    }
    // Prosedur untuk menampilkan keseluruhan data Programmer
    public void tampildata(){
        super.tampildata();
        System.out.println("Bonus\t : " + this.Bonus);
    }
}