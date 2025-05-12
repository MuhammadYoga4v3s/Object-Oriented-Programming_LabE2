/* NamaFile  : Lingkaran.java
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/04/2025
 */

package GenericOOP.Generic_3_3;

public class Lingkaran extends BangunDatar{
    /*================================ ATRIBUT ===============================*/
    private double jejari;
    /*================================ METHOD ================================*/
    // Konstruktor Dengan Parameter Jari-Jari
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    // Fungsi untuk menghitung Keliling dari Lingkaran
    @Override
    public double HitungKeliling(){
        return 2*jejari*3.14;
    }
}
