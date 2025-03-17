/* Nama file  : AngkaSial.java
 * Deskripsi  : program menggunakan eksepsi buatan sendiri dengan klausa "throws" dan "throw"
 * Pembuat    : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal    : 5 Maret 2025
 */

 public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // method getMessage telah ada pada kelas Exception
            System.out.println(ase.getMessage());
            System.out.println("Hati hai memasukkan angka");
        }
    }
}

/*Jawaban : Ketika eksepsi terjadi pada baris 10 (if(angka == 13) { throw new AngkaSialException(); }), maka eksepsi akan dilempar, dan eksekusi metode 
cobaAngka langsung dihentikan. Akibatnya, baris 12 (System.out.println(angka+" bukan angka sial");) tidak akan dieksekusi, karena program telah berpindah 
ke blok catch untuk menangani eksepsi. Sedangkan untuk baris 21 pada main method (as.cobaAngka(12);), perintah ini berada setelah pemanggilan as.cobaAngka(13);
yang memicu eksepsi. Begitu eksepsi dilempar, aliran program langsung berpindah ke blok catch, sehingga baris 21 tidak akan dieksekusi karena program 
tidak melanjutkan eksekusi dalam blok try setelah eksepsi terjadi. */
