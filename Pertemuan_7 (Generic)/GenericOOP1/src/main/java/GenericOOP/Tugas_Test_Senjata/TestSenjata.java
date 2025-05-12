/* NamaFile  : TestSenjata.java
 * Deskripsi : Program utama untuk menguji kelas Senjata
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class TestSenjata {
    public static void main(String[] args) {
        /* Kamus */
        Senjata ak47;
        Senjata m16;

        /* Algoritma */
        ak47 = new Senjata("TAR");
        m16 = new Senjata("DOR");
        
        System.out.print("AK47 Menembak 3x: ");
        ak47.Menembak(3);
        System.out.print("M16 Menembak 1x: ");
        m16.Menembak(1);

        System.out.println("AK47 menusuk: " + ak47.Menusuk());
        ak47.PasangBayonet();
        System.out.println("AK47 menusuk: " + ak47.Menusuk());
    }
}

