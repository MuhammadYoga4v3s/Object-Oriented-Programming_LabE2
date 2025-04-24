/* NamaFile  : MManusia2.java
 * Deskripsi : MManusia2 melakukan tetsing semua atribut Manusia yang sudah dibuat
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 23/04/2025
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MManusia2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            PNS p1 = new PNS("Satriyo", sdf.parse("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
            Pengusaha pe1 = new Pengusaha("Adhy", sdf.parse("01-01-2000"), "Jl.Air", 55000000, "000-556-773-212-000-5");
            Petani pt1 = new Petani("Nugraha", sdf.parse("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
            PNS p2 = new PNS("Panji", sdf.parse("01-04-2010"), "Unknown", 10000000, "198004212010041002");
            p2.setAlamat("Jl. Panorama 111 Tembalang");

            System.out.println("Jumlah Manusia = " + Manusia.getCounterMHs());
            System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
            System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
            System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
            System.out.println("Pajak PNS p1 = " + p1.HitungPajak());
            System.out.println("Pajak Pengusaha pe1 = " + pe1.HitungPajak());
            System.out.println("Pajak Petani pt1 = " + pt1.HitungPajak());
            System.out.println("Masa Kerja p1 = " + p1.HitungMasaKerja());
            System.out.println("Masa Kerja pe1 = " + pe1.HitungMasaKerja());
            System.out.println("Masa Kerja pt1 = " + pt1.HitungMasaKerja());

            p1.cetakInfo();
            pe1.cetakInfo();
            pt1.cetakInfo();

        } catch (ParseException e) {
            System.out.println("Tanggal tidak valid: " + e.getMessage());
        }
    }
}
