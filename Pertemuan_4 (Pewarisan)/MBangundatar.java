/* NamaFile  : MBangunDatar.java
 * Deskripsi : Berisi Aplikasi dari Objek Bangun datar, lingkaran dan Persegi
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 13/03/2025
 */

import java.util.Scanner;

public class MBangundatar {
    public static void main(String[] args) {
        /* ======================== KAMUS ======================== */
        Scanner input;
        BangunDatar BD, bdPersegi;
        Persegi PG1, pg;
        Lingkaran L1, ling;
        int pilihan;
        double sisi, diameter;

        /* ======================== ALGORITMA ======================== */
        input = new Scanner(System.in);
        
        // Membuat objek Bangun datar
        BD = new BangunDatar();
        BD.setBorder("Hitam");
        BD.setWarna("Pink");
        BD.setJumlahSisi(7);
        System.out.println("============ INFO BANGUN DATAR ================");
        BD.PrintInfo();

        // Membuat objek Persegi
        System.out.println("============ INFO PERSEGI ================");
        PG1 = new Persegi(9, "Maroon", "Gold");
        System.out.println("Persegi memiliki Sisi sepanjang " + PG1.getJumlahSisi());
        PG1.setSisi(89);
        System.out.println("Persegi memiliki Sisi sepanjang :\t" + PG1.getJumlahSisi());
        System.out.println("Persegi memiliki luas sebesar :\t" + PG1.getLuas());
        System.out.println("Persegi memiliki Keliling sebesar :\t" + PG1.getKeliling());
        System.out.println("Persegi memiliki Diagonal sebesar :\t" + PG1.getDiagonal());

        // Membuat objek Persegi menggunakan BangunDatar
        System.out.println("============ INFO PERSEGI DARI BangunDatar ================");
        bdPersegi = new BangunDatar();
        bdPersegi.setBorder("Biru");
        bdPersegi.setWarna("Coklat");
        bdPersegi.setJumlahSisi(4);
        bdPersegi.PrintInfo();

        // Membuat objek Lingkaran
        System.out.println("============ INFO LINGKARAN ================");
        L1 = new Lingkaran(9, "Maroon", "Gold");
        System.out.println("Lingkaran memiliki Jari-jari sepanjang " + L1.getJari2());
        System.out.println("Lingkaran memiliki luas sebesar :\t" + L1.getLuas());
        System.out.println("Lingkaran memiliki Keliling sebesar :\t" + L1.getKeliling());
        
        // Input manual untuk memilih bentuk
        System.out.println("\nPilih bentuk yang ingin dibuat (1: Persegi, 2: Lingkaran): ");
        pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.print("Masukkan panjang sisi persegi: ");
            sisi = input.nextDouble();
            pg = new Persegi(sisi, "Biru", "Hitam");
            System.out.println("\n============ INFO PERSEGI (INPUT MANUAL) ================");
            pg.PrintInfo();
            System.out.println("Luas: " + pg.getLuas());
            System.out.println("Keliling: " + pg.getKeliling());
            System.out.println("Diagonal: " + pg.getDiagonal());
        } else if (pilihan == 2) {
            System.out.print("Masukkan diameter lingkaran: ");
            diameter = input.nextDouble();
            ling = new Lingkaran(diameter, "Hijau", "Merah");
            System.out.println("\n============ INFO LINGKARAN (INPUT MANUAL) ================");
            ling.PrintInfo();
            System.out.println("Luas: " + ling.getLuas());
            System.out.println("Keliling: " + ling.getKeliling());
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        input.close();
    }
}