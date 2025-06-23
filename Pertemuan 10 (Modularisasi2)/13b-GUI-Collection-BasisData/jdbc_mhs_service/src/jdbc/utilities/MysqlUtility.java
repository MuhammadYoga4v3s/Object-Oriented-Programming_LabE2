/* NamaFile  : mysqlUtility.java
 * Deskripsi : Berisi Class Mahasiswa dan atribut-atributnya, serta demonstrasi operasi CRUD menggunakan MysqlMahasiswaService
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 22/06/2025
 */

package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url =  "jdbc:mysql://localhost:3306/akademik";
                // Sesuaikan username dan password mysql
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException one) {
                System.out.println("Gagal load driver : " +one.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
