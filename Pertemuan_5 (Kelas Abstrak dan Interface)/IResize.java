/*  Nama File   : IResize.java
 *  Deskripsi   : Interface mendefinisikan method zoomIn(), zoomOut(), dan zoom()
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

public interface IResize {
  void zoomIn();

  void zoomOut();

  void zoom(double percent);
}

/*
Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam classBangunDatar?

Jawab:

Manfaat Penggunaan Interface dalam Pemrograman Java

- Dukungan Multiple Inheritance
Java memiliki keterbatasan dimana sebuah kelas hanya dapat mewarisi dari satu kelas induk (single inheritance). Namun, Java memberikan solusi dengan memungkinkan implementasi beberapa interface sekaligus. Jika kita menempatkan metode resize sebagai metode abstrak di kelas BangunDatar, maka kelas-kelas yang bukan turunan BangunDatar tidak akan bisa memiliki kemampuan resize tersebut.

- Prinsip Pemisahan Tanggung Jawab
Dengan menggunakan interface terpisah untuk kemampuan resize, kita menerapkan prinsip pemisahan tanggung jawab dengan baik. Tidak semua bangun datar perlu memiliki kemampuan untuk diubah ukurannya, sehingga lebih masuk akal untuk menempatkan fungsionalitas ini pada interface khusus daripada memaksakannya pada seluruh hierarki BangunDatar.

- Peningkatan Kemampuan Penggunaan Ulang
Interface seperti IResize dapat dimanfaatkan oleh berbagai kelas yang tidak memiliki hubungan pewarisan dengan BangunDatar. Misalnya, kelas seperti Garis, bangun tiga dimensi (Kubus, Bola), atau bahkan komponen antarmuka pengguna seperti Window dan Image juga dapat mengimplementasikan kemampuan resize.

- Pemrograman Berbasis Kontrak
Interface menetapkan kesepakatan yang jelas tentang kemampuan yang harus disediakan oleh kelas yang mengimplementasikannya, tanpa mengharuskan kelas tersebut mewarisi dari kelas tertentu. Pendekatan ini memungkinkan berbagai kelas dari hierarki yang berbeda untuk memiliki kemampuan fungsional yang sama.

- Pengurangan Ketergantungan Antar Komponen
Penggunaan interface menciptakan tingkat abstraksi yang mengurangi ketergantungan langsung antar komponen dalam sistem. Kode kita dapat berinteraksi dengan abstraksi interface daripada implementasi konkret, sehingga meningkatkan fleksibilitas dan kemudahan dalam pemeliharaan.

- Polimorfisme yang Lebih Luas
Dengan interface, kita dapat membuat koleksi objek yang mengimplementasikan IResize dari berbagai jenis kelas yang berbeda, tidak terbatas pada kelas-kelas yang merupakan turunan dari BangunDatar. Hal ini memberikan fleksibilitas yang jauh lebih besar dalam pengelolaan objek.

Melalui pendekatan menggunakan interface, kita dapat menerapkan prinsip "Program terhadap interface, bukan implementasi" yang merupakan praktik terbaik dalam paradigma pemrograman berorientasi objek. Pendekatan ini menghasilkan kode yang lebih adaptif dan mudah dikembangkan.
 */