/* NamaFile  : MManusia.java
 * Deskripsi : Class utama dengan demonstrasi kompleks Manusia, PNS, Pengusaha, dan Petani
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 23/04/2025
 */

 import java.util.*;
 import java.text.SimpleDateFormat;
 
 public class MManusia {
     private static Scanner scanner = new Scanner(System.in);
     private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     
     public static void main(String[] args) {
         ArrayList<Manusia> daftarManusia = new ArrayList<>();
         int choice;
         do {
             System.out.println("\n============ SISTEM MANAJEMEN MANUSIA ============");
             System.out.println("1. Tambah PNS");
             System.out.println("2. Tambah Pengusaha");
             System.out.println("3. Tambah Petani");
             System.out.println("4. Tampilkan Semua");
             System.out.println("5. Hitung Total Pajak");
             System.out.println("6. Cari Berdasarkan Nama");
             System.out.println("7. Urutkan Berdasarkan Pendapatan");
             System.out.println("8. Simpan ke File");
             System.out.println("9. Keluar");
             System.out.print("Pilihan: ");
             choice = scanner.nextInt();
             scanner.nextLine(); 
             
             switch(choice) {
                 case 1:
                     daftarManusia.add(createPNS());
                     break;
                 case 2:
                     daftarManusia.add(createPengusaha());
                     break;
                 case 3:
                     daftarManusia.add(createPetani());
                     break;
                 case 4:
                     displayAll(daftarManusia);
                     break;
                 case 5:
                     calculateTotalTax(daftarManusia);
                     break;
                 case 6:
                     searchByName(daftarManusia);
                     break;
                 case 7:
                     sortByIncome(daftarManusia);
                     break;
                 case 8:
                     saveToFile(daftarManusia);
                     break;
                 case 9:
                     System.out.println("Keluar...");
                     break;
                 default:
                     System.out.println("Pilihan tidak valid!");
             }
         } while(choice != 9);
     }
     
     private static PNS createPNS() {
         System.out.println("\n-- Input Data PNS --");
         System.out.print("Nama: ");
         String nama = scanner.nextLine();
         
         System.out.print("Tanggal Mulai Kerja (dd/mm/yyyy): ");
         Date tglMulai = parseDate(scanner.nextLine());
         
         System.out.print("Alamat: ");
         String alamat = scanner.nextLine();
         
         System.out.print("Pendapatan: ");
         double pendapatan = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("NIP: ");
         String nip = scanner.nextLine();
         
         return new PNS(nama, tglMulai, alamat, pendapatan, nip);
     }
     
     private static Pengusaha createPengusaha() {
         System.out.println("\n-- Input Data Pengusaha --");
         System.out.print("Nama: ");
         String nama = scanner.nextLine();
         
         System.out.print("Tanggal Mulai Usaha (dd/mm/yyyy): ");
         Date tglMulai = parseDate(scanner.nextLine());
         
         System.out.print("Alamat: ");
         String alamat = scanner.nextLine();
         
         System.out.print("Pendapatan: ");
         double pendapatan = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("NPWP: ");
         String npwp = scanner.nextLine();
         
         return new Pengusaha(nama, tglMulai, alamat, pendapatan, npwp);
     }
     
     private static Petani createPetani() {
         System.out.println("\n-- Input Data Petani --");
         System.out.print("Nama: ");
         String nama = scanner.nextLine();
         
         System.out.print("Tanggal Mulai Bertani (dd/mm/yyyy): ");
         Date tglMulai = parseDate(scanner.nextLine());
         
         System.out.print("Alamat: ");
         String alamat = scanner.nextLine();
         
         System.out.print("Pendapatan: ");
         double pendapatan = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Asal Kota: ");
         String asalKota = scanner.nextLine();
         
         return new Petani(nama, tglMulai, alamat, pendapatan, asalKota);
     }
     
     private static Date parseDate(String dateStr) {
         try {
             return dateFormat.parse(dateStr);
         } catch(Exception e) {
             System.out.println("Format tanggal salah! Gunakan dd/mm/yyyy");
             return new Date(); // Return tanggal sekarang jika error
         }
     }
     
     private static void displayAll(ArrayList<Manusia> list) {
         System.out.println("\n-- Daftar Semua Manusia --");
         System.out.printf("%-5s %-20s %-15s %-15s %-12s %-10s\n", 
                          "No", "Nama", "Jenis", "Masa Kerja", "Pendapatan", "Pajak");
         
         for(int i=0; i<list.size(); i++) {
             Manusia m = list.get(i);
             String jenis = m.getClass().getSimpleName();
             String masaKerja = m.HitungMasaKerja() + " tahun";
             String pendapatan = String.format("Rp%,.2f", m.getPendapatan());
             String pajak = String.format("Rp%,.2f", ((Pajak)m).HitungPajak());
             
             System.out.printf("%-5d %-20s %-15s %-15s %-12s %-10s\n", 
                             (i+1), m.getNama(), jenis, masaKerja, pendapatan, pajak);
         }
         
         System.out.println("\nTotal Data: " + list.size());
         System.out.println("PNS: " + PNS.getCounterPNS());
         System.out.println("Pengusaha: " + Pengusaha.getCounterPengusaha());
         System.out.println("Petani: " + Petani.getCounterPetani());
     }
     
     private static void calculateTotalTax(ArrayList<Manusia> list) {
         double total = 0;
         for(Manusia m : list) {
             total += ((Pajak)m).HitungPajak();
         }
         System.out.println("\nTotal Pajak Semua: Rp" + String.format("%,.2f", total));
     }
     
     private static void searchByName(ArrayList<Manusia> list) {
         System.out.print("\nMasukkan nama yang dicari: ");
         String search = scanner.nextLine().toLowerCase();
         
         System.out.println("\n-- Hasil Pencarian --");
         boolean found = false;
         
         for(Manusia m : list) {
             if(m.getNama().toLowerCase().contains(search)) {
                 m.cetakInfo();
                 System.out.println();
                 found = true;
             }
         }
         
         if(!found) {
             System.out.println("Data tidak ditemukan!");
         }
     }
     
     private static void sortByIncome(ArrayList<Manusia> list) {
         Collections.sort(list, new Comparator<Manusia>() {
             @Override
             public int compare(Manusia m1, Manusia m2) {
                 return Double.compare(m2.getPendapatan(), m1.getPendapatan());
             }
         });
         
         System.out.println("\nData berhasil diurutkan berdasarkan pendapatan tertinggi!");
         displayAll(list);
     }
     
     private static void saveToFile(ArrayList<Manusia> list) {
         // Implementasi penyimpanan ke file
         System.out.println("\nFitur penyimpanan ke file dalam pengembangan!");
     }
 }