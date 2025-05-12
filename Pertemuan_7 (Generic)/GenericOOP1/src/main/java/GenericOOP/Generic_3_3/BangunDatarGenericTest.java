/* NamaFile  : BangunDatarGenericTest.java
 * Deskripsi : Berisi Kelas main untuk Generic Bangun Datar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/04/2025
 */

package GenericOOP.Generic_3_3;

import java.util.Scanner;
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Kamus */
        Lingkaran L;
        Lingkaran Z;
        double R;
        BangunDatarGeneric<Lingkaran> BDG;
        
        /* Algoritma */
        System.out.println("Masukkan jari jari sebuah Lingkaran");
        R = input.nextDouble();
        L = new Lingkaran(R);
        System.out.println("Masukkan jari jari sebuah Lingkaran");
        R = input.nextDouble();
        Z = new Lingkaran(R);
        
        BDG = new BangunDatarGeneric<>();
        BDG.setTipe(Z);
        System.out.println("Sekarang Keliling BDG adalah : " + BDG.hitungKeliling());
        System.out.println("Tipe Generic BGD adalah : " + BDG.getTipe().getClass().getName());
        BDG.setTipe(L);
        System.out.println("Sekarang Keliling BDG adalah : " + BDG.hitungKeliling());
        System.out.println("Tipe Generic BGD adalah : " + BDG.getTipe().getClass().getName());
        
        input.close();
    }
}
