/* NamaFile  : DiskonLambda.java
 * Deskripsi : Penggunaan Algoritma Lintas Paradigma : PBO X LAMbda
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 20/05/2025
 */

package com.mycompany.ekspresilambda;

// Interface untuk menghitung diskon
interface IDiskon {
    public double hitungDiskon(int harga);
}

// Cotoh penggunaan Lambda
public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan Lambda dengan blok Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Cetak hasil
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
