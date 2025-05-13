/* NamaFile  : MainBangunDatar.java
 * Deskripsi : Demonstrasi penggunaan Generic BangunDatar dengan koleksi yang bermetamorfosis 2 kali
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/04/2025
 */

package Collection_3_4;

import java.util.*;
import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        /*================================= Kamus ===================================*/
        double jariJari;
        double sisi;
        double panjang, lebar;
        double alas, tinggi;
        Collection<BangunDatarGeneric<?>> koleksiBangunDatar;
        TreeSet<BangunDatarGeneric<?>> sortedSet;
        /*================================ ALgoritma ================================*/
        Scanner scanner = new Scanner(System.in);
        
        koleksiBangunDatar = new ArrayList<>();
        System.out.println("===== Koleksi dimulai sebagai ArrayList =====");

        System.out.println("====== PROGRAM MENGHITUNG BANGUN DATAR =====");
        System.out.println("============================================");

        // Input semua bangun datar
        // Lingkaran
        System.out.print("Masukkan jumlah lingkaran: ");
        int jmlLingkaran = scanner.nextInt();
        for (int i = 1; i <= jmlLingkaran; i++) {
            System.out.print("Masukkan jari-jari lingkaran L" + i + ": ");
            jariJari = scanner.nextDouble();
            
            BangunDatarGeneric<Lingkaran> L = new BangunDatarGeneric<>();
            L.setTipe(new Lingkaran(jariJari));
            koleksiBangunDatar.add(L);
        }

        // Persegi
        System.out.print("\nMasukkan jumlah persegi: ");
        int jmlPersegi = scanner.nextInt();
        for (int i = 1; i <= jmlPersegi; i++) {
            System.out.print("Masukkan sisi persegi P" + i + ": ");
            sisi = scanner.nextDouble();
            
            BangunDatarGeneric<Persegi> P = new BangunDatarGeneric<>();
            P.setTipe(new Persegi(sisi));
            koleksiBangunDatar.add(P);
        }

        // METAMORFOSIS PERTAMA: Menjadi LinkedList
        koleksiBangunDatar = new LinkedList<>(koleksiBangunDatar);
        System.out.println("======= Koleksi menjadi LinkedList ========");

        // Persegi Panjang
        System.out.print("\nMasukkan jumlah persegi panjang: ");
        int jmlPersegiPanjang = scanner.nextInt();
        for (int i = 1; i <= jmlPersegiPanjang; i++) {
            System.out.print("Masukkan panjang PP" + i + ": ");
            panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar PP" + i + ": ");
            lebar = scanner.nextDouble();
            
            BangunDatarGeneric<PersegiPanjang> PP = new BangunDatarGeneric<>();
            PP.setTipe(new PersegiPanjang(panjang, lebar));
            koleksiBangunDatar.add(PP);
        }

        // Segitiga
        System.out.print("\nMasukkan jumlah segitiga: ");
        int jmlSegitiga = scanner.nextInt();
        for (int i = 1; i <= jmlSegitiga; i++) {
            System.out.println("Segitiga S" + i + ":");
            System.out.print("Masukkan alas: ");
            alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            tinggi = scanner.nextDouble();
            
            BangunDatarGeneric<Segitiga> S = new BangunDatarGeneric<>();
            S.setTipe(new Segitiga(alas, tinggi));
            koleksiBangunDatar.add(S);
        }

        // Test Method
        System.out.println("--===================== HASIL AKHIR ====================");
        System.out.println("Bentuk akhir koleksi: TreeSet (terurut berdasarkan luas)");
        System.out.println("========================================================");

        // METAMORFOSIS KEDUA: Menjadi TreeSet (terurut berdasarkan luas)
        TreeSet<BangunDatarGeneric<?>> treeSet = new TreeSet<>(
            Comparator.comparingDouble(BangunDatarGeneric::hitungLuas)
        );
        treeSet.addAll(koleksiBangunDatar);

        int counter = 1;
        for (BangunDatarGeneric<?> bangunDatar : treeSet) {
            System.out.println(">> Bangun Datar #" + counter++);
            bangunDatar.printInfo();
            System.out.printf("\nKeliling: %.2f", bangunDatar.hitungKeliling());
            System.out.printf("\nLuas: %.2f", bangunDatar.hitungLuas());
            System.out.println("\n-------------------------------------");
        }

        System.out.println("Total bangun datar: " + (treeSet.size()+1));
        System.out.println("=========================================================");

        scanner.close();
    }
}
