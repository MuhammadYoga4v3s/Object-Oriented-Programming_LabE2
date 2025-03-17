/* Nama file  : MainPegawai.java
 * Deskripsi  : Merupakan Aplikasi dari setiap class yang telah dibuat dalam tugas oegawai
 * Pembuat    : Muhammad Yoga Aminudin / 24060123130106
 * Tanggal    : 17 Maret 2025 */

 import java.util.Scanner;

 public class MainPegawai {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         /* Kamus */
         Tendik Akademikus, Mahardika;
         DosenTetap Atma, Argo;
         DosenTamu Aves, Ardian;
         Tendik Anda;
         Dosen Anda2;
 
         /* Algoritma */
         // Inisialisasi Tendik menggunakan konstruktor
         Akademikus = new Tendik("12345", "Akademikus", new Tanggal("1 Januari 1980"), 
                      new Tanggal("1 Januari 2005"), 5000000.0, "Akademik");
         Mahardika = new Tendik();
 
         // Inisialisasi DosenTetap menggunakan setter
         Atma = new DosenTetap();
         Atma.setNIP("11223");
         Atma.setNama("Atma");
         Atma.setTanggalLahir(new Tanggal(10, 10, 1975));
         Atma.setTMT(new Tanggal(1, 1, 2006));
         Atma.setGajiPokok(10000000.0);
         Atma.setFakultas("Teknik");
         Atma.setNIDN("NIDN123");
 
         Argo = new DosenTetap();
         Argo.setNIP("44556");
         Argo.setNama("Argo");
         Argo.setTanggalLahir(new Tanggal("20 Februari 1980"));
         Argo.setTMT(new Tanggal("1 Januari 2005"));
         Argo.setGajiPokok(12000000.0);
         Argo.setFakultas("Sains");
         Argo.setNIDN("NIDN456");
 
         // Inisialisasi DosenTamu menggunakan konstruktor
         Aves = new DosenTamu("77889", "Aves", new Tanggal("5 Mei 1990"), 
                new Tanggal("1 Januari 2015"), 8000000.0, "Ekonomi", 
                "NIDK789", new Tanggal("31 Desember 2025"));
         Ardian = new DosenTamu();
         Ardian.setNIP("99001");
         Ardian.setNama("Ardian");
         Ardian.setTanggalLahir(new Tanggal("12 Agustus 1988"));
         Ardian.setTMT(new Tanggal("1 Januari 2010"));
         Ardian.setGajiPokok(9000000.0);
         Ardian.setFakultas("Hukum");
         Ardian.setNIDK("NIDK101");
         Ardian.setAkhirKontrak(new Tanggal("31 Desember 2030"));
 
         // Input Data untuk Anda (Tendik)
         System.out.println("=====================================================================");
         System.out.println("                     INPUT DATA ANDA (TENDIK)                        ");
         System.out.println("=====================================================================");
 
         System.out.print("Masukkan NIP Anda\t\t: ");
         String NIP = input.nextLine();
         System.out.print("Masukkan Nama Anda\t\t: ");
         String Nama = input.nextLine();
         System.out.println("\nMasukkan Tanggal Lahir (format: hari bulan tahun [integer]):");
         System.out.print("Hari\t: ");
         int hariLahir = input.nextInt();
         System.out.print("Bulan\t: ");
         int bulanLahir = input.nextInt();
         System.out.print("Tahun\t: ");
         int tahunLahir = input.nextInt();
         input.nextLine(); 
 
         System.out.println("\nMasukkan Tanggal TMT (format: hari bulan tahun):");
         System.out.print("Hari\t: ");
         int hariTMT = input.nextInt();
         System.out.print("Bulan\t: ");
         int bulanTMT = input.nextInt();
         System.out.print("Tahun\t: ");
         int tahunTMT = input.nextInt();
         input.nextLine();
 
         System.out.print("\nMasukkan Gaji Pokok\t\t: ");
         double GajiPokok = input.nextDouble();
         input.nextLine();
 
         System.out.print("Masukkan Bidang (Akademik/Kemahasiswaan/Sumber Daya): ");
         String bidang = input.nextLine();
 
         // Membuat Objek Anda (Tendik) menggunakan konstruktor
         try {
             Anda = new Tendik(NIP, Nama, new Tanggal(hariLahir, bulanLahir, tahunLahir), new Tanggal(hariTMT, bulanTMT, tahunTMT), GajiPokok, bidang);
 
             // Menampilkan Informasi Anda (Tendik)
             System.out.println("\n=====================================================================");
             System.out.println("                     INFORMASI ANDA (TENDIK)                        ");
             System.out.println("=====================================================================");
             Anda.printInfo();
         } catch (IllegalArgumentException e) {
             System.out.println("\nError: " + e.getMessage());
         }
 
         // Input Data untuk Anda2 (DosenTamu)
         System.out.println("\n=====================================================================");
         System.out.println("                     INPUT DATA ANDA2 (DOSEN TAMU)                    ");
         System.out.println("=====================================================================");
 
         System.out.print("Masukkan NIP Anda2\t\t: ");
         NIP = input.nextLine();
         System.out.print("Masukkan Nama Anda2\t\t: ");
         Nama = input.nextLine();
         System.out.println("\nMasukkan Tanggal Lahir (format: hari bulan tahun):");
         System.out.print("Hari\t: ");
         hariLahir = input.nextInt();
         System.out.print("Bulan\t: ");
         bulanLahir = input.nextInt();
         System.out.print("Tahun\t: ");
         tahunLahir = input.nextInt();
         input.nextLine(); 
 
         System.out.println("\nMasukkan Tanggal TMT (format: hari bulan tahun):");
         System.out.print("Hari\t: ");
         hariTMT = input.nextInt();
         System.out.print("Bulan\t: ");
         bulanTMT = input.nextInt();
         System.out.print("Tahun\t: ");
         tahunTMT = input.nextInt();
         input.nextLine(); 
 
         System.out.print("\nMasukkan Gaji Pokok\t\t: ");
         GajiPokok = input.nextDouble();
         input.nextLine(); 
 
         System.out.print("Masukkan Fakultas\t\t: ");
         String fakultas = input.nextLine();
         System.out.print("Masukkan NIDK\t\t\t: ");
         String NIDK = input.nextLine();
 
         System.out.println("\nMasukkan Tanggal Akhir Kontrak (format: hari bulan tahun):");
         System.out.print("Hari\t: ");
         int hariAkhirKontrak = input.nextInt();
         System.out.print("Bulan\t: ");
         int bulanAkhirKontrak = input.nextInt();
         System.out.print("Tahun\t: ");
         int tahunAkhirKontrak = input.nextInt();
         input.nextLine(); 
 
         // Membuat Objek Anda2 (DosenTamu) menggunakan konstruktor
         try {
             Anda2 = new DosenTamu(NIP, Nama, new Tanggal(hariLahir, bulanLahir, tahunLahir), new Tanggal(hariTMT, bulanTMT, tahunTMT), GajiPokok, fakultas, NIDK, new Tanggal(hariAkhirKontrak, bulanAkhirKontrak, tahunAkhirKontrak));
 
             // Menampilkan Informasi Anda2 (DosenTamu)
             System.out.println("\n=====================================================================");
             System.out.println("                     INFORMASI ANDA2 (DOSEN TAMU)                    ");
             System.out.println("=====================================================================");
             Anda2.printInfo();
         } catch (IllegalArgumentException e) {
             System.out.println("\nError: " + e.getMessage());
         }
 
         /* Menampilkan Informasi Lainnya */
         System.out.println("\n=====================================================================");
         System.out.println("                     INFORMASI TENAGA KEPENDIDIKAN (TENDIK)           ");
         System.out.println("=====================================================================");
         Akademikus.printInfo();
         System.out.println();
         System.out.println();
         Mahardika.printInfo();
 
         System.out.println("\n=====================================================================");
         System.out.println("                     INFORMASI DOSEN TETAP                            ");
         System.out.println("=====================================================================");
         Atma.printInfo();
         System.out.println();
         Argo.printInfo();
 
         System.out.println("\n=====================================================================");
         System.out.println("                     INFORMASI DOSEN TAMU                             ");
         System.out.println("=====================================================================");
         Aves.printInfo();
         System.out.println();
         Ardian.printInfo();
 
         input.close();
     }
 }