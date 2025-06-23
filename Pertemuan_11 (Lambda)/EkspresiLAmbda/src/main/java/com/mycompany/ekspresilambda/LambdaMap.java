package com.mycompany.ekspresilambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan nama sebagai value
        Map<String, String> mahasiswaMap = new HashMa p<>();
        mahasiswaMap.put("123", "Adi");
        mahasiswaMap.put("124", "Bambang");
        mahasiswaMap.put("125", "Cici");
        mahasiswaMap.put("126", "Didi");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
