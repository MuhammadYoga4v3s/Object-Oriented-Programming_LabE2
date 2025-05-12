/* NamaFile  : Senjata2.java
 * Deskripsi : Berisi kelas senjata2, Senjata dengan Peluru tanpa dapat menusuk
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class Senjata3 {
    /*================================ ATRIBUT ===============================*/
    private String Bunyi;
    private int Peluru;
    /*================================ METHOD ================================*/
    // Konstruktor untuk membuat Objek Senjata dengan Bunyi Bunyi
    public Senjata3(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    // Prosedur untuk Menetapkan Bunyi dari sebuah senjata
    public void setBunyi(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    // Fungsi untuk mendapatkan Bunyi dari sebuah senjata
    public String getBunyi(){
        return this.Bunyi;
    }
    
    // Prosedur untuk melakukan Tembakan sekali
    public void Menembak(){
        System.out.println(this.getBunyi());
        this.setPeluru(this.getPeluru()-1);
        System.out.println("Sisa Peluru : " + this.getPeluru());
    }
    
    // Prosedur untuk melakukan 
    // Prosedur untuk Menetapkan jumlah Peluru dari senjata
    public void setPeluru(int Peluru){
        this.Peluru = Peluru;
    }
    
    // Fungsi untuk mendapatkan Jumlah Peluru yang ada dalam Senjata
    public int getPeluru(){
        return this.Peluru;
    }
}

