/* NamaFile  : mySQLMAhasiswaService.java
 * Deskripsi : Berisi Class Koneksi Dengan database
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 22/06/2025
 */

package jdbc.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import static jdbc.utilities.MysqlUtility.getConnection;


public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Konstruktor: Membuka koneksi ke database saat objek dibuat
    public MysqlMahasiswaService() {
        koneksi = getConnection();
    }
    
    // Mengembalikan objek Mahasiswa kosong
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
   
    // Prosedur Menambahkan data mahasiswa ke tabel
    public void add (Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa (id,nama) VALUES ("+mhs.getId()+",'"+mhs.getNama()+"')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void update (Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET nama ='" +mhs.getNama()+ "' WHERE id =  "+mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete (int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id = "+id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Fungsi yang Mengambil data mahasiswa berdasarkan id
    public Mahasiswa getById(int id) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = "+id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }
    
    // Fungsi yang Mengambil semua data mahasiswa dari tabel
    public List <Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhsList;
    }
    
    // Prosedur yang Mereset nilai auto increment ID di tabel mahasiswa ke 1
    public void indexReset() throws SQLException {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil reset index");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Fungsi yang mengecek apakah tabel Mahsiswa Kosomg
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Method untuk menutup koneksi dengan mysql
    public void closeConnection() {
        if (koneksi != null) {
            try{
                koneksi.close();
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
