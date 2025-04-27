/* NamaFile  : Student.java
 * Deskripsi : berisi Method untuk subclass Student
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

public class Student extends Person{
    /* ==================================== METHOD ===================================== */
    // Konstruktor
    public Student(String Nama){
        super(Nama);
    }
    // Fungsi Override check is Student Asleep
    @Override
    public boolean isAsleep(int hr){
        return hr > 2 && hr < 8;
    }
}