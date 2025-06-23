/*  Nama File   : Persegi.java
 *  Deskripsi   : Berisi class Persegi yang merupakan subclass dari BangunDatar
 *  Pembuat     : Muhammad Yoga Aminudin
 *  NIM         : 24060123130106
 *  Tanggal     : 22 Juni 2025
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter sisi, warna, dan border
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter sisi
    public double getSisi() {
        return sisi;
    }

    // Setter sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menghitung panjang diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    // Menampilkan informasi persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas Persegi: " + getLuas());
        System.out.println("Keliling Persegi: " + getKeliling());
    }

    // Memperbesar ukuran persegi 10%
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    // Memperkecil ukuran persegi 10%
    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    // Mengubah ukuran persegi berdasarkan persentase
    @Override
    public void zoom(double percent) {
        this.sisi = this.sisi * (percent / 100);
    }

    // Menampilkan jumlah objek bangun datar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }
}
