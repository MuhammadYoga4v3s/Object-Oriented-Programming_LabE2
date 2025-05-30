/* NamaFile  : Person.java
 * Deskripsi : Kelas Person, berisi Method dan Atribut dari Person
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 17/05/2025
 */

package com.mycompany.persistentoop1_db;

public class Person {
    /* ==================================== ATRIBUT ===================================== */
    public int id;
    public String name;
    
    /* ==================================== METHOD ===================================== */
    // Konstruktor Person dengan paramter name
    public Person(String name){
        this.name = name;
    }
    
    // Konstruktor Person dengan paramter id dan name
    public Person(int i, String N){
        this.id = i;
        this.name = N;
    }
    
    // Fungsi yang mengembalikan id dari Person
    public int getID(){
        return this.id;
    }
    
    // Fungsi yang mengembalikan Name dari Person
    public String getName(){
        return this.name;
    }
}
