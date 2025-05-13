/* NamaFile  : ArrayListTest.java
 * Deskripsi : Merupakan program penggunaan objek ArrayList sebagai Collection Class
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_3;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        /* Kamus */
        // Membuat ArrayList bertipe String yang bernama strings
        // hanya dapat berisi objek String
        ArrayList<String> strings;
        
        /* Algoritma */
        strings = new ArrayList<>();
        // Menambah elemen ke ArrayList : .add
        strings.add("=================");
        strings.add("Let me sail");
        strings.add("Cebu");
        strings.add("Peru");
        strings.add("Sail away");
        strings.add("=================");
        // Menghapus elemen ArrayList : .remove
        strings.remove("Sail away");
        // iterasi keseluruhan Array
        // Akses setiap elemen
        for(String S : strings){
            System.out.println(S+" ");
        }
    }
}
