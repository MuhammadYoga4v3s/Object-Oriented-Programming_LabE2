/* NamaFile  : PNS.java
 * Deskripsi : Class untuk merepresentasikan Pegawai Negeri Sipil
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 23/04/2025
 */

 import java.util.Date;
 import java.util.Calendar;
 
 public class PNS extends Manusia implements Pajak {
     /* ================================= ATRIBUT ===================================== */
     protected String NIP;
     protected static int CounterPNS;
     private final int A = 6; // Digit ke-14 NIM
 
     /* ================================= KONSTRUKTOR ===================================== */
     // Konstruktor tanpa parameter
     public PNS() {
         super();
         CounterPNS++;
     }
     
     // Konstruktor dengan parameter
     public PNS(String Nama, Date tgl_mulai_kerja, String alamat, double Pendapatan, String NIP) {
         super(Nama, tgl_mulai_kerja, alamat, Pendapatan);
         this.NIP = NIP;
         CounterPNS++;
     }
 
     /* ================================= METHOD ===================================== */
     // Method untuk mendapatkan jumlah objek PNS yang telah dibuat
     public static int getCounterPNS() {
         return CounterPNS;
     }
 
     // Method selektor untuk NIP
     public String getNIP() {
         return this.NIP;
     }
 
     // Prosedur mutator untuk NIP
     public void setNIP(String NIP) {
         this.NIP = NIP;
     }
 
     /* ================================= OVERRIDE METHOD ===================================== */
     // Method override untuk menghitung masa kerja
     @Override
     public int HitungMasaKerja() {
         Calendar now = Calendar.getInstance();
         Calendar tglMulai = Calendar.getInstance();
         tglMulai.setTime(this.tgl_mulai_kerja);
         
         int tahun = now.get(Calendar.YEAR) - tglMulai.get(Calendar.YEAR);
         return tahun + A;
     }
 
     // Method override untuk menghitung pajak
     @Override
     public double HitungPajak() {
         return 0.1 * this.Pendapatan;
     }
 
     // Prosedur override untuk mencetak informasi PNS
     @Override
     public void cetakInfo() {
         System.out.println("========================== Informasi PNS ============================");
         System.out.println("NIP\t\t: " + this.getNIP());
         System.out.println("Nama\t\t: " + this.getNama());
         System.out.println("Alamat\t\t: " + this.getAlamat());
         System.out.println("Tgl Mulai Kerja\t: " + this.getTglMulaiKerja());
         System.out.println("Masa Kerja\t: " + this.HitungMasaKerja() + " tahun");
         System.out.println("Pendapatan\t: " + this.getPendapatan());
         System.out.println("Pajak\t\t: " + this.HitungPajak());
         System.out.println("========================== Informasi PNS ============================");
     }
 }