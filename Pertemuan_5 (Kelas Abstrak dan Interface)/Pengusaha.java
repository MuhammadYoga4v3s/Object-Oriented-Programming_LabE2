/* NamaFile  : Pengusaha.java
 * Deskripsi : Class untuk merepresentasikan Pengusaha
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 23/04/2025
 */

 import java.util.Date;
 import java.util.Calendar;
 
 public class Pengusaha extends Manusia implements Pajak {
     /* ================================= ATRIBUT ===================================== */
     protected String NPWP;
     protected static int CounterPengusaha;
     private final int B = 0; // digit ke-13 NIM
 
     /* ================================= KONSTRUKTOR ===================================== */
     // Konstruktor tanpa parameter
     public Pengusaha() {
         super();
         CounterPengusaha++;
     }
     
     // Konstruktor dengan parameter
     public Pengusaha(String Nama, Date tgl_mulai_kerja, String alamat, double Pendapatan, String NPWP) {
         super(Nama, tgl_mulai_kerja, alamat, Pendapatan);
         this.NPWP = NPWP;
         CounterPengusaha++;
     }
 
     /* ================================= METHOD ===================================== */
     // Method untuk mendapatkan jumlah objek Pengusaha yang telah dibuat
     public static int getCounterPengusaha() {
         return CounterPengusaha;
     }
 
     // Method selektor untuk NPWP
     public String getNPWP() {
         return this.NPWP;
     }
 
     // Prosedur mutator untuk NPWP
     public void setNPWP(String NPWP) {
         this.NPWP = NPWP;
     }
 
     /* ================================= OVERRIDE METHOD ===================================== */
     // Fungsi override untuk menghitung masa kerja
     @Override
     public int HitungMasaKerja() {
         Calendar now = Calendar.getInstance();
         Calendar tglMulai = Calendar.getInstance();
         tglMulai.setTime(this.tgl_mulai_kerja);
         
         int tahun = now.get(Calendar.YEAR) - tglMulai.get(Calendar.YEAR);
         return tahun + B;
     }
 
     // Fungsi override untuk menghitung pajak
     @Override
     public double HitungPajak() {
         return 0.15 * this.Pendapatan; // Pajak pengusaha 15%
     }
 
     // Prosedur override untuk mencetak informasi Pengusaha
     @Override
     public void cetakInfo() {
         System.out.println("======================= Informasi Pengusaha ========================");
         System.out.println("NPWP\t\t: " + this.getNPWP());
         System.out.println("Nama\t\t: " + this.getNama());
         System.out.println("Alamat\t\t: " + this.getAlamat());
         System.out.println("Tgl Mulai Usaha\t: " + this.getTglMulaiKerja());
         System.out.println("Masa Usaha\t: " + this.HitungMasaKerja() + " tahun");
         System.out.println("Pendapatan\t: " + this.getPendapatan());
         System.out.println("Pajak\t\t: " + this.HitungPajak());
         System.out.println("======================= Informasi Pengusaha ========================");
     }
 }