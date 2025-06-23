/* NamaFile  : LambdaMap.java
 * Deskripsi : Program untuk menampilkan isi Map (NIM dan nama mahasiswa) menggunakan ekspresi lambda
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 20/05/2025
 */

package com.mycompany.ekspresilambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan nama sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan pasangan NIM dan nama ke dalam Map
        mahasiswaMap.put("123", "Adi");
        mahasiswaMap.put("124", "Bambang");
        mahasiswaMap.put("125", "Cici");
        mahasiswaMap.put("126", "Didi");

        // Menampilkan semua pasangan NIM dan nama menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
