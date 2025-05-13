/* NamaFile  : Koleksi.java
 * Deskripsi : Kelas generik Koleksi untuk menyimpan elemen dengan operasi dasar
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package Collection_3_5;

public class Koleksi<T> {
    /* ================================ ATRIBUT ================================= */
    private int nbelm;
    private T[] wadah; // Array

    /* ================================ METHOD ================================== */
    // Konstruktor Koleksi dengan kapasitas tertentu
    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    // Fungsi untuk mendapatkan elemen pada indeks tertentu
    public T getIsi(int i) {
        if (i >= 0 && i < nbelm) {
            return wadah[i];
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    // Prosedur untuk mengubah elemen pada indeks tertentu
    public void setIsi(int i, T elemen) {
        if (i >= 0 && i < nbelm) {
            wadah[i] = elemen;
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    // Fungsi untuk mendapatkan jumlah elemen efektif
    public int getSize() {
        return nbelm;
    }

    // Prosedur untuk mengubah jumlah elemen (jarang dipakai secara langsung)
    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            nbelm = size;
        } else {
            throw new IllegalArgumentException("Ukuran tidak valid");
        }
    }

    // Prosedur untuk menambahkan elemen ke akhir koleksi
    public void add(T elemen) {
        if (!isFull()) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh, tidak dapat menambah elemen.");
        }
    }

    // Prosedur untuk menghapus elemen pada indeks tertentu
    public void delete(int i) {
        if (i >= 0 && i < nbelm) {
            for (int j = i; j < nbelm - 1; j++) {
                wadah[j] = wadah[j + 1];
            }
            wadah[--nbelm] = null;
        } else {
            System.out.println("Indeks tidak valid, tidak dapat menghapus.");
        }
    }

    // Prosedur untuk menampilkan semua elemen koleksi
    public void showAll() {
        System.out.println("======= Isi Koleksi =======");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + wadah[i]);
        }
        if (nbelm == 0) {
            System.out.println("(Kosong)");
        }
    }

    // Fungsi untuk mengecek apakah koleksi kosong
    public boolean isEmpty() {
        return nbelm == 0;
    }

    // Fungsi untuk mengecek apakah koleksi sudah penuh
    public boolean isFull() {
        return nbelm == wadah.length;
    }

    // Prosedur untuk menghapus semua elemen dari koleksi
    public void clear() {
        for (int i = 0; i < nbelm; i++) {
            wadah[i] = null;
        }
        nbelm = 0;
    }

    // Method untuk menggabungkan koleksi saat ini dengan koleksi lain
    public Koleksi<T> merge(Koleksi<T> koleksiLain) {
        int kapasitasBaru = this.nbelm + koleksiLain.nbelm;
        Koleksi<T> hasil = new Koleksi<>(kapasitasBaru);
        
        // Tambahkan semua elemen dari koleksi saat ini
        for (int i = 0; i < this.nbelm; i++) {
            hasil.add(this.wadah[i]);
        }
        // Tambahkan semua elemen dari koleksi lain
        for (int i = 0; i < koleksiLain.nbelm; i++) {
            hasil.add(koleksiLain.wadah[i]);
        }
        
        return hasil;
    }

    // Prosedur untuk memisahkan koleksi saat ini menjadi dua bagian berdasarkan indeks
    // ke dalam split2 dan split1 , dipotong di indeks
    public void split(int indeks, Koleksi<T> split1, Koleksi<T> split2) {
        if (indeks < 0 || indeks > nbelm) {
            throw new IndexOutOfBoundsException("Indeks pemisahan tidak valid");
        }
        // Kosongkan koleksi hasil terlebih dahulu
        split1.clear();
        split2.clear();
        // Isi split1 dengan elemen sebelum indeks
        for (int i = 0; i < indeks; i++) {
            split1.add(wadah[i]);
        }
        // Isi split2 dengan elemen mulai dari indeks
        for (int i = indeks; i < nbelm; i++) {
            split2.add(wadah[i]);
        }
    }
}