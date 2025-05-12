/* NamaFile  : TestSenjata2Easy.java
 * Deskripsi : Program utama untuk menguji kelas KontrolSenjata dan Senjata2
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class TestSenjata2Easy {
    public static void main(String[] args) {
        /*=========================== KAMUS ===========================*/
        Senjata3 ak47;
        Senjata3 m16;

        /*========================= ALGORITMA =========================*/
        ak47 = new Senjata3("TAR");
        m16 = new Senjata3("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.Menembak();
    }
}
