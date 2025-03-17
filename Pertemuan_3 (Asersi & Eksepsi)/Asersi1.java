/* NamaFile  : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 6/03/2025
 */

public class Asersi1 {
    public static void main (String[] args){
        int x = 0;
        if (x > 0){
            System.out.println("X Bilangan Positif");
        }
        else {
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("X bilangan Negatif");
        }
    }
}
