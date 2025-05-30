/* NamaFile  : SerializePerson.java
 * Deskripsi : Menyimpan objek Person ke dalam file menggunakan mekanisme serialisasi
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 17/05/2025
 */

package com.mycompany.persistentoop1_sz;

import java.io.*;

/* KELAS PERSON*/
// Kelas Person yang dapat disimpan ke file (Serializable)
class Person implements Serializable {
    /* ==================================== ATRIBUT ===================================== */
    public String name;

    /* ==================================== METHOD ====================================== */
    // Konstruktor dengan Parameter name
    public Person(String Nama){
        this.name = Nama;
    }
    // Fungsi yang mengembalikan nama dari objek Person
    public String getName(){
        return this.name;
    }
}

/* KELAS UTAMA*/
// Kelas utama untuk menulis objek Person ke file "person.ser"
public class SerializePerson {
    public static void main(String[] args){
        // Membuat objek Person
        Person P1 = new Person("Aves");

        try {
            // Membuat stream untuk menulis ke file "person.ser"
            FileOutputStream f = new FileOutputStream("person.ser");
            // Membungkus stream dengan ObjectOutputStream agar bisa menulis objek
            ObjectOutputStream s = new ObjectOutputStream(f);

            // Menulis objek P1 ke file
            s.writeObject(P1);
            System.out.println("Selesai menulis Objek Person");

            // Menutup stream
            s.close();
        } catch(IOException e){
            // terjadi kesalahan I/O
            e.printStackTrace();
        }
    } 
}