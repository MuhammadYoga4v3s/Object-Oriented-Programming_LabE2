/* NamaFile  : MapTest.java
 * Deskripsi : Merupakan program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_3;

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        /* Kamus */
        // membuat Objek Koleksi Map dengan nama map
        // Kunci-> integer, Nilai -> String
        Map<Integer,String> map;
        
        /* Algoritma */
        map = new HashMap<Integer, String>();
        /* Di Java, generics seperti Map<K, V> tidak bisa 
         menggunakan tipe primitif (int, double, char, dll.) 
        karena Java generics hanya mendukung tipe objek (reference types), 
        bukan tipe primitif (primitive types) */
        // Integer adalah class yang membungkus nilai int. 
        // Ini disebut wrapper class
        // Menempatkan elemen kunci dan nilai : .put
        map.put(1,"Bangun Tidur");
        map.put(2,"Mandi");
        map.put(3,"Membersihkan Tempat Tidur");
        // Mengambil Elemen : .get()
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        // Mengambil Keseluruhan kunci sebagai objek Collection Set
        // .keySet() : ambil all key, disimpen di Objek Collection lain
        Set<Integer> key = map.keySet();
        // Ambil Keseluruhan dalam Key
        for(Integer K : key){
            System.out.println(map.get(K) + " ");
        }
    }
}

