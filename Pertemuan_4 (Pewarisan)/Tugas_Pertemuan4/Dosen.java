/* Nama file  : Dosen.java
 * Deskripsi  : Merupakan sebuah class Dosen, subclass dari Pegawai
 *              Berisi Atribut dan Method dari objek Dosen
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

 public class Dosen extends Pegawai {
    /* ====================================== ATRIBUT ========================================= */
    protected String fakultas;

    /* ====================================== METHOD ========================================== */
    /* ------------------------------------ Konstruktor --------------------------------------- */
    // Konstruktor tanpa parameter
    public Dosen() {
        super();
    }
    // Konstruktor dengan parameter
    public Dosen(String NIP, String Nama, Tanggal TanggalLahir, Tanggal TMT, Double GajiPokok, String fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.fakultas = fakultas;
    }

    /* ----------------------------------- Setter&Getter -------------------------------------- */
    // Getter untuk atribut fakultas
    public String getFakultas() {
        return fakultas;
    }
    // Setter untuk atribut fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    // Method untuk menampilkan informasi dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas\t: " + fakultas);
    }
}