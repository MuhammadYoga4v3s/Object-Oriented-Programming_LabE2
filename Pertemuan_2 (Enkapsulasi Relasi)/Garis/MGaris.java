/* NamaFile  : MGaris.java
 * Deskripsi : berisi atribut dan Method dalam class Garis (2 Titik)
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 23/02/2025
 */

public class MGaris {
    public static void main(String[] args){
    /* Kamus */
    Garis G1,G2,G3,G4 ;
    Titik T00, T44, T02, T46 ;
    Titik G1Awal, G1Akhir, G2Awal, G2Akhir;

    /* Tester */
    G1 = new Garis(); G2 = new Garis(); 
    G3 = new Garis(); G4 = new Garis();
    System.out.println("Saat ini Kita punya 4 garis dasar, Semuanya : ");
    G1.Print2Titik();

    // Set Nilai Nilai Garis
    System.out.println("========================================================================");
    T00 = new Titik(0,0); T44 = new Titik(4,4);
    T02 = new Titik(0,2); T46 = new Titik(4,6);
    G1.setTitikAkhir(T00); G1.setTitikAwal(T44); 
    G2.setTitikAwal(T02); G2.setTitikAkhir(T46);
    G3.setTitikAwal(new Titik(1,1)); G3.setTitikAkhir(new Titik(3,5));
    G4.setTitikAwal(new Titik(0,3)); G4.setTitikAkhir(new Titik(4,1));
    System.out.println("Sekarang Garis Garis Kita menjadi : ");
    G1.Print2Titik(); G2.Print2Titik(); G3.Print2Titik(); G4.Print2Titik();

    // Mengambil Titik titik pada garis
    System.out.println("========================================================================");
    System.out.println("Sekarang kita ingin mengambil Titik awal dan Titik Akhir G1 dan G2");
    G1Awal = G1.getTitikAwal(); G1Akhir = G1.getTitikAkhir();
    G2Awal = G2.getTitikAwal(); G2Akhir = G2.getTitikAkhir();
    System.out.println("Berturut turut adalah");
    G1Awal.PrintTitik(); G1Akhir.PrintTitik(); G2Awal.PrintTitik(); G2Akhir.PrintTitik();

    // Menghitung Panjang garis
    System.out.println("========================================================================");
    System.out.println("Sekarang kita akan menghitung panjang ke-4 garis kita");
    System.out.println("G1 : " + G1.getPanjang());
    System.out.println("G2 : " + G2.getPanjang());
    System.out.println("G3 : " + G3.getPanjang());
    System.out.println("G4 : " + G4.getPanjang());

    // Menghitung Gradien garis
    System.out.println("========================================================================");
    System.out.println("Sekarang kita akan menghitung gradien garis kita");
    System.out.println("G1 : " + G1.getGradien());
    System.out.println("G2 : " + G2.getGradien());
    System.out.println("G3 : " + G3.getGradien());
    System.out.println("G4 : " + G4.getGradien());

    // Titik Tengah garis
    System.out.println("========================================================================");
    System.out.println("Sekarang kita akan meencari titik tengah ke-4 garis tersebut");
    System.out.println("G1 Titik Tengahnya : "); G1.TitikTengah().PrintTitik();
    System.out.println("G2 Titik Tengahnya : "); G2.TitikTengah().PrintTitik();
    System.out.println("G3 Titik Tengahnya : "); G3.TitikTengah().PrintTitik();
    System.out.println("G4 Titik Tengahnya : "); G4.TitikTengah().PrintTitik();
    
    // IsSejajar
    System.out.println("========================================================================");
    System.out.println("Apakah G1 Sejajar G2? " + G1.IsSejajar(G2));
    System.out.println("Apakah G1 Sejajar G3? " + G1.IsSejajar(G3));
    System.out.println("Apakah G2 Sejajar G4? " + G2.IsSejajar(G4));
    System.out.println("Apakah G3 Sejajar G4? " + G3.IsSejajar(G4));

    // IsTegakLurus
    System.out.println("========================================================================");
    System.out.println("Apakah G1 Tegak Lurus G2? " + G1.IsTegakLurus(G2));
    System.out.println("Apakah G1 Tegak Lurus G3? " + G1.IsTegakLurus(G3));
    System.out.println("Apakah G2 Tegak Lurus G4? " + G2.IsTegakLurus(G4));
    System.out.println("Apakah G3 Tegak Lurus G4? " + G3.IsTegakLurus(G4));

    // Persamaan Garisnya
    System.out.println("========================================================================");
    System.out.println("Berikut adalah persamaan Persamaan garis ke-4 garis tersebut");
    System.out.println("G1 : "); G1.printPersamaanGaris();
    System.out.println("G2 : "); G2.printPersamaanGaris();
    System.out.println("G3 : "); G3.printPersamaanGaris();
    System.out.println("G4 : "); G4.printPersamaanGaris();
    }
}
