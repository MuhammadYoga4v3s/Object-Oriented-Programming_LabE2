/* NamaFile  : MTitik.java
 * Deskripsi : berisi atribut dan Method dalam class Titik
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 20/02/2025
 */

import java.util.Scanner;
public class MTitik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Kamus */
        Titik T1, T2, T3, T4;
        Titik T1X, T3X, T2Y, T4Y;
        double absisT1, absisT2;
        double ordinatT3, ordinatT4;
        double GeserY, GeserX, Rotasi0;
        int SumTitik;

        /* ALgoritma  */
        T1 = new Titik(); T4 = new Titik();
        T2 = new Titik(); T3 = new Titik();

        // Set Nilai Nilai Titik
        T1.setAbsis(3); T1.setOrdinat(4);
        T2.setAbsis(-1); T2.setOrdinat(2);
        T3.setAbsis(6); T3.setOrdinat(-3);
        T4.setAbsis(-7); T4.setOrdinat(-9);

        // Print semua titiknya dulu
        System.out.println("titik titik T1,T2,T3,T4 berturut turut adalah :");
        T1.PrintTitik();
        T2.PrintTitik();
        T3.PrintTitik(); 
        T4.PrintTitik();

        // getAbsis dan getOrdinat
        System.out.println("======================================================");
        absisT1 = T1.getAbsis(); absisT2 = T2.getAbsis();
        ordinatT3 = T3.getOrdinat(); ordinatT4 = T4.getOrdinat();
        System.out.println("Absis dari T1 adalah "); System.out.println(absisT1);
        System.out.println("Absis dari T2 adalah "); System.out.println(absisT2);
        System.out.println("Ordinat dari T3 adalah "); System.out.println(ordinatT3);
        System.out.println("Ordinat dari T4 adalah "); System.out.println(ordinatT4);

        // Kuadran
        System.out.println("======================================================");
        System.out.println("Kita akan cek ada di kuadran mana ke-4 titik tersebut");
        System.out.println("Titik T1 : "); System.out.println(T1.getKuadran());
        System.out.println("Titik T2 : "); System.out.println(T2.getKuadran());
        System.out.println("Titik T3 : "); System.out.println(T3.getKuadran());
        System.out.println("Titik T4 : "); System.out.println(T4.getKuadran());

        // GetJarakPusat
        System.out.println("======================================================");
        System.out.println("Sekarang Kita Mencari Jarak sebuah Titik ke Koordinat (0,0)");
        System.out.println("Titik T1 : "); System.out.println(T1.getJarakPusat());
        System.out.println("Titik T2 : "); System.out.println(T2.getJarakPusat());
        System.out.println("Titik T3 : "); System.out.println(T3.getJarakPusat());
        System.out.println("Titik T4 : "); System.out.println(T4.getJarakPusat());

        // JarakAntarTitik
        System.out.println("======================================================");
        System.out.println("Titik1"); T1.PrintTitik();
        System.out.println("Jarak Ttitik 1 dengan Titik Lain adalah");
        System.out.println("Titik T1 : "); System.out.printf("%.2f\n", T1.getJarak(T1));
        System.out.println("Titik T2 : "); System.out.printf("%.2f\n", T2.getJarak(T1));
        System.out.println("Titik T3 : "); System.out.printf("%.2f\n", T3.getJarak(T1));
        System.out.println("Titik T4 : "); System.out.printf("%.2f\n", T4.getJarak(T1));

        // Refleksi X dan getRefleksiX
        System.out.println("======================================================");
        System.out.println("Titik T1X dan T3X adalah hasil refleksi terhadap sumbu X oleh titik T1 dan T3");
        T1X = T1.getRefleksiX(); T3X = T3.getRefleksiX();
        System.out.println("Titik T1 : "); T1.PrintTitik();
        System.out.println("Titik T13 : "); T1X.PrintTitik();
        System.out.println("Titik T3 : "); T3.PrintTitik();
        System.out.println("Titik T3X : "); T3X.PrintTitik();
        System.out.println("Sekarang kita Refleksi T1 dan T3 terhadap sumbu X");
        T1.refleksiX(); T3.refleksiX();
        System.out.println("Titik T1 Sekarang : "); T1.PrintTitik();
        System.out.println("Titik T3 Sekarang : "); T3.PrintTitik();

        // Refleksi Y dan getRefleksiY
        System.out.println("======================================================");
        System.out.println("Titik T2Y dan T4Y adalah hasil refleksi terhadap sumbu Y oleh titik T2 dan T4");
        T2Y = T2.getRefleksiY(); T4Y = T4.getRefleksiY();
        System.out.println("Titik T2 : "); T2.PrintTitik();
        System.out.println("Titik T2Y : "); T2Y.PrintTitik();
        System.out.println("Titik T4 : "); T4.PrintTitik();
        System.out.println("Titik T4Y : "); T4Y.PrintTitik();
        System.out.println("Sekarang kita Refleksi T2 dan T4 terhadap sumbu Y");
        T2.refleksiY(); T4.refleksiY();
        System.out.println("Titik T2 Sekarang : "); T2.PrintTitik();
        System.out.println("Titik T4 Sekarang : "); T4.PrintTitik();


        // Rotasi
        System.out.println("======================================================");
        System.out.println("T1 : "); T1.PrintTitik();
        System.out.println("T2 : "); T2.PrintTitik();
        System.out.println("T3 : "); T3.PrintTitik();
        System.out.println("T4 : "); T4.PrintTitik();
        System.out.println("Kita akan merotasi Ke-4 titik tersebut sejauh K derajat");
        System.out.println("Masukkan Besar Sudutnya : ");
        Rotasi0 = input.nextDouble();
        T1.rotasi(Rotasi0); T2.rotasi(Rotasi0); T3.rotasi(Rotasi0); T4.rotasi(Rotasi0);
        System.out.println("Sekarang ke-4 Titik tersebut tergeser menjadi :");
        T1.PrintTitik(); T2.PrintTitik(); T3.PrintTitik(); T4.PrintTitik();


        // Geser
        System.out.println("======================================================");
        System.out.println("T1 : "); T1.PrintTitik();
        System.out.println("T2 : "); T2.PrintTitik();
        System.out.println("T3 : "); T3.PrintTitik();
        System.out.println("T4 : "); T4.PrintTitik();
        System.out.println("Kita akan menggeser semua Titik tersebut sebanyak x dan y");
        System.out.println("Silahkan masukkan nilai x untuk menggeser nilai absis");
        GeserX = input.nextDouble();
        System.out.println("Silahkan masukkan nilai y untuk menggeser nilai ordinat");
        GeserY = input.nextDouble();
        T1.Geser(GeserX, GeserY); T2.Geser(GeserX, GeserY);
        T3.Geser(GeserX, GeserY); T4.Geser(GeserX, GeserY);
        System.out.println("Sekarang ke-4 Titik tersebut tergeser menjadi :");
        T1.PrintTitik(); T2.PrintTitik(); T3.PrintTitik(); T4.PrintTitik();

        input.close();

        // TotalTitikDibuat
        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("Ada berapa Titik yang telah Kita Buat?");
        SumTitik = Titik.getCounterTitik();
        System.out.println(SumTitik);
        System.out.println("======================================================");
        System.out.println("======================================================");
    }
}
