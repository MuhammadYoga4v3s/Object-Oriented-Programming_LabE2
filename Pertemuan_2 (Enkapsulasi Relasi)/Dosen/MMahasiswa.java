/* NamaFile  : Dosen.java
 * Deskripsi : berisi atribut dan Method dalam class Dosen
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/02/2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Kamus */
        Mahasiswa Rajin, Malas;
        Dosen Killer, BaikHati;
        MataKuliah Easy, Hard, Medium, Advanced;
        Kendaraan Roda2, Roda4, RodaX;
        String InputK;
        ArrayList<MataKuliah> daftarMatkul;
        String pilihan, Namamu;

        /* Tester */
        Rajin = new Mahasiswa(); Malas = new Mahasiswa();
        Killer = new Dosen(); BaikHati = new Dosen();
        Easy = new MataKuliah(); Hard = new MataKuliah();
        Medium = new MataKuliah(); Advanced = new MataKuliah();
        Roda2 = new Kendaraan(); Roda4 = new Kendaraan();
        RodaX = new Kendaraan();
        daftarMatkul = new ArrayList<>();
        daftarMatkul.add(Easy); daftarMatkul.add(Medium);
        daftarMatkul.add(Hard); daftarMatkul.add(Advanced);

        /* Object : Dosen */
        System.out.println("=========================================================================");
        System.out.println("Kita memiliki 2 orang dosen : Killer dan Baikhati");
        // Mutator
        Killer.setNama("Devilman"); BaikHati.setNama("Atma");
        Killer.setNIP("1313666"); BaikHati.setNIP("7777777");
        Killer.setProdi("Sastra Komputer"); BaikHati.setProdi("Informatika");
        // Selektor
        System.out.println("=========================================================================");
        System.out.println("Dosen Killer : ");
        System.out.println("Nama\t:\t" + Killer.getNama());
        System.out.println("NIP\t:\t" + Killer.getNIP());
        System.out.println("Prodi\t:\t" + Killer.getProdi());
        System.out.println("Dosen BaikHati : ");
        System.out.println("Nama\t:\t" + BaikHati.getNama());
        System.out.println("NIP\t:\t" + BaikHati.getNIP());
        System.out.println("Prodi\t:\t" + BaikHati.getProdi());

        /* Object : Kendaraan */
        System.out.println("Terdapat 3 Kendaraan, Roda2 motor, Roda4 mobil dan RodaX terserah anda");
        // Mutator
        System.out.println("=========================================================================");
        Roda2.setNoPlat("QU33N"); Roda4.setNoPlat("K1N6"); RodaX.setNoPlat("TI4R4");
        Roda2.setJenis("Motor"); Roda4.setJenis("Mobil");
        System.out.println("Silahkan Masukkan Jenis untuk Kendaraan RodaX (kendaraanmu) ^^");
        InputK = input.nextLine(); RodaX.setJenis(InputK);
        while (!InputK.equals("Mobil") && !InputK.equals("Motor")) {
            System.out.println("Input lagi ya :>");
            InputK = input.nextLine();
            RodaX.setJenis(InputK);
        }
        System.out.println("Makasih ^^, Sekarang Kita Punya 3 Kendaraan");
        // Selektor
        System.out.println("=========================================================================");
        System.out.println("Kendaraan Pertama : ");
        System.out.println("PlatNo\t :\t" + Roda2.getNoPLat());
        System.out.println("Jenis\t :\t" + Roda2.getJenis());
        System.out.println("Kendaraan Kedua : ");
        System.out.println("PlatNo\t :\t" + Roda4.getNoPLat());
        System.out.println("Jenis\t :\t" + Roda4.getJenis());
        System.out.println("Kendaraan Ketiga : ");
        System.out.println("PlatNo\t :\t" + RodaX.getNoPLat());
        System.out.println("Jenis\t :\t" + RodaX.getJenis());

        /* Object : MataKuliah */
        System.out.println("=========================================================================");
        System.out.println("Ada 4 matakuliah yang bisa dipilih setiap mahasiswa");
        System.out.println("Adalah Easy, Medium, Hard, Advanced");
        // Mutator
        Easy.setIDMatkul("A101B1"); Easy.setNamaMK("Binary Saga"); Easy.setSKS(2);
        Medium.setIDMatkul("Ak2022"); Medium.setNamaMK("Web Enchantment"); Medium.setSKS(3);
        Hard.setIDMatkul("ACCG451H"); Hard.setNamaMK("Cryptic Runes"); Hard.setSKS(4);
        Advanced.setIDMatkul("R4D4G1L4"); Advanced.setNamaMK("Final Computation"); Advanced.setSKS(8);
        // Selektor
        System.out.println("=========================================================================");
        System.out.println("Detail ke-4 MataKuliah Tersebut adalah");
        System.out.println("Mata Kuliah Easy :");
        System.out.println("IDMatkul\t :\t" + Easy.getIDMatkul());
        System.out.println("Nama\t :\t" + Easy.getNamaMK());
        System.out.println("Jumlah SKS\t :\t" + Easy.getSKS());
        System.out.println("Mata Kuliah Medium :");
        System.out.println("IDMatkul\t :\t" + Medium.getIDMatkul());
        System.out.println("Nama\t :\t" + Medium.getNamaMK());
        System.out.println("Jumlah SKS\t :\t" + Medium.getSKS());
        System.out.println("Mata Kuliah Hard :");
        System.out.println("IDMatkul\t :\t" + Hard.getIDMatkul());
        System.out.println("Nama\t :\t" + Hard.getNamaMK());
        System.out.println("Jumlah SKS\t :\t" + Hard.getSKS());
        System.out.println("Mata Kuliah Advanced :");
        System.out.println("IDMatkul\t :\t" + Advanced.getIDMatkul());
        System.out.println("Nama\t :\t" + Advanced.getNamaMK());
        System.out.println("Jumlah SKS\t :\t" + Advanced.getSKS());

        /* Mahasiswa */
        System.out.println("===================================================================================");
        System.out.println("Kita ada 2 Mahasiswa, Mahasiswa Rajin dan Mahasiswa Malas");
        System.out.println("Nah yang ini Mahasiswa Malas dulu ya");
        // Mutator
        Malas.setNama("X Æ A-12"); Malas.setNIM("24060122222222"); Malas.setKendaraan(Roda2);
        Malas.setDosenWali(BaikHati); Malas.setProdi("Sastra Komputer");
        Malas.addMatkul(Easy);

        Rajin.setNIM("24060123130106"); Rajin.setKendaraan(RodaX); Rajin.setProdi("Informatika");
        Rajin.setDosenWali(Killer);

        // JumlahMatkul, JumlahSKS, PrintMHS
        System.out.println("Mahasiswa Malas Mengambil Matkul sebanyak : " + Malas.getJumlahMatkul());
        System.out.println("Mahasiswa Malas Mengambil Total SKS sebanyak : " + Malas.getJumlahSKS());
        Malas.PrintMhs();

        System.out.println("===================================================================================");
        System.out.println("Sekarang Giliran kamu ngambil Matkul nih, oh iya kenalan dulu ya");
        System.out.println("Kamu maw dipanggil siapa ^^\nInput di sini yaa");
        Namamu = input.nextLine(); Rajin.setNama(Namamu);
        System.out.println("Ok jadi namamu \t:\t" + Rajin.getNama());
        Rajin.PrintMhs();

        System.out.println("===================================================================================");
        System.out.println("Kita ada 4 Mata Kuliah. Kamu sebagai Mahasiswa Rajin bisa memilih beberapa di antaranya.");
        int i = 0;
        while (i < daftarMatkul.size()) {
            MataKuliah mk = daftarMatkul.get(i);
            System.out.println("Mata Kuliah: " + mk.getNamaMK() + " (" + mk.getSKS() + " SKS)");
            System.out.print("Ambil mata kuliah ini? (ya/tidak): ");
            pilihan = input.nextLine().trim().toLowerCase();

            if (pilihan.equals("ya")) {
                Rajin.addMatkul(mk);
            }

            i++;
        }

        System.out.println("OK, Makasih yaa, datamu udah lengkap\n silahkan cek ulang");
        Rajin.PrintDetailMhs();
        input.close();
    }
}
