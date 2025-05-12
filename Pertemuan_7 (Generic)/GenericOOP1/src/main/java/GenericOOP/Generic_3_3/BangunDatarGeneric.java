/* NamaFile  : BangunDatarGeneric.java
 * Deskripsi : Berisi Kelas Konstruksi Generic untuk BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/04/2025
 */

package GenericOOP.Generic_3_3;

public class BangunDatarGeneric<T extends BangunDatar> {
    /*================================ ATRIBUT ===============================*/
    private T BangunDatar;
    /*================================ METHOD ================================*/
    // Prosedur untuk menetapkan Tipe Bangun datar dari object Generic 
    // BangunDatarGeneric
    public void setTipe(T TipeBangunDatar){
        this.BangunDatar = TipeBangunDatar;
    }
    
    // Fungsi untuk mendapatkan Tipe Bangun datar dari object Generic
    // BangunDatarGeneric, menghasilkan sebuah object
    public T getTipe(){
        return BangunDatar;
    }
    
    // Fungsi untuk menghitung Keliling Bangun datar dari object Generic
    // BangunDatarGeneric
    public double hitungKeliling(){
        return this.BangunDatar.HitungKeliling();
    }
}

