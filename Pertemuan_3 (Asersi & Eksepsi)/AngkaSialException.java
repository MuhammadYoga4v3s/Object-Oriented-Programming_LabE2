/* Nama file  : AngkaSial.java
 * Deskripsi  : Eksersi buatan sendiri, menolak angka 13
 * Pembuat    : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal    : 5 Maret 2025
*/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukan angka 13 karena angka ini sial!!");
    }
}
