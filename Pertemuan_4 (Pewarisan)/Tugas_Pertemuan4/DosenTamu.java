/* Nama file  : DosenTamu.java
 * Deskripsi  : Merupakan sebuah class DosenTamu, subclass dari Dosen
 *              Berisi Atribut dan Method dari objek DosenTamu
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

 import java.text.NumberFormat;
 import java.util.Locale;
 
 public class DosenTamu extends Dosen {
    /* ====================================== ATRIBUT ========================================= */
     private String NIDK;
     private Tanggal AkhirKontrak;
 
    /* ====================================== METHOD ========================================== */
    /* ------------------------------------ Konstruktor --------------------------------------- */
     // Konstruktor tanpa parameter
     public DosenTamu() {
         super();
     }
     // Konstruktor dengan parameter
     public DosenTamu(String NIP, String Nama, Tanggal TanggalLahir, Tanggal TMT, 
                Double GajiPokok, String fakultas, String NIDK, Tanggal AkhirKontrak) {
         super(NIP, Nama, TanggalLahir, TMT, GajiPokok, fakultas);
         this.NIDK = NIDK;
         this.AkhirKontrak = AkhirKontrak;
     }
 
     /* ------------------------------------ Setter&Getter --------------------------------------- */
     // Getter untuk NIDK
     public String getNIDK() {
         return NIDK;
     }
     // Getter untuk AkhirKontrak
     public Tanggal getAkhirKontrak() {
         return AkhirKontrak;
     }
     // Setter untuk NIDK
     public void setNIDK(String NIDK) {
         this.NIDK = NIDK;
     }
     // Getter untuk AkhirKontrak
     public void setAkhirKontrak(Tanggal AkhirKontrak) {
         this.AkhirKontrak = AkhirKontrak;
     }

     /* ------------------------------------ OtherMethod --------------------------------------- */
     // Method untuk menghitung tunjangan dosen tamu
     public double hitungTunjangan() {
         return 0.025 * GajiPokok; // Tunjangan = 2,5% x gaji pokok
     }
 
     // Method untuk menghitung sisa masa kontrak dalam bulan
     public int hitungSisaMasaKontrak() {
         Tanggal sekarang = Tanggal.Today();
         int tahunSekarang = sekarang.getTahun();
         int bulanSekarang = sekarang.getBulan();
         int hariSekarang = sekarang.getHari();
    
         int tahunBerakhir = AkhirKontrak.getTahun();
         int bulanBerakhir = AkhirKontrak.getBulan();
         int hariBerakhir = AkhirKontrak.getHari();
    
         int selisihTahun = tahunBerakhir - tahunSekarang;
         int selisihBulan = bulanBerakhir - bulanSekarang;
    
         if (selisihBulan < 0) {
             selisihTahun--;
             selisihBulan += 12;
         }
         if (hariSekarang > hariBerakhir) {
             selisihBulan--;
             if (selisihBulan < 0) {
                 selisihTahun--;
                 selisihBulan += 12;
             }
         }
    
         int sisaMasaKontrak = (selisihTahun * 12) + selisihBulan;
         if (sisaMasaKontrak < 0) {
             throw new IllegalArgumentException("Masa kontrak sudah berakhir");
         } else {
             return sisaMasaKontrak;
         }
    }
 
     // Method untuk menampilkan informasi dosen tamu
     @Override
     public void printInfo() {
         Locale locale = new Locale.Builder()
             .setLanguage("id")
             .setRegion("ID")
             .build();
         NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);
         System.out.println("======================= INFO DOSEN TETAP =========================");
         super.printInfo();
         System.out.println("NIDK\t\t: " + this.NIDK);
         System.out.println("AkhirKontrak\t: " + this.AkhirKontrak.format("d MMMM yyyy"));
         System.out.println("Sisa Kontrak\t: " + hitungSisaMasaKontrak() + " bulan");
         System.out.println("Tunjangan\t: 2,5% x " + rupiahFormat.format(this.GajiPokok) 
                            + " = " + rupiahFormat.format(hitungTunjangan()));
         System.out.println("===========================NAIK GAJI=============================");
     }
 }