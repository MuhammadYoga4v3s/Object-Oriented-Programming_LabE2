/* NamaFile    : ReadSerializedPerson.java
 * Deskripsi   : Membaca objek Person dari file menggunakan mekanisme deserialisasi
 * Pembuat     : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal     : 17/05/2025
 */

package com.mycompany.persistentoop1_sz;

import java.io.*;

/* KELAS UTAMA*/
// Kelas utama untuk membaca objek Person dari file "person.ser"
public class ReadSerializedPerson {
    public static void main(String[] Args){
        // Mendeklarasikan objek Person yang akan diisi dari hasil deserialisasi
        Person P = null;
        try{
            // Membuat stream untuk membaca data dari file "person.ser"
            FileInputStream f = new FileInputStream("person.ser");
            // Membungkus FileInputStream dengan ObjectInputStream untuk membaca objek
            ObjectInputStream s = new ObjectInputStream(f);

            // Membaca objek dari stream dan melakukan casting ke tipe Person
            P = (Person)s.readObject();
            // Menutup stream setelah selesai membaca
            s.close();

            // Menampilkan nama dari objek Person yang berhasil dibaca
            System.out.println("Serialized Person Name : " + P.getName());
        } catch (Exception ioe){
            // Menangani berbagai jenis exception yang mungkin terjadi (misalnya IOException, ClassNotFoundException)
            ioe.printStackTrace();
        }
    }
}