/* NamaFile  : MainAnabul.java
 * Deskripsi : Demonstrasi penggunaan Generic Anabul dengan koleksi yang bermetamorfosis
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_6;

import java.util.*;

public class MainAnabul {
    public static void main(String[] args) {
        /*================================= Kamus ===================================*/
        Collection<AnabulGeneric<?>> koleksiAnabul;
        TreeSet<AnabulGeneric<?>> sortedSet;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        /*================================ ALgoritma ================================*/
        koleksiAnabul = new ArrayList<>();
        System.out.println("===== Koleksi dimulai sebagai ArrayList =====");
        
        // membuat sejumlah Anabul (10-15)
        int totalAnabul = 10 + random.nextInt(6);
        System.out.println("Total anabul yang akan dibuat: " + totalAnabul);
        
        for (int i = 1; i <= totalAnabul; i++) {
            System.out.print("\nMasukkan nama anabul #" + i + ": ");
            String nama = scanner.nextLine();
            
            int jenis = random.nextInt(3); // Random jenis Anabul-nya
            String jenisAnabul = "";
            
            AnabulGeneric<?> anabul = null;
            switch(jenis) {
                case 0 -> {
                    jenisAnabul = "Anjing";
                    anabul = new AnabulGeneric<Anjing>();
                    ((AnabulGeneric<Anjing>) anabul).setJenis(new Anjing(nama));
                }
                case 1 -> {
                    jenisAnabul = "Kucing";
                    anabul = new AnabulGeneric<Kucing>();
                    ((AnabulGeneric<Kucing>) anabul).setJenis(new Kucing(nama));
                }
                case 2 -> {
                    jenisAnabul = "Burung";
                    anabul = new AnabulGeneric<Burung>();
                    ((AnabulGeneric<Burung>) anabul).setJenis(new Burung(nama));
                }
            }
            
            System.out.println("Anabul " + nama + " terpilih sebagai: " + jenisAnabul);
            koleksiAnabul.add(anabul);
        }
        
        // METAMORFOSIS PERTAMA: Menjadi LinkedList
        koleksiAnabul = new LinkedList<>(koleksiAnabul);
        System.out.println("\n======= Koleksi menjadi LinkedList ========");
        
        // METAMORFOSIS KEDUA: Menjadi TreeSet (terurut berdasarkan nama)
        sortedSet = new TreeSet<>(Comparator.comparing(a -> a.getJenis().getNama()));
        sortedSet.addAll(koleksiAnabul);
        
        // Display all Anabul
        System.out.println("\n--===================== HASIL AKHIR ====================");
        System.out.println("Bentuk akhir koleksi: TreeSet (terurut berdasarkan nama)");
        System.out.println("========================================================");
        
        int counter = 1;
        for (AnabulGeneric<?> anabul : sortedSet) {
            System.out.println("\n>> Anabul #" + counter++);
            anabul.ShowAll();
            System.out.println("Jenis: " + anabul.getJenis().getClass().getSimpleName());
            System.out.println("-------------------------------------");
        }
        
        System.out.println("\nTotal anabul: " + sortedSet.size());
        System.out.println("=========================================================");
        
        scanner.close();
    }
}
