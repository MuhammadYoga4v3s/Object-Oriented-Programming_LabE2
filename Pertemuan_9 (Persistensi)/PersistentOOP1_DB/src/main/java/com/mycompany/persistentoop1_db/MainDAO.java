/* NamaFile  : MainDAO.java
 * Deskripsi : Kelas MainDAO, program utama untuk menyimpan data Person ke database melalui DAO
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 11/05/2025
 */

package com.mycompany.persistentoop1_db;


public class MainDAO {
    public static void main(String args[]) {
        // Membuat objek Person
        Person person = new Person("Gardenie");
        // Membuat DAOManager
        DAOManager m = new DAOManager();
        // Mengatur implementasi DAO ke MySQLPersonDAO
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person); // Menyimpan person ke database
        } catch (Exception e) {
            e.printStackTrace(); // Menangani jika ada error saat menyimpan
        }
    }
}

