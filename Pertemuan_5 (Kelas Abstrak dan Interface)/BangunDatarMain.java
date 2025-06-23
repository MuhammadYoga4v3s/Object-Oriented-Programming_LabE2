/*  Nama File   : BangunDatarMain.java
 *  Deskripsi   : Program utama untuk menguji berbagai objek BangunDatar serta operasi perbandingan dan resize
 *  Pembuat     : Muhammad Yoga Aminudin
 *  NIM         : 24060123130106
 *  Tanggal     : 22 Juni 2025
 */

public class BangunDatarMain {
    public static void main(String[] args) {

        // Membuat dan menampilkan informasi persegi
        System.out.println("/******************* PERSEGI *******************/");
        Persegi persegi = new Persegi(5, "Merah", "Putih");
        System.out.println("Luas P1: " + persegi.getLuas());
        System.out.println("Keliling P1: " + persegi.getKeliling());
        System.out.println("Diagonal P1: " + persegi.getDiagonal());
        persegi.printInfo();

        // Membuat dan menampilkan informasi lingkaran
        System.out.println("\n/******************* LINGKARAN *******************/");
        Lingkaran lingkaran = new Lingkaran(0, "Biru", "Hitam");
        lingkaran.setJariJari(7);
        System.out.println("Luas L2: " + lingkaran.getLuas());
        System.out.println("Keliling L2: " + lingkaran.getKeliling());
        System.out.println("Jari-jari L2: " + lingkaran.getJariJari());
        lingkaran.printInfo();

        // Perbandingan luas dan keliling antara bangun datar yang berbeda
        System.out.println("\n/******************* PERBANDINGAN LUAS DAN KELILING *******************/");

        // Membuat objek baru untuk perbandingan luas dan keliling
        double sisiP2 = Math.sqrt(Math.PI * 7 * 7 );
        Persegi P2 = new Persegi(sisiP2, "Biru", "Hitam");

        double diameterL2 = 2 * Math.sqrt(100 / Math.PI);
        Lingkaran L2 = new Lingkaran(diameterL2, "Merah", "Putih");

        double sisiP3 = (Math.PI * 14) / 4;
        Persegi P3 = new Persegi(sisiP3, "Biru", "Hitam");

        double diameterL3 = 20 / Math.PI;
        Lingkaran L3 = new Lingkaran(diameterL3, "Merah", "Putih");

        // Menampilkan hasil perbandingan luas
        System.out.println("Perbandingan Luas:");
        System.out.println("P2 = P3 : " + P2.isEqualLuas(P3));
        System.out.println("P2 = L2 : " + P2.isEqualLuas(L2));
        System.out.println("P3 = L3 : " + P3.isEqualLuas(L3));

        // Menampilkan hasil perbandingan keliling
        System.out.println("\nPerbandingan Keliling:");
        System.out.println("P2 = P3 : " + P2.isEqualKeliling(P3));
        System.out.println("P2 = L2 : " + P2.isEqualKeliling(L2));
        System.out.println("P3 = L3 : " + P3.isEqualKeliling(L3));

        // Menampilkan nilai luas dan keliling masing-masing objek
        System.out.println("\nNilai Luas dan Keliling:");
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Luas P3: " + P3.getLuas());
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Luas L3: " + L3.getLuas());

        System.out.println("\nKeliling P2: " + P2.getKeliling());
        System.out.println("Keliling P3: " + P3.getKeliling());
        System.out.println("Keliling L2: " + L2.getKeliling());
        System.out.println("Keliling L3: " + L3.getKeliling());

        // Pengujian interface IResize pada objek Persegi dan Lingkaran
        System.out.println("\n/******************* INTERFACE IRESIZE *******************/");

        // Resize persegi menggunakan zoomIn dan zoomOut
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

        // Resize lingkaran menggunakan zoomIn dan zoomOut
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

        // Melakukan resize menggunakan referensi IResize
        System.out.println("\nRefrence IResize");
        IResize resizebleP = P2;
        IResize resizebleL = L2;

        resizebleP.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Sisi: " + P2.getSisi());

        resizebleL.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Jari-jari: " + L2.getJariJari());

        // Menampilkan total bangun datar yang telah dibuat
        System.out.println("\n/******************* JUMLAH BANGUN DATAR *******************/");
        BangunDatar.printCounterBangunDatar();

        // Akhir program
        System.out.println("\n/******************* END PROGRAM BANGUN DATAR *******************/");
    }
}
