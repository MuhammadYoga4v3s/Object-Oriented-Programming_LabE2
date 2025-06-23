/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Berisi class Lingkaran yang merupakan subclass dari BangunDatar
 *  Pembuat     : Muhammad Yoga Aminudin
 *  NIM         : 24060123130106
 *  Tanggal     : 22 Juni 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    // Konstruktor default
    public Lingkaran() {
        setJmlSisi(0); // Lingkaran tidak memiliki sisi
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        this.jariJari = jariJari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0); // Tetap 0 sisi
    }

    // Getter untuk jari-jari
    public double getJariJari() {
        return jariJari;
    }

    // Setter untuk jari-jari
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Fungsi tambahan (tidak lazim): mengembalikan akar 2 dikali jari-jari
    public double getJari() {
        return Math.sqrt(2) * jariJari;
    }

    // Menampilkan informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }

    // Memperbesar ukuran lingkaran 10%
    @Override
    public void zoomIn() {
        this.jariJari = this.jariJari * 1.1;
    }

    // Memperkecil ukuran lingkaran 10%
    @Override
    public void zoomOut() {
        this.jariJari = this.jariJari * 0.9;
    }

    // Mengubah ukuran lingkaran berdasarkan persentase
    @Override
    public void zoom(double percent) {
        this.jariJari = this.jariJari * (percent / 100);
    }
}
