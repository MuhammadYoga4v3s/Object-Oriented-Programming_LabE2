/*  Nama File   : IResize.java
 *  Deskripsi   : Interface mendefinisikan method zoomIn(), zoomOut(), dan zoom()
 *  Pembuat     : Muhammad Yoga Aminudin
 *  NIM         : 24060123130106
 *  Tanggal     : 22 Juni 2025
 */

public interface IResize {
    // Method untuk memperbesar ukuran objek
    void zoomIn();

    // Method untuk memperkecil ukuran objek
    void zoomOut();

    // Method untuk mengatur ukuran objek berdasarkan persentase
    void zoom(double percent);
}

/*
Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?

Jawab:

Manfaat Penggunaan Interface dalam Pemrograman Java:

1. Dukungan Multiple Inheritance  
   Java tidak mendukung pewarisan ganda antar kelas, tetapi memungkinkan sebuah kelas mengimplementasikan beberapa interface. Jika metode resize diletakkan di BangunDatar, maka kelas non-BangunDatar tidak bisa memilikinya.

2. Prinsip Pemisahan Tanggung Jawab  
   Tidak semua bangun datar perlu bisa di-resize. Menempatkan resize dalam interface terpisah mengikuti prinsip ini dengan lebih baik.

3. Peningkatan Kemampuan Penggunaan Ulang  
   Interface IResize bisa digunakan oleh kelas lain seperti Garis, Kubus, Bola, atau bahkan Window dan Image, tanpa tergantung pada pewarisan BangunDatar.

4. Pemrograman Berbasis Kontrak  
   Interface memberikan kontrak yang harus diikuti oleh semua kelas pengimplementasinya, tanpa harus ikut pewarisan hierarki tertentu.

5. Pengurangan Ketergantungan Antar Komponen  
   Interaksi dilakukan terhadap interface, bukan implementasi spesifik. Hal ini membuat kode lebih fleksibel dan mudah dirawat.

6. Polimorfisme yang Lebih Luas  
   Koleksi objek yang mengimplementasikan IResize bisa terdiri dari berbagai kelas berbeda, tak terbatas hanya pada turunan BangunDatar.

Kesimpulan:  
Interface memberikan abstraksi yang kuat, fleksibilitas dalam desain, serta mendukung prinsip-prinsip OOP seperti low coupling dan high cohesion.
*/
