/* Nama file  : DosenTetap.java
 * Deskripsi  : Merupakan sebuah class DosenTetap, subclass dari Dosen
 *              Berisi Atribut dan Method dari objek DosenTetap
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

 import java.text.NumberFormat;
 import java.util.Locale;
 
 public class DosenTetap extends Dosen {
    /* ====================================== ATRIBUT ======================================== */
     private String NIDN;
     private final int BUP = 65; // Batas Usia Pensiun untuk dosen tetap (65 tahun)
 
    /* ====================================== METHOD ========================================== */
    /* ------------------------------------ Konstruktor --------------------------------------- */
     // Konstruktor tanpa parameter
     public DosenTetap() {
         super();
     }
     // Konstruktor dengan parameter
     public DosenTetap(String NIP, String Nama, Tanggal TanggalLahir, Tanggal TMT, 
                        Double GajiPokok, String fakultas, String NIDN) {
         super(NIP, Nama, TanggalLahir, TMT, GajiPokok, fakultas);
         this.NIDN = NIDN;
     }
 
     /* ------------------------------------ Setter&Getter --------------------------------------- */
     // Getter untuk NIDN
     public String getNIDN() {
        return NIDN;
    }
    // Setter untuk NIDN
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    /* ------------------------------------ OtherMethod:3 --------------------------------------- */
     // Method untuk menghitung tunjangan dosen tetap
     public double hitungTunjangan() {
         String masaKerja = hitungMasaKerja(); // Mendapatkan masa kerja dalam format "X tahun Y bulan"
         int tahunKerja = Integer.parseInt(masaKerja.split(" ")[0]); // Ambil thunnya aja
         return 0.02 * tahunKerja * GajiPokok; // Tunjangan = 2% x masa kerja (tahun) x gaji pokok
     }
 
     // Method untuk menghitung tanggal BUP
     public Tanggal hitungBUP() {
         // Menghitung tanggal lahir + 65 tahun
         Tanggal tanggalBUP = TanggalLahir.tambahTahun(BUP);
 
         // Menambahkan 1 bulan ke tanggal BUP
         int bulanBUP = tanggalBUP.getBulan() + 1;
         int tahunBUP = tanggalBUP.getTahun();
         if (bulanBUP > 12) {
             bulanBUP = 1;
             tahunBUP++;
         }
         return new Tanggal(1, bulanBUP, tahunBUP);
     }
 
     // Method untuk menampilkan informasi dosen tetap
     @Override
     public void printInfo() {
        Locale locale = new Locale.Builder()
        .setLanguage("id")
        .setRegion("ID")
        .build();
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);
        
        System.out.println("======================= INFO DOSEN TETAP =========================");
        super.printInfo();
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("NIDN\t\t: " + this.NIDN);
        System.out.println("BUP\t\t: " + BUP + " tahun");
        System.out.println("Tanggal BUP\t: " + hitungBUP().format("d MMMM yyyy"));
        System.out.println("Tunjangan\t: 2% x " + rupiahFormat.format(this.GajiPokok) + 
                            " = " + rupiahFormat.format(hitungTunjangan()));
        System.out.println("========================LuckyNo.8 ===============================");
     }
 }