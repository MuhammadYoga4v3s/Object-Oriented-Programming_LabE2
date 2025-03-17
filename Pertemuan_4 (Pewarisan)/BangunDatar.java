/* NamaFile  : BangunDatar.java
 * Deskripsi : Menunjukkan hubungan pewarisan sederhana dari sebuah bangun datar
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 13/03/2025
 */

 public class BangunDatar {
    /* ================================= ATRIBUT ===================================== */
    protected String Warna;
    protected String Border;
    protected int Jmlsisi;
    protected static int CounterBangundatar;

    /* ================================= KONSTRUKTOR ===================================== */
    // Konstruktor tanpa parameter
    public BangunDatar() {
        CounterBangundatar++;
    }
    // Konstruktor dengan parameter
    public BangunDatar(int JmlhSisi, String Warna, String Border) {
        this.Jmlsisi = JmlhSisi;
        this.Warna = Warna;
        this.Border = Border; 
        CounterBangundatar++;
    }

    /* ================================= METHOD ===================================== */
    // Method untuk mendapatkan jumlah objek BangunDatar yang telah dibuat
    public static int printJlmhBangunDatar() {
        return CounterBangundatar;
    }

    // Method untuk mendapatkan jumlah sisi
    public int getJumlahSisi() {
        return this.Jmlsisi;
    }
    // Method untuk mendapatkan warna
    public String getWarna() {
        return this.Warna;
    }
    // Method untuk mendapatkan warna border
    public String getBorder() {
        return this.Border;
    }

    // Method untuk mengatur jumlah sisi
    public void setJumlahSisi(int Sisi) {
        if (Sisi <= 0) {
            System.out.println("Bangun datar harus memiliki setidaknya 1 sisi\n");
        } else {
            this.Jmlsisi = Sisi;
        }
    }

    // Method untuk mengatur warna
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    // Method untuk mengatur warna border
    public void setBorder(String Border) {
        this.Border = Border;
    }

    // Method untuk mencetak informasi tentang bangun datar
    public void PrintInfo() {
        System.out.println("Bangun Datar Saat ini : ");
        System.out.println("Warna\t\t: " + this.getWarna());
        System.out.println("Border\t\t: " + this.getBorder());
        System.out.println("Jumlah Sisi\t: " + this.getJumlahSisi());
    }
}