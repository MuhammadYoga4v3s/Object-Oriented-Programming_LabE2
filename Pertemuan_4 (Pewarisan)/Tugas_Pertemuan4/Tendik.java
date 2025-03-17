/* Nama file  : Tendik.java
 * Deskripsi  : Merupakan sebuah class Tendik, subclass dari Pegawai
 *              Berisi Atribut dan Method dari objek Tendik
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

import java.text.NumberFormat;
import java.util.Locale;

public class Tendik extends Pegawai {
    /* ====================================== ATRIBUT ======================================== */
    private String bidang;
    private final int BUP = 55; // Batas Usia Pensiun untuk tendik (55 tahun)

    /* ====================================== METHOD ========================================== */
    /* ------------------------------------ Konstruktor --------------------------------------- */
    // Konstruktor tanpa parameter
    public Tendik() {
        super();
    }
    // Konstruktor dengan parameter
    public Tendik(String NIP, String Nama, Tanggal TanggalLahir, 
                    Tanggal TMT, Double GajiPokok, String bidang) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.setBidang(bidang);
    }

    /* ----------------------------------- Getter%Setter -------------------------------------- */
    // Getter untuk bidang Tendik
    public String getBidang() {
        return bidang;
    }
    // Setter untuk bidang Tendik
    public void setBidang(String bidang) {
        if (!bidang.equals("Akademik") && !bidang.equals("Kemahasiswaan") 
                && !bidang.equals("Sumber Daya")) {
            throw new IllegalArgumentException("Bidang harus Akademik, Kemahasiswaan, atau Sumber Daya");
        } else {
            this.bidang = bidang;
        }
    }

    /* ------------------------------------- Other ------------------------------------------ */
    // Method untuk menghitung tunjangan tendik
    public double hitungTunjangan() {
        String masaKerja = hitungMasaKerja(); // Mendapatkan masa kerja dalam format "X tahun Y bulan"
        int tahunKerja = Integer.parseInt(masaKerja.split(" ")[0]); // Ambil Tahunnya aj
        return 0.01 * tahunKerja * GajiPokok; // Tunjangan = 1% x masa kerja (tahun) x gaji pokok
    }

    // Method untuk menghitung tanggal BUP
    public Tanggal hitungBUP() {
        // Menghitung tanggal lahir + 55 tahun
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

    // Method untuk menampilkan informasi tendik
    @Override
    public void printInfo() {
        Locale locale = new Locale.Builder()
        .setLanguage("id")
        .setRegion("ID")
        .build();
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("========================== INFO TENDIK ============================");
        super.printInfo();
        System.out.println("Bidang\t\t: " + this.bidang);
        System.out.println("BUP\t\t: " + this.BUP + " tahun");
        System.out.println("Tanggal BUP\t: " + this.hitungBUP().format("d MMMM yyyy"));
        System.out.println("Tunjangan\t: 1% x " +rupiahFormat.format(this.getGajiPokok())
                             + " = "+ rupiahFormat.format(this.hitungTunjangan()));
        System.out.println("========================== NAIK GAJI ==============================");
    }
}