/* NamaFile  : Asersi2.java
 * Deskripsi : Program untuk demo asersi yang menolak jari jaring lingkaran = 0
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 6/03/2025
 */

 // Class Lingkaran
class Lingkaran {
    /* ================= ATRIBUT ================= */
    private double jarijari;
    /* ================= METHOD ================== */
    // Konstruktor Lingkaran
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    // Menghitung jari jari lingkaran
    public double HitungKeliling(){
        return 2*Math.PI*this.jarijari;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        /* Kamus */
        Lingkaran L;
        double keliling;

        /* Algoritma */
        double jarijari = 0;
        assert(jarijari > 0) : "Jari Jari tidak boleh 0 ^^";
        L = new Lingkaran(jarijari);
        keliling = L.HitungKeliling();
        System.out.println("Keliling Lingkaran : "+keliling);
    }
}

class lingkaran {
    private double jarijari;
    public lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungkeliling(){
        double keliling = 2*Math.PI *jarijari;
        return keliling;
    }

}

/* Jawaban : Secara konsep, program Asersi2.java kurang tepat karena asersi dalam Java tidak aktif secara default dan hanya berjalan 
jika program dijalankan dengan opsi -ea (enable assertions), sehingga jika dijalankan tanpa opsi ini, asersi tidak akan berfungsi dan 
nilai 0 untuk jariJari tetap diterima meskipun seharusnya tidak diperbolehkan. Selain itu, program langsung menginisialisasi jariJari 
dengan 0, yang jelas tidak memenuhi kondisi assert(jariJari > 0), menyebabkan kegagalan saat dijalankan dengan java -ea Asersi2. 
Selain itu, pembuatan objek Lingkaran dilakukan sebelum validasi yang tepat, sehingga jika assert dinonaktifkan, 
objek tetap akan dibuat dengan nilai jariJari = 0, yang bertentangan dengan tujuan validasi. */