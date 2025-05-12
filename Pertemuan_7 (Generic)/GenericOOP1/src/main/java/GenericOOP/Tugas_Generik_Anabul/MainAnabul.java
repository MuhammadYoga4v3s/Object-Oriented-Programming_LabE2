/* NamaFile  : AnabulGenericTest.java
 * Deskripsi : Kelas Main untuk menguji Generic Anabul dengan List dan input pengguna
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Generik_Anabul;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainAnabul {
    public static void main(String[] args) {
        /* Kamus */
        Scanner input;
        String namaKucing, namaAnjing, namaBurung;
        Kucing k;
        Anjing a;
        Burung b;
        Datum<Kucing> Dk;
        Datum<Anjing> Da;
        Datum<Burung> Db;
        ContohMetodeGeneric tool;
        List<Datum<? extends Anabul>> daftar;

        /* Algoritma */
        input = new Scanner(System.in);

        System.out.print("Masukkan nama Kucing  : ");
        namaKucing = input.nextLine();
        System.out.print("Masukkan nama Anjing  : ");
        namaAnjing = input.nextLine();
        System.out.print("Masukkan nama Burung  : ");
        namaBurung = input.nextLine();

        k = new Kucing(namaKucing);
        a = new Anjing(namaAnjing);
        b = new Burung(namaBurung);

        Dk = new Datum<>();
        Da = new Datum<>();
        Db = new Datum<>();

        tool = new ContohMetodeGeneric();

        Dk.setJenis(k);
        Da.setJenis(a);
        Db.setJenis(b);

        // Uji method biasa
        System.out.println("\n==> Testing Method Datum:");
        Dk.bergerak(); Dk.bersuara(); Dk.tampilInfo();
        Da.bergerak(); Da.bersuara(); Da.tampilInfo();
        Db.bergerak(); Db.bersuara(); Db.tampilInfo();

        // Uji method generic
        System.out.println("\n==> Testing Fungsi Generic:");
        Anabul hasil1 = tool.fungsi(Dk);
        hasil1.tampilInfo();

        Anabul hasil2 = tool.fungsi(Da);
        hasil2.tampilInfo();

        System.out.println("\n==> Testing Prosedur Generic:");
        tool.Prosedur(Db);

        // Uji dengan List
        System.out.println("\n==> Testing List of Datum<Anabul>:");
        daftar = new ArrayList<>();
        daftar.add(Dk);
        daftar.add(Da);
        daftar.add(Db);

        for (Datum<? extends Anabul> d : daftar) {
            System.out.println("\nObject dari: " + d.getJenis().getClass().getSimpleName());
            d.tampilInfo();
        }

        input.close();
    }
}
