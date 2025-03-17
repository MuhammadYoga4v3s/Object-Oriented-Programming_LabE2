/* NamaFile  : Lingkaran.java
 * Deskripsi : Beirisi Atribut dan ethod dari subclass Bangundatar, Lingkaran
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 13/03/2025
 */

public class Lingkaran extends BangunDatar {
    /* ================================= ATRIBUT ===================================== */
    private double Jari2;

    /* ================================= KONSTRUKTOR ===================================== */
    // Konstruktor tanpa parameter
    public Lingkaran() {
    }
    // Konstruktor dengan parameter
    public Lingkaran(double Diameter, String Warna, String Border) {
        super(1, Warna, Border);
        this.Jari2 = Diameter / 2;
    }

    /* ================================= METHOD ===================================== */
    // Method untuk mendapatkan nilai jari-jari
    public double getJari2() {
        return this.Jari2;
    }
    // Method untuk mendapatkan nilai diameter
    public double getDiameter() {
        return 2 * this.Jari2; // Diameter = 2 * jari-jari
    }

    // Method untuk mengatur nilai jari-jari
    public void setJari2(double Jari2) {
        this.Jari2 = Jari2;
    }

    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return this.Jari2 * this.Jari2 * Math.PI; // Rumus luas lingkaran: π * r^2
    }
    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * this.Jari2 * Math.PI; // Rumus keliling lingkaran: 2 * π * r
    }

    /* ================================= OVERRIDE METHOD ===================================== */
    // Override method PrintInfo dari superclass (BangunDatar)
    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Jari-jari lingkaran : " + this.getJari2()); 
    }
}