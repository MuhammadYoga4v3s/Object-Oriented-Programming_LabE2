/* Nama file  : Pegawai.java
 * Deskripsi  : Merupakan sebuah class Pegawai, superclass dari problem utama
 *              Berisi Atribut dan Method dari objek Pegawai
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    /* ====================================== ATRIBUT ======================================== */
    protected String NIP;
    protected String Nama;
    protected Tanggal TanggalLahir;
    protected Tanggal TMT;
    protected Double GajiPokok;

    /* ====================================== METHOD ========================================== */
    /* ------------------------------------ Konstruktor --------------------------------------- */
    // Konstruktor tanpa parameter (dikosongkan)
    public Pegawai() {
    }
    // Konstruktor dengan 5 parameter atribut utama
    public Pegawai(String NIP, String Nama, Tanggal TanggalLahir, Tanggal TMT, Double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    /* -------------------------------------- Getter ------------------------------------------ */
    // Fungsi untuk mengambil NIP Pegawai
    public String getNIP() {
        return NIP;
    }
    // Fungsi untuk mengambil Nama Pegawai
    public String getNama() {
        return Nama;
    }
    // Fungsi untuk mengambil Tanggal Lahir Pegawai
    public Tanggal getTanggalLahir() {
        return TanggalLahir;
    }
    // Fungsi untuk mengambil Terhitung Mulai Tanggal(TMT) Pegawai
    public Tanggal getTMT() {
        return TMT;
    }
    // Fungsi untuk mengambil info GajiPokok pegawai
    public Double getGajiPokok() {
        return GajiPokok;
    }

    /* -------------------------------------- Setter ------------------------------------------ */
    // Fungsi untuk men-set NIP Pegawai
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    // Fungsi untuk men-set Nama Pegawai
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
     // Fungsi untuk men-set TanggalLahir Pegawai
    public void setTanggalLahir(Tanggal TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }
    // Fungsi untuk men-set TMT pegawai
    public void setTMT(Tanggal TMT) {
        this.TMT = TMT;
    }
    // Fungsi untuk men-set GajiPokok Pegawai
    public void setGajiPokok(Double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    /* ------------------------------------ MasaKerja --------------------------------------- */
    // Method untuk menghitung masa kerja dalam tahun dan bulan
    public String hitungMasaKerja() {
        Tanggal Today = Tanggal.Today(); // Mendapatkan tanggal saat ini
        int tahunToday = Today.getTahun();
        int bulanToday = Today.getBulan();
        int hariToday = Today.getHari();

        int tahunTMT = TMT.getTahun();
        int bulanTMT = TMT.getBulan();
        int hariTMT = TMT.getHari();

        int selisihTahun = tahunToday - tahunTMT;
        int selisihBulan = bulanToday - bulanTMT;

        // Jika bulan Today kurang dari bulan TMT, kurangi 1 tahun
        if (selisihBulan < 0) {
            selisihTahun--;
            selisihBulan += 12;
        }
        // Jika hari Today kurang dari hari TMT, kurangi 1 bulan
        if (hariToday < hariTMT) {
            selisihBulan--;
            if (selisihBulan < 0) {
                selisihTahun--;
                selisihBulan += 12;
            }
        }
        return selisihTahun + " tahun " + selisihBulan + " bulan";
    }

    /* ------------------------------------ PrintInfo --------------------------------------- */
    // Method untuk menampilkan informasi pegawai
    public void printInfo() {
        // Format mata uang Rupiah
        Locale locale = new Locale.Builder()
        .setLanguage("id")
        .setRegion("ID")
        .build();
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("NIP             : " + this.NIP);
        System.out.println("Nama            : " + this.Nama);
        System.out.println("Tanggal Lahir   : " + this.TanggalLahir.format("d MMMM yyyy"));
        System.out.println("TMT             : " + this.TMT.format("d MMMM yyyy"));
        System.out.println("Gaji Pokok      : " + rupiahFormat.format(this.GajiPokok));
        System.out.println("Masa Kerja      : " + this.hitungMasaKerja());
    }
}