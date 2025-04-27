/* NamaFile  : MAnabul.java
 * Deskripsi : Program utama untuk mensimulasikan anabul
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args) {
        // Membuat koleksi anabul
        ArrayList<Anabul> pets = new ArrayList<>();
        pets.add(new Kucing("Margaret"));
        pets.add(new Anjing("Colonel Ruff"));
        pets.add(new Burung("The Emperor of Madness and the eye of Captain Jack Sparrow"));
        
        // Mensimulasikan semua anabul
        for (Anabul pet : pets) {
            pet.tampilInfo();
            pet.bersuara();
            pet.bergerak();
            System.out.println();
        }
    }
}