/* NamaFile  : Senjata.java
 * Deskripsi : Berisi kelas senjata, Atribut dan Method-nya
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class Senjata {
    /*================================ ATRIBUT ===============================*/
    private String Bunyi;
    private boolean Menusuk;
    /*================================ METHOD ================================*/
    // Konstruktor untuk membuat Objek Senjata dengan Bunyi Bunyi
    public Senjata(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    // Prosedur untuk Menetapkan Bunyi dari sebuah senjata
    private void setBunyi(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    // Fungsi untuk mendapatkan Bunyi dari sebuah senjata
    private String getBunyi(){
        return this.Bunyi;
    }
    
    // Prosedur untuk Menetapkan apakah Senjata Menusuk
    private void setMenusuk(boolean Menusuk){
        this.Menusuk = Menusuk;
    }
    
    // Fungsi untuk mendapatkan nilai kebenaran apakah Senjata Menusuk
    private boolean isMenusuk(){
        return this.Menusuk;
    }
    
    // Prosedur untuk mengelurkan Tembakan sebanyak jumlah oleh senjata
    public void Menembak(int Jumlah){
        for(int i = 0; i < Jumlah ; i++){
            System.out.println(this.getBunyi() + " ");
        }
        System.out.println("");
    }
    
    // Prosedur untuk memasang Tusukan oleh Senjata
    public void PasangBayonet(){
        if(!this.isMenusuk()){
            this.setMenusuk(true);
            System.out.println("Bayonet Sudah Terpasang");
        } else {
            System.out.println("Bayonet Sudah Terpasang Sebelumnya");
        }
    }
    
    // Fungsi untuk mengembalikan interaksi Penusukan oleh Senjata
    public String Menusuk(){
        if(this.isMenusuk()){
            return "Jleb, Objek Berhasil Menusuk";
        } else {
            return "Walawe, Belum pasang Bayonet";
        }
    }
}
