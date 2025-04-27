/* NamaFile  : Manajer.java
 * Deskripsi : Berisi Method dan Atribut dari Class Manajer
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

 public class Manajer extends Pegawai{
    /* =================================== ATRIBUT ===================================== */
    private final int Tunjangan = 700000;
    /* ==================================== METHOD ===================================== */
    // Konstruktor Manajer
    public Manajer(String Nama){
        super.setNama(Nama);
    }
    // Prosedur untuk menampilkan keseluruhan data Manajer
    public void tampildata(){
        super.tampildata();
        System.out.println("Tunjangan\t : " + this.Tunjangan);
    }
}