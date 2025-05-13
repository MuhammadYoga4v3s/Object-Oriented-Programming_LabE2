/* NamaFile  : PersegiPanjang.java
 * Deskripsi : Implementasi Persegi Panjang sebagai BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/04/2025
 */

package Collection_3_4;

public class PersegiPanjang extends BangunDatar {
    /*================================ ATRIBUT ===============================*/
    private double panjang;
    private double lebar;
    /*================================ METHOD ================================*/
    // Konstruktor Dengan Parameter Panjang dan Lebar
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Fungsi untuk menghitung Keliling dari Persegi Panjang
    @Override
    public double HitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    // Fungsi untuk menghitung Luas dari Persegi Panjang
    @Override
    public double HitungLuas() {
        return panjang * lebar;
    }
}