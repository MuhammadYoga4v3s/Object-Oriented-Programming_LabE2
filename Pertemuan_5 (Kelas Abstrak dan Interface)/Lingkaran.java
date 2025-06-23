/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Berisi class Lingkaran yang merupakan subclass dari BangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double jariJari, String warna, String border) {
        this.jariJari = jariJari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getJari(){
        return Math.sqrt(2) * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        this.jariJari = this.jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        this.jariJari = this.jariJari * 0.9;
    }

    @Override
    public void zoom(double percent) {
        this.jariJari = this.jariJari * (percent / 100);
    }
}