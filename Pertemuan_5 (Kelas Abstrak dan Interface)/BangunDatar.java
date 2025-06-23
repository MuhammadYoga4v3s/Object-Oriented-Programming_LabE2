/*  Nama File   : BangunDatar.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }  

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

/*
Pertanyaan 1: Kemampuan Membandingkan Objek Berbeda

Metode isEqualLuas() dan isEqualKeliling() memang dapat digunakan untuk membandingkan objek bangun datar meskipun jenisnya berbeda. Hal ini terjadi karena konsep polimorfisme dalam pemrograman berorientasi objek. Ketika kita memiliki beberapa kelas seperti Persegi dan Lingkaran yang merupakan turunan dari kelas BangunDatar, setiap kelas tersebut memiliki implementasi sendiri untuk metode getLuas() dan getKeliling(). Dengan demikian, kita bisa membandingkan luas atau keliling antara persegi dengan lingkaran, atau bentuk lainnya.

Pertanyaan 2: Dampak jika BangunDatar Bukan Abstract Class

Secara teknis, pembuatan metode isEqualLuas() dan isEqualKeliling() tetap dimungkinkan meskipun BangunDatar bukan kelas abstrak. Namun, pendekatan ini menimbulkan beberapa masalah:

- Kita perlu membuat implementasi default untuk getLuas() dan getKeliling() di kelas BangunDatar, padahal tidak ada cara universal untuk menghitung ukuran tersebut tanpa mengetahui bentuk geometris spesifiknya.
- Tanpa abstract class, dimungkinkan pembuatan objek BangunDatar secara langsung, yang tidak memiliki bentuk spesifik dan tidak masuk akal dalam konteks geometri.
- Implementasi default tersebut berpotensi menyesatkan karena tidak memiliki nilai yang berarti.

Pertanyaan 3: Keunggulan BangunDatar sebagai Abstract Class

- Memastikan konsistensi dengan mewajibkan setiap kelas turunan untuk mengimplementasikan metode getLuas() dan getKeliling().
- Mencegah pembuatan objek BangunDatar langsung, yang sesuai dengan logika dunia nyata dimana bangun datar selalu memiliki bentuk tertentu.
- Menyediakan struktur yang jelas untuk semua jenis bangun datar dengan standar operasi yang seragam.
- Mendukung prinsip polimorfisme sehingga kita dapat melakukan operasi umum pada berbagai bentuk geometris yang berbeda.
- Menghasilkan desain yang lebih rapi dengan memisahkan antara kontrak (apa yang harus dilakukan) dengan implementasi spesifik (bagaimana melakukannya pada bentuk tertentu).

Dengan model abstract class, kode menjadi lebih terstruktur, lebih sesuai dengan konsep dunia nyata, dan lebih mudah dikembangkan serta dipelihara.
 */