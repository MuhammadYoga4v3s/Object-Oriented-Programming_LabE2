/* NamaFile  : Lingkaran.java
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/04/2025
 */

package Collection_3_4;

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
    
    // Fungsi untuk menghitung Luas dari Lingkaran
    @Override
    public double HitungLuas(){
        return 3.14 * jejari * jejari;
    }
}