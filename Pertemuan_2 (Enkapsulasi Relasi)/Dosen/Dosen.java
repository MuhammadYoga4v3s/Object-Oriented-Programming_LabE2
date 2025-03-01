/* NamaFile  : Dosen.java
 * Deskripsi : berisi atribut dan Method dalam class Dosen
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/02/2025
 */

public class Dosen {
    /*********************************** ATRIBUT *******************************************/
    private String NIP;
    private String Nama;
    private String Prodi;

    /************************************* METHOD ******************************************/
    // Konstruktor dengan Parameter
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }
    // Konstruktor Tanpa Parameter
    public Dosen(){
        this("-","-","-");
    }

    /* Selektor (Getter) */
    // Fungsi untuk mengambil NIP dosen
    public String getNIP(){
        return this.NIP;
    }
    // Fungsi untuk mengambil Nama dosen
    public String getNama(){
        return this.Nama;
    }
    // Fungsi untuk mengambil Prodi dosen
    public String getProdi(){
        return this.Prodi;
    }

    /* Mutator (Setter) */
    // Prosedur untuk menentukan NIP dosen
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    // Prosedur untuk menentukan Nama dosen
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    // Prosedur untuk menentukan Prodi dosen
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}
