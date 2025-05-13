/* NamaFile  : Persegi.java
 * Deskripsi : Implementasi Persegi sebagai BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/04/2025
 */

package Collection_3_4;

public class Persegi extends BangunDatar{
    /*================================ ATRIBUT ===============================*/
    private double sisi;
    /*================================ METHOD ================================*/
    // Konstruktor Dengan Parameter Sisi
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    // Fungsi untuk menghitung Keliling dari Persegi
    @Override
    public double HitungKeliling(){
        return 4 * sisi;
    }
    
    // Fungsi untuk menghitung Luas dari Persegi
    @Override
    public double HitungLuas(){
        return sisi * sisi;
    }
}