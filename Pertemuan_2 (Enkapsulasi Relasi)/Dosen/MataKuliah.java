/* NamaFile  : MataKuliah.java
 * Deskripsi : berisi atribut dan Method dalam class MataKuliah
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/02/2025
 */

public class MataKuliah {
    /*********************************** ATRIBUT *******************************************/
    private String IDMatkul;
    private String NamaMK;
    private int SKS;

    /************************************* METHODS ******************************************/
    // Konstruktor dengan Parameter
    public MataKuliah(String IDMatkul, String NamaMK, int SKS){
        this.IDMatkul = IDMatkul;
        this.NamaMK = NamaMK;
        this.SKS = SKS;
    }
    // Konstruktor tanpa Parameter
    public MataKuliah(){
        this("-","-",0);
    }
    /* Selektor (getter) */
    // Fungsi untuk mengambil IDMatkul Mata Kuliah
    public String getIDMatkul(){
        return this.IDMatkul;
    }
    // Fungsi untuk mengambil NamaMK Mata Kuliah
    public String getNamaMK(){
        return this.NamaMK;
    }
    // Fungsi untuk mengambil SKS Mata Kuliah
    public int getSKS(){
        return this.SKS;
    }

    /* Konstruktor (Setter) */
    // Prosedur untuk menentukan idMatkul Mata Kuliah
    public void setIDMatkul(String IDMatkul){
        this.IDMatkul = IDMatkul;
    }
    // Prosedur untuk menentukan NamaMK Mata Kuliah
    public void setNamaMK(String NamaMK){
        this.NamaMK = NamaMK;
    }
    // Prosedur untuk menentukan SKS Mata Kuliah
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
