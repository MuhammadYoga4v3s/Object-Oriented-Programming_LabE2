/* NamaFile  : TestSenjata3Medium.java
 * Deskripsi : Program utama untuk menguji kelas KontrolSenjata dan Senjata2
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class TestSenjata3Medium {
    public static void main(String[] args) {
        /*=========================== KAMUS ===========================*/
        // Ojek Senjata
        Senjata2 ak47 = new Senjata2("TAR");
        Senjata2 m16 = new Senjata2("DOR");
        //kontrol senjata untuk masing-masing senjata
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        /*========================= ALGORITMA =========================*/
        ak47 = new Senjata2("TAR");
        m16 = new Senjata2("DOR");
        kontrolAK47 = new KontrolSenjata(ak47);
        kontrolM16 = new KontrolSenjata(m16);
        // AK47
        kontrolAK47.Menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.Menembak(5);
        System.out.println("=================================================");
        // M16
        kontrolM16.Menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.Menembak(2);
    }
}
