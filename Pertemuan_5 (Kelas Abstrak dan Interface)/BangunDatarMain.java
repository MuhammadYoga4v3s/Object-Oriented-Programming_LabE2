/*  Nama File   : BangunDatarMain.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatarMain
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

public class BangunDatarMain {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*      INITIALIZATION PROGRAM BANGUN DATAR          *");
        System.out.println("*****************************************************\n");
        System.out.println("/******************* PERSEGI *******************/");
        Persegi persegi = new Persegi(5, "Merah", "Putih");
        System.out.println("Luas P1: " + persegi.getLuas());
        System.out.println("Keliling P1: " + persegi.getKeliling());
        System.out.println("Diagonal P1: " + persegi.getDiagonal());
        persegi.printInfo();

        System.out.println("\n/******************* LINGKARAN *******************/");
        Lingkaran lingkaran = new Lingkaran(0, "Biru", "Hitam");
        lingkaran.setJariJari(7);
        System.out.println("Luas L2: " + lingkaran.getLuas());
        System.out.println("Keliling L2: " + lingkaran.getKeliling());
        System.out.println("Jari-jari L2: " + lingkaran.getJariJari());
        lingkaran.printInfo();

        System.out.println("\n/******************* PERBANDINGAN LUAS DAN KELILING *******************/");
        double sisiP2 = Math.sqrt(Math.PI * 7 * 7 );
        Persegi P2 = new Persegi(sisiP2, "Biru", "Hitam");

        double diameterL2 = 2 * Math.sqrt(100 / Math.PI);
        Lingkaran L2 = new Lingkaran(diameterL2, "Merah", "Putih");

        double sisiP3 = (Math.PI * 14) / 4;
        Persegi P3 = new Persegi(sisiP3, "Biru", "Hitam");

        double diameterL3 = 20 / Math.PI;
        Lingkaran L3 = new Lingkaran(diameterL3, "Merah", "Putih");

        System.out.println("Perbandingan Luas:");
        System.out.println("P2 = P3 : " + P2.isEqualLuas(P3));
        System.out.println("P2 = L2 : " + P2.isEqualLuas(L2));
        System.out.println("P3 = L3 : " + P3.isEqualLuas(L3));

        System.out.println("\nPerbandingan Keliling:");
        System.out.println("P2 = P3 : " + P2.isEqualKeliling(P3));
        System.out.println("P2 = L2 : " + P2.isEqualKeliling(L2));
        System.out.println("P3 = L3 : " + P3.isEqualKeliling(L3));

        System.out.println("\nNilai Luas dan Keliling:");
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Luas P3: " + P3.getLuas());
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Luas L3: " + L3.getLuas());

        System.out.println("\nKeliling P2: " + P2.getKeliling());
        System.out.println("Keliling P3: " + P3.getKeliling());
        System.out.println("Keliling L2: " + L2.getKeliling());
        System.out.println("Keliling L3: " + L3.getKeliling());

        System.out.println("\n/******************* INTERFACE IRESIZE *******************/");
        System.out.println("IResize Persegi P2");
        System.out.println("Sisi awal: " + P2.getSisi());
        System.out.println("Luas awal: " + P2.getLuas());

        P2.zoomIn();
        System.out.println("\nSetelah zoomIn:");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        P2.zoomOut();
        System.out.println("\nSetelah zoomOut:");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        System.out.println("\nIResize Lingkaran L2");
        System.out.println("Jari-jari awal: " + L2.getJariJari());
        System.out.println("Luas awal: " + L2.getLuas());

        L2.zoomIn();
        System.out.println("\nSetelah zoomIn:");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        L2.zoomOut();
        System.out.println("\nSetelah zoomOut:");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        System.out.println("\nRefrence IResize");
        IResize resizebleP = P2;
        IResize resizebleL = L2;

        resizebleP.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Sisi: " + P2.getSisi());

        resizebleL.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Jari-jari: " + L2.getJariJari());

        System.out.println("\n/******************* JUMLAH BANGUN DATAR *******************/");
        BangunDatar.printCounterBangunDatar();

        System.out.println("\n/******************* END PROGRAM BANGUN DATAR *******************/");
    }
}