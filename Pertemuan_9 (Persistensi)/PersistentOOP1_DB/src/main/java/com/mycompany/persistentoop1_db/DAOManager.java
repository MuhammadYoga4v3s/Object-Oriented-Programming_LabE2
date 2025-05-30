/* NamaFile  : DAOManager.java
 * Deskripsi : Kelas DAOManager, bertanggung jawab menyimpan dan mengatur PersonDAO
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 17/05/2025
 */

package com.mycompany.persistentoop1_db;

public class DAOManager {
    /* ==================================== ATRIBUT ===================================== */
    private PersonDAO personDAO;

    /* ==================================== METHOD ===================================== */
    // Prosedur untuk mengatur implementasi PersonDAO (setter Person)
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    // Fungsi untuk mengambil Person dari Objek PersonDAO
    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}

