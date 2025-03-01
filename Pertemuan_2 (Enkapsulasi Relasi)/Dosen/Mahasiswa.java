/* NamaFile  : Mahasiswa.java
 * Deskripsi : berisi atribut dan Method dalam class Mahasiswa
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/02/2025
 */

// import java.security.PublicKey;
import java.util.ArrayList;

public class Mahasiswa {
    /*********************************** ATRIBUT *******************************************/
    private String NIM;
    private String Nama;
    private String Prodi;
    /* Hasil Relasi dengan MataKuliah */
    ArrayList<MataKuliah> listMatkul;
    /* Hasil Relasi dengan DosenWali dan Kendaraan */
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    /************************************* METHOD ******************************************/
    // Konstruktor dengan Parameter
    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }
    // Konstruktor tanpa Parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    /* Selektor (getter) */
    // Fungsi untuk mengembalikan NIM Mahasiswa
    public String getNIM(){
        return this.NIM;
    }
    // Fungsi untuk mengembalikan Nama Mahasiswa
    public String getNama(){
        return this.Nama;
    }
    // Fungsi untuk mengembalikan Prodi Mahasiswa
    public String getProdi(){
        return this.Prodi;
    }
    // Fungsi untuk mengembalikan Dosen Wali Mahasiswa
    public Dosen getDosWal(){
        return this.DosenWali;
    }
    // Fungsi untuk mengembalikan Kendaraan Mahasiswa
    public Kendaraan getKendaraan(){
        return this.Kendaraan;
    }

    /* Mutator (setter) */
    // Prosedur untuk menentukan NIM Mahasiswa
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    // Prosedur untuk menentukan Nama Mahasiswa
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    // Prosedur untuk menentukan Prodi Mahasiswa
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
    // Prosedur untuk menentukan Dosen Wali Mahasiswa
    public void setDosenWali(Dosen DosWal){
        this.DosenWali = DosWal;
    }
    // Prosedur untuk menentukan Kendaraan Mahasiswa
    public void setKendaraan(Kendaraan Broom){
        this.Kendaraan = Broom;
    }
    // Prosedur untuk menambahkan Matkul ke Mahasiswa
    public void addMatkul(MataKuliah NewMatkul){
        if(this.listMatkul.size() <= 50){
            this.listMatkul.add(NewMatkul);
        } else {
            System.out.println("List Mata Kuliah Sudah Penuh");
        }
    }

    /************************************* METHOD2 ******************************************/
    // Fungsi Untuk mengambil jumlah SKS yang diambil Mahasiswa
    public int getJumlahSKS(){
        /* Kamus */
        int sum = 0;
        /* Algoritma */
        for(int i=0; i < this.listMatkul.size(); i++){
            sum += this.listMatkul.get(i).getSKS();
        }
        return sum;
    }
    // Fungsi untuk mengembalikan jumlah matkul yang diambil Mahasiswa
    public int getJumlahMatkul(){
        return this.listMatkul.size();
    }
    // Prosedur untuk menampilkan NIM,Nama, dan Prodi Mahasiswa
    public void PrintMhs(){
        System.out.println("NIM \t\t" + this.NIM);
        System.out.println("Nama \t\t" + this.Nama);
        System.out.println("Prodi \t\t" + this.Prodi);
    }
    // Prosedur untuk menampilkan Detail Utus Mahasiswa (Semua Atribut)
    public void PrintDetailMhs() {
        System.out.println("NIM\t\t: " + this.NIM);
        System.out.println("Nama\t\t: " + this.Nama);
        System.out.println("Prodi\t\t: " + this.Prodi);
        System.out.println("Daftar Mata Kuliah:");
        
        for (MataKuliah mk : this.listMatkul) {
            System.out.println("- " + mk.getNamaMK());
        }
        
        System.out.println("Dosen Wali\t: " + this.DosenWali.getNama());
        System.out.println("Kendaraan\t: " + this.Kendaraan.getJenis());
    }
    
}

