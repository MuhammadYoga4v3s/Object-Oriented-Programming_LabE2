/* Nama file  : Tanggal.java
 * Deskripsi  : Merupakan sebuah class tanggal, objek abstrak pembantu perhitungan
 *              Berisi Atribut dan Method dari objek Tanggal
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 16 Maret 2025 */

 public class Tanggal {
    /* ====================================== ATRIBUT ======================================== */
    private int Hari;
    private int Bulan;
    private int Tahun;
    
    /* ====================================== METHOD ========================================== */
    String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    /* ------------------------------------ Konstruktor --------------------------------------- */
    // Membuat objek Tanggal dengan parameter Hari, Bulan, dan Tahun dalam bentuk integer
    public Tanggal(int Hari, int Bulan, int Tahun) {
        this.Hari = Hari;
        this.Bulan = Bulan;
        this.Tahun = Tahun;
    }
    /* Membuat objek Tanggal dengan parameter Hari (integer), 
    nama Bulan (string), dan Tahun (integer)
    Nama Bulan (string) akan dikonversi ke nomor Bulan menggunakan method NomorBulan() */
    public Tanggal(int Hari, String bulanStr, int Tahun) {
        this.Hari = Hari;
        this.Bulan = NomorBulan(bulanStr);
        this.Tahun = Tahun;
    }   
    /* Membuat objek Tanggal dari string yang berformat hari-bulan-tahun, misalnya "10-Maret-2025"
    String dipecah menggunakan method split("-"), kemudian dikonversi ke integer atau nama bulan */
    public Tanggal(String tanggalStr) {
        String[] parts = tanggalStr.split(" ");
        this.Hari = Integer.parseInt(parts[0]);
        this.Bulan = NomorBulan(parts[1]);
        this.Tahun = Integer.parseInt(parts[2]);
    }
    /* Mengembalikan objek Tanggal yang merepresentasikan tanggal saat ini (tanggal sistem)
    Menggunakan class Calendar dari Java untuk mendapatkan tanggal, bulan, dan tahun saat ini */
    public static Tanggal Today() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        return new Tanggal(
            cal.get(java.util.Calendar.DAY_OF_MONTH),
            cal.get(java.util.Calendar.MONTH) + 1,
            cal.get(java.util.Calendar.YEAR)
        );
    }
    
    /* ------------------------------------ Selektor --------------------------------------- */
    // Mengambil nilai Hari pada tanggal (integer)
    public int getHari() { 
        return this.Hari; 
    }
    // Mengambil nilai Bulan pada tanggal (integer)
    public int getBulan() { 
        return this.Bulan; 
    }
    // Mengambil nilai Tahun pada tanggal (integer)
    public int getTahun() { 
        return Tahun; 
    }
    // Mengambil nama bulan pada tanggal
    private String getNamaBulan(int Bulan) {
        return namaBulan[Bulan - 1];
    }
    // Mengembalikan konversi nama bulan (string) ke nomor bulan (integer)
    private int NomorBulan(String bulanStr) {
        for (int i = 0; i < namaBulan.length; i++) {
            if (namaBulan[i].equalsIgnoreCase(bulanStr)) {
                return i + 1;
            }
        }
        return 1;
    }

    /* ------------------------------------ PrintTanggal --------------------------------------- */
    // Mengembalikan string yang berisi tanggal yang diformat sesuai dengan pola yang diberikan.
    // format : <hari> <nama bulan> <tahun>
    public String format(String pola) {
        if (pola.equals("d MMMM yyyy")) {
            return Hari + " " + getNamaBulan(Bulan) + " " + Tahun;
        }
        return Hari + "-" + Bulan + "-" + Tahun;
    }
    /* ------------------------------------ operasilain --------------------------------------- */
    // Mengembalikan objek Tanggal baru dengan tahun yang ditambahkan sesuai parameter jumlahTahun
    public Tanggal tambahTahun(int jumlahTahun) {
        return new Tanggal(this.Hari, this.Bulan, this.Tahun + jumlahTahun);
    }
}