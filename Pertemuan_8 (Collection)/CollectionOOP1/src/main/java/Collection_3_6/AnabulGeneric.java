/* NamaFile  : Datum.java
 * Deskripsi : Berisi Kelas Konstruksi Generic untuk Anabul
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

public class AnabulGeneric<T extends Anabul> {
    /*================================ ATRIBUT ===============================*/
    private T Anabull;
    /*================================ METHOD ================================*/
    // Prosedur untuk menetapkan Jenis Anabul dari object Generic AnabulGeneric
    public void setJenis(T JenisAnabul){
        this.Anabull = JenisAnabul;
    }
    
    // Fungsi untuk mendapatkan Jenis Anabul dari object Generic Anabul
    // menghasilkan sebuah object
    public T getJenis(){
        return Anabull;
    }
    
    // Prosedur untuk menunjukkan cara gerak object Generic Anabul
    public void bergerak(){
        this.Anabull.bergerak();
    }
    
    // Prosedur untuk mengeluarkan suara object Generic Anabul
    public void bersuara(){
        this.Anabull.bersuara();
    }
    
    // method prosedur ShowAll, menampilkan info lengkap Object Generic Anabul
    public void ShowAll() {
        this.Anabull.ShowAll();
    }
}