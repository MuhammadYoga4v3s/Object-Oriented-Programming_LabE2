/* NamaFile  : ContohMetodeGeneric.java
 * Deskripsi : Berisi Metode Metode yang menerima objek Generik
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

public class MetodeGenericAnabul {

    // Fungsi generic: mengembalikan isi dari AnabulGeneric
    public <G extends Anabul> G fungsi(AnabulGeneric<G> D){
        return D.getJenis();
    }

    // Prosedur generic: memanggil method dari objek Anabul
    public <G extends Anabul> void Prosedur(AnabulGeneric<G> D){
        D.getJenis().ShowAll();
    }
}