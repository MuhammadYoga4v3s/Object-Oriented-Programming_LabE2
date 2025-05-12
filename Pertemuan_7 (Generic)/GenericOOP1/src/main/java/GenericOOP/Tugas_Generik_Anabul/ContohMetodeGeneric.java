/* NamaFile  : ContohMetodeGeneric.java
 * Deskripsi : Berisi Metode Metode yang menerima objek Generik
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/04/2025
 */

package GenericOOP.Tugas_Generik_Anabul;

public class ContohMetodeGeneric {

    // Fungsi generic: mengembalikan isi dari Datum
    public <G extends Anabul> G fungsi(Datum<G> D){
        return D.getJenis();
    }

    // Prosedur generic: memanggil method dari objek Anabul
    public <G extends Anabul> void Prosedur(Datum<G> D){
        D.getJenis().tampilInfo();
    }
}
