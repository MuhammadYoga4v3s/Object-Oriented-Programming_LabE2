/*  Nama File   : Persegi.java
 *  Deskripsi   : Berisi class Persegi yang merupakan subclass dari BangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas Persegi: " + getLuas());
        System.out.println("Keliling Persegi: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    @Override
    public void zoom(double percent) {
        this.sisi = this.sisi * (percent / 100);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }
}