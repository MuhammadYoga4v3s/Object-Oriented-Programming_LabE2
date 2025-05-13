/* NamaFile  : Segitiga.java
 * Deskripsi : Implementasi Segitiga sebagai BangunDatar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/04/2025
 */

package Collection_3_4;

public class Segitiga extends BangunDatar {
    /*================================ ATRIBUT ===============================*/
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    /*================================ METHOD ================================*/
    // Konstruktor 1: Untuk segitiga sembarang (3 sisi)
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    // Konstruktor 2: Untuk segitiga dengan alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    // Fungsi untuk menghitung Keliling dari Segitiga
    @Override
    public double HitungKeliling() {
        if (alas != 0 && tinggi != 0) {
            // Asumsi segitiga siku-siku jika hanya alas dan tinggi yang diberikan
            double sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);
            return alas + tinggi + sisiMiring;
        } else {
            return sisi1 + sisi2 + sisi3;
        }
    }
    
    // Fungsi untuk menghitung Luas dari Segitiga
    @Override
    public double HitungLuas() {
        if (alas != 0 && tinggi != 0) {
            return (alas * tinggi) / 2;
        } else {
            // Menggunakan rumus Heron jika yang diketahui hanya sisi-sisinya
            double s = (sisi1 + sisi2 + sisi3) / 2;
            return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
        }
    }
}