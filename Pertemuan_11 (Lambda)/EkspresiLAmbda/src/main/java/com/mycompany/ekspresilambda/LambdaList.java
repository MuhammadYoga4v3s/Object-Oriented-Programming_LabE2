/* NamaFile  : LambdaList.java
 * Deskripsi : Program untuk menampilkan daftar nama mahasiswa menggunakan ekspresi lambda
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 20/05/2025
 */

package com.mycompany.ekspresilambda;

import java.util.ArrayList;

public class LambdaList {
    // Fungsi utama untuk menjalankan program
    public static void main(String[] args){
        // Membuat list untuk menyimpan nama-nama mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();
        
        // Menambahkan elemen ke dalam list
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        // Menampilkan seluruh elemen list menggunakan ekspresi lambda
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
