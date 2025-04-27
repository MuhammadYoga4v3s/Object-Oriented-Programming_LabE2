/* NamaFile  : testPolimorfisme.java
 * Deskripsi : Berisi eksperiment tentang polimorfisme pada kelas turunan
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

import java.util.ArrayList;

public class TestPolimorfisme{
    public static void main(String[] args) {
        Pegawai Pgw1 = new Programmer("Mira");
        Pegawai Pgw2 = new Manajer("Joko");
        Pegawai Pgw3 = new Manajer("Argo");

        ArrayList <Pegawai> emps = new ArrayList<>();
        emps.add(Pgw1);
        emps.add(Pgw2);
        emps.add(Pgw3);

        for(Pegawai emp : emps){
            emp.tampildata();
        }
    }
 }