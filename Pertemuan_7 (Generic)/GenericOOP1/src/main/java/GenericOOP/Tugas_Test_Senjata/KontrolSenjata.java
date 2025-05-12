/* NamaFile  : KontrolSenjata.java
 * Deskripsi : Berisi kelas Kontrolsenjata, Kelas Lanjutan dari Senjata
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 01/05/2025
 */

package GenericOOP.Tugas_Test_Senjata;

public class KontrolSenjata {
    /*================================ ATRIBUT ===============================*/
    private Senjata2 senjata;
    /*================================ METHOD ================================*/
    // Kostruktor untuk membuat Kontrol Senjata dari senjata s
    public KontrolSenjata(Senjata2 Senjata){
        this.senjata = Senjata;
    }
    
    // Fungsi untuk menunjukkan apakah Senjata memiliki Peluru tersisa
    public boolean isAdaPeluru(){
        if (this.senjata.getPeluru() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    // prosedur untuk mengisi sejumlah jumPeluru ke dalam Senjata
    public void isiPeluru(int jumPeluru){
        this.senjata.setPeluru(jumPeluru+this.senjata.getPeluru());
        System.out.println(">> Peluru berhasil ditambah : " + jumPeluru);
    }
    
    // prosedur untuk melakukan penembakan dengan sejumlah jumlah peluru 
    // dari senjata
    public void Menembak(int jumlah) {
        System.out.println(">> Siap menembak sebanyak " + jumlah + " kali");
        if(this.senjata.getPeluru()==0){
            System.out.println("Tidak bisa menembak, Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (this.senjata.getPeluru() > 0) {
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal menembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru Sisa : " + this.senjata.getPeluru());
        }
    }

    // Prosedur untuk memasang bayonet (mengubah nilai Menusuk menjadi true)
    public void pasangBayonet() {
        if (!this.senjata.isMenusuk()) {
            this.senjata.setMenusuk(true);
            System.out.println("Bayonet Sudah Terpasang");
        } else {
            System.out.println("Bayonet Sudah Terpasang Sebelumnya");
        }
    }

    // Fungsi untuk melakukan penusukan
    public String menusuk() {
        if (this.senjata.isMenusuk()) {
            return "Jleb, Objek Berhasil Menusuk";
        } else {
            return "Walawe, Belum pasang Bayonet";
        }
    }
}
