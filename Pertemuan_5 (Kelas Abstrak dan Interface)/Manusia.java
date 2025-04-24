/* NamaFile  : Manusia.java
 * Deskripsi : Kelas abstract untuk merepresentasikan manusia dengan atribut dasar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 23/04/2025
 */

 import java.util.Date;

 public abstract class Manusia {
     /* ================================= ATRIBUT ===================================== */
     protected String Nama;
     protected Date tgl_mulai_kerja;
     protected String alamat;
     protected double Pendapatan;
     protected static int CounterMHs;
 
     /* ================================= KONSTRUKTOR ===================================== */
     // Konstruktor tanpa parameter
     public Manusia() {
         CounterMHs++;
     }
     
     // Konstruktor dengan parameter
     public Manusia(String Nama, Date tgl_mulai_kerja, String alamat, double Pendapatan) {
         this.Nama = Nama;
         this.tgl_mulai_kerja = tgl_mulai_kerja;
         this.alamat = alamat;
         this.Pendapatan = Pendapatan;
         CounterMHs++;
     }
 
     /* ================================= METHOD ===================================== */
     // Method untuk mendapatkan jumlah objek Manusia yang telah dibuat
     public static int getCounterMHs() {
         return CounterMHs;
     }
 
     // Method selektor untuk nama
     public String getNama() {
         return this.Nama;
     }
     // Method selektor untuk tanggal mulai kerja
     public Date getTglMulaiKerja() {
         return this.tgl_mulai_kerja;
     }
     // Method selektor untuk alamat
     public String getAlamat() {
         return this.alamat;
     }
     // Method selektor untuk pendapatan
     public double getPendapatan() {
         return this.Pendapatan;
     }
 
     // Prosedur mutator untuk nama
     public void setNama(String Nama) {
         this.Nama = Nama;
     }
     // Prosedur mutator untuk tanggal mulai kerja
     public void setTglMulaiKerja(Date tgl_mulai_kerja) {
         this.tgl_mulai_kerja = tgl_mulai_kerja;
     }
     // Prosedur mutator untuk alamat
     public void setAlamat(String alamat) {
         this.alamat = alamat;
     }
     // Prosedur mutator untuk pendapatan
     public void setPendapatan(double Pendapatan) {
         this.Pendapatan = Pendapatan;
     }
 
     // Prosedur untuk mencetak informasi tentang manusia
     public void cetakInfo() {
         System.out.println("======================== Informasi Manusia ==========================");
         System.out.println("Nama\t\t: " + this.getNama());
         System.out.println("Alamat\t\t: " + this.getAlamat());
         System.out.println("Tgl Mulai Kerja\t: " + this.getTglMulaiKerja());
         System.out.println("Pendapatan\t: " + this.getPendapatan());
         System.out.println("======================== Informasi Manusia ==========================");
     }
 
     /* ================================= METHOD ABSTRAK ===================================== */
     // Method abstrak untuk menghitung masa kerja
     public abstract int HitungMasaKerja();
 }