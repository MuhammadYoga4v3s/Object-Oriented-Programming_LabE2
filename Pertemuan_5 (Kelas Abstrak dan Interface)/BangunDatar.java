/*  Nama File   : BangunDatar.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatar
 *  Pembuat     : Muhammad Yoga Aminudin
 *  NIM         : 24060123130106
 *  Tanggal     : 22 Juni 2025
 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // Konstruktor default: menambah counter setiap objek dibuat
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Method abstrak untuk mendapatkan luas
    public abstract double getLuas();

    // Method abstrak untuk mendapatkan keliling
    public abstract double getKeliling();

    // Membandingkan apakah luas dua bangun datar sama
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Membandingkan apakah keliling dua bangun datar sama
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Menampilkan jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }

    // Getter untuk jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Setter untuk jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter untuk warna
    public String getWarna() {
        return warna;
    }

    // Setter untuk warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter untuk border
    public String getBorder() {
        return border;
    }

    // Setter untuk border
    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan informasi umum bangun datar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
