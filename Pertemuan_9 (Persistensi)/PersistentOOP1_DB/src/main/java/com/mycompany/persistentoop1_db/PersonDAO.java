/* NamaFile  : PersonDAO.java
 * Deskripsi : Interface PersonDAO, berisi method untuk menyimpan data Person
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 17/05/2025
 */

package com.mycompany.persistentoop1_db;

public interface PersonDAO {
    /* ==================================== METHOD ===================================== */
    // Prosedur PBO untuk menyimpan data Person ke media penyimpanan
    public void savePerson(Person p) throws Exception;
}


/*DAO = Data Access Object
                   +---------------------+
                   |     <<interface>>   |
                   |      PersonDAO      |<----------------------------------+
                   +---------------------+                                   |
                   | + savePerson(Person)|                                   |
                   +---------------------+                                   |
                              ^ (realize)                                    |
                              |                                              |
                   +-----------------------+                                 |
                   |    MySQLPersonDAO     |                                 |
                   +-----------------------+                                 |
                   | + savePerson(Person)  |                                 |
                   +-----------------------+                                 |
                                                                             |
     +------------------------+------------------------+                     |
     |                     DAOManager                  |                     |
     +-------------------------------------------------+                     |
     | - personDAO : PersonDAO                         | --------------------|
     | + setPersonDAO(PersonDAO)                       |
     | + getPersonDAO() : PersonDAO                    | 
     +-------------------------------------------------+ 
                              ^ (created by) 
                              |  
                         +------------+        create         +--------+ 
                         |  MainDAO   |---------------------->| Person | 
                         +------------+                       +--------+
                         | + main()   |                                   
                         +------------+
*/
