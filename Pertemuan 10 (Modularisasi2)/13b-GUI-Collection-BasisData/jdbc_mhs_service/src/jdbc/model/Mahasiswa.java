/* NamaFile  : Mahasiswa.java
 * Deskripsi : Berisi Class Mahasiswa dan atribt atributnya
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 22/06/2025
 */

package jdbc.model;


public class Mahasiswa {
    private int id;
    private String nama;
    
    // Kontruktor tanpa parameter
    public Mahasiswa() {
    }
  
    // Kontruktor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // FUngsi yang mengembalikan ID mahasiswa
    public int getId() {
        return id;
    }

    // FUngsi yang mengembalikan Nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Prosedur yang menetapkan ID Mahasiswa
    public void setId(int id) {
        this.id = id;
    }

    // Prosedur yang menetapkan Nama Mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    // Fungsi yang mengembalikan identitas mahasiswa dalam string
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}
