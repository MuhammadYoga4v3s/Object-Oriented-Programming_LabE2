/* NamaFile  : Petani.java
 * Deskripsi : Class untuk merepresentasikan Petani
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 23/04/2025
 */

 import java.util.Date;
 import java.util.Calendar;
 
 public class Petani extends Manusia implements Pajak {
     /* ================================= ATRIBUT ===================================== */
     protected String Asal_Kota;
     protected static int CounterPetani;
     private final int C = 1; // Digit ke-12 NIM
 
     /* ================================= KONSTRUKTOR ===================================== */
     // Konstruktor tanpa parameter
     public Petani() {
         super();
         CounterPetani++;
     }
     
     // Konstruktor dengan parameter
     public Petani(String Nama, Date tgl_mulai_kerja, String alamat, double Pendapatan, String Asal_Kota) {
         super(Nama, tgl_mulai_kerja, alamat, Pendapatan);
         this.Asal_Kota = Asal_Kota;
         CounterPetani++;
     }
 
     /* ================================= METHOD ===================================== */
     // Method untuk mendapatkan jumlah objek Petani yang telah dibuat
     public static int getCounterPetani() {
         return CounterPetani;
     }
 
     // Method selektor untuk Asal Kota
     public String getAsalKota() {
         return this.Asal_Kota;
     }
 
     // Prosedur mutator untuk Asal Kota
     public void setAsalKota(String Asal_Kota) {
         this.Asal_Kota = Asal_Kota;
     }
 
     /* ================================= OVERRIDE METHOD ===================================== */
     // Fungsi override untuk menghitung masa kerja
     @Override
     public int HitungMasaKerja() {
         Calendar now = Calendar.getInstance();
         Calendar tglMulai = Calendar.getInstance();
         tglMulai.setTime(this.tgl_mulai_kerja);
         
         int tahun = now.get(Calendar.YEAR) - tglMulai.get(Calendar.YEAR);
         return tahun + C;
     }
 
     // Fungsi override untuk menghitung pajak (petani bebas pajak)
     @Override
     public double HitungPajak() {
         return 0; // Petani tidak dikenakan pajak
     }
 
     // Prosedur override untuk mencetak informasi Petani
     @Override
     public void cetakInfo() {
         System.out.println("======================== Informasi Petani =========================");
         System.out.println("Asal Kota\t: " + this.getAsalKota());
         System.out.println("Nama\t\t: " + this.getNama());
         System.out.println("Alamat\t\t: " + this.getAlamat());
         System.out.println("Tgl Mulai Bertani: " + this.getTglMulaiKerja());
         System.out.println("Masa Bertani\t: " + this.HitungMasaKerja() + " tahun");
         System.out.println("Pendapatan\t: " + this.getPendapatan());
         System.out.println("Pajak\t\t: " + this.HitungPajak() + " (Bebas Pajak)");
         System.out.println("======================== Informasi Petani =========================");
     }
 }