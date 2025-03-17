/* NamaFile  : BangunDatar.java
 * Deskripsi : Berisi Atribut dan Method dari subclass Bangundatar, Persegi
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 13/03/2025
 */

 public class Persegi extends BangunDatar {
    /* ================================= ATRIBUT ===================================== */
    private double Sisi;

    /* ================================= KONSTRUKTOR ===================================== */
    // Konstruktor tanpa parameter
    public Persegi() {
    }

    // Konstruktor dengan parameter
    public Persegi(double Sisi, String Warna, String Border) {
        super(4, Warna, Border); 
        this.Sisi = Sisi;
    }

    /* ================================= METHOD ===================================== */
    // Method untuk mendapatkan panjang sisi
    public double getSisi() {
        return this.Sisi;
    }

    // Method untuk mengatur panjang sisi
    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }

    // Method untuk menghitung luas persegi
    public double getLuas() {
        return this.Sisi * this.Sisi; // Rumus luas persegi: sisi * sisi
    }

    // Method untuk menghitung keliling persegi
    public double getKeliling() {
        return 4 * this.Sisi; // Rumus keliling persegi: 4 * sisi
    }

    // Method untuk menghitung diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2 * this.Sisi * this.Sisi); // Rumus diagonal persegi: √(2 * sisi^2)
    }

    /* ================================= OVERRIDE METHOD ===================================== */
    // Override method PrintInfo dari superclass (BangunDatar)
    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Panjang Sisi Persegi : " + this.getSisi()); 
    }
}