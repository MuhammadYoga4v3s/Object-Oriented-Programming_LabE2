/* NamaFile  : Person.java
 * Deskripsi : Berisi Method dan Atribut dari Class Person
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

 public class Person{
    /* =================================== ATRIBUT ===================================== */
    private String Nama;
    /* ==================================== METHOD ===================================== */
    // Konstruktor
    public Person(String Nama){
        this.Nama = Nama;
    }
    // Fungsi untuk menunjukkan apakah Person sedang tidur atau bukan
    public boolean isAsleep(int jam){
        return jam > 22 && jam < 7;
    }
    // Fungsi ubtuk mengembalikan bentuk String dari Nama person
    public String toString(){
        return Nama;
    }
    // Prosedur untuk mengecek jam kerja Person
    public void status(int hr){
        if(this.isAsleep(hr)){
            System.out.println("Lagi Offline: " + this);
        } else {
            System.out.println("Lagi Online: " + this);
        }
    }
}