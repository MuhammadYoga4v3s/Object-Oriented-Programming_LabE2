/* NamaFile  : Program.java
 * Deskripsi : Berisi Class Mahasiswa dan atribut-atributnya, serta demonstrasi operasi CRUD menggunakan MysqlMahasiswaService
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 22/06/2025
 */

package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    // Objek service untuk mengakses database Mahasiswa
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    /**
     * Method utama untuk menjalankan program
     * Melakukan operasi: insert, update, delete, dan menampilkan seluruh data mahasiswa
     */
    public static void main(String[] args) throws SQLException {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // ===== INSERT DATA MAHASISWA =====
        System.out.println("===insert");
        Mahasiswa mhsAdd1 = new Mahasiswa(1, "Rajwaa");
        service.add(mhsAdd1);
        System.out.println("berhasil insert: " + mhsAdd1);

        Mahasiswa mhsAdd2 = new Mahasiswa(2, "Muflihul");
        service.add(mhsAdd2);
        System.out.println("berhasil insert: " + mhsAdd2);

        Mahasiswa mhsAdd3 = new Mahasiswa(3, "Aufaa");
        service.add(mhsAdd3);
        System.out.println("berhasil insert: " + mhsAdd3);

        // Tampilkan semua data mahasiswa setelah insert
        displayAll();

        // ===== UPDATE DATA MAHASISWA =====
        System.out.println("===update");
        // Ambil data mahasiswa dengan ID 2
        Mahasiswa mhsUpdate = service.getById(2);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);

        // Ubah nama mahasiswa
        mhsUpdate.setNama("Muflihul");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);

        // Tampilkan semua data mahasiswa setelah update
        displayAll();

        // ===== DELETE DATA MAHASISWA =====
        System.out.println("===delete");
        // Menampilkan data yang akan dihapus
        System.out.println("akan di delete: " + service.getById(5));
        // Menghapus data mahasiswa dengan ID 5
        service.delete(5);

        // Tampilkan semua data mahasiswa setelah delete
        displayAll();
    }

    /**
     * Menampilkan seluruh data mahasiswa yang ada di database
     * Jika data kosong, akan menampilkan pesan bahwa tabel kosong
     */
    public static void displayAll() throws SQLException {
        System.out.println("===DisplayAll");
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Tabel kosong");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        }
    }
}
