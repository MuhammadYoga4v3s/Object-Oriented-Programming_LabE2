/* NamaFile  : Dosen.java
 * Deskripsi : berisi atribut dan Method dalam class Dosen
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/02/2025
 */

public class Kendaraan {
    /*********************************** ATRIBUT *******************************************/
    private String NoPlat;
    private String Jenis;

    /************************************* METHOD ******************************************/
    // Konstruktor dengan Parameter
    public Kendaraan(String NoPlat, String Jenis){
        this.NoPlat = NoPlat;
        this.Jenis = Jenis;
    }
    // Konstruktor Tanpa Parameter
    public Kendaraan(){
        this("-","-");
    }
    /* Selektor (getter) */
    // Fungsi untuk mengambil NoPlat Kendaraan
    public String getNoPLat(){
        return this.NoPlat;
    }
    // Fungsi untuk mengambil Jenis Kendaraan
    public String getJenis(){
        return this.Jenis;
    }

    /* Mutator (setter) */
    // Prosedur untuk menentukan NoPlat Kendaraan
    public void setNoPlat(String NoPlat){
        this.NoPlat = NoPlat;
    }
    // Prosedur untuk menentukan Jenis Kendaraan
    public void setJenis(String Jenis){
        if ( Jenis.equalsIgnoreCase("Motor") || Jenis.equalsIgnoreCase("Mobil") ) {
            this.Jenis = Jenis;
        } else {
            System.out.println("Jenis Kendaraan Harus Motor atau Mobil");
        }
    }
}
