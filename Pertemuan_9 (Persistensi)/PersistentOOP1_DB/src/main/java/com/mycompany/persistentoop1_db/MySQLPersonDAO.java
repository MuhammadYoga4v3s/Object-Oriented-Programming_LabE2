/* NamaFile  : MySQLPersonDAO.java
 * Deskripsi : Kelas MySQLPersonDAO, mengimplementasikan PersonDAO untuk menyimpan data ke database MySQL
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package com.mycompany.persistentoop1_db;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    /* ==================================== METHOD ===================================== */
    // Prosedur Override untuk menyimpan data Person ke dalam database MySQL
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName(); // Ambil nama dari objek Person

        // Memuat driver JDBC untuk MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Membuat koneksi ke database (nama DB, user, password)
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/pbo", "root", "YogaBasdat61@");

        // Query untuk menyimpan data ke tabel person
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query); // Cetak query untuk debugging

        // Eksekusi query menggunakan Statement
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi database setelah selesai
        con.close();
    }
}
