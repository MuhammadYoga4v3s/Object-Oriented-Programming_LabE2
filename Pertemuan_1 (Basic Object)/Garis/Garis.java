/* NamaFile  : Garis.java
 * Deskripsi : berisi atribut dan Method dalam class Garis (2 Titik)
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 22/02/2025
 */

public class Garis {
    /*********************************** ATRIBUT *******************************************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int CounterGaris;

    /************************************* OTHER ******************************************/
    /* Pangkat dua ajah */
    double Pow2(double x){
        return x*x;
    }
    /************************************ METHOD ******************************************/
    // Konstruktor dengan Parameter masukan titik awal dan Titik Akhir
    Garis(Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        CounterGaris++;
    }
    // Konstruktor tanpa parameter yang menginisialisasi 
    // Titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis(){
        this(new Titik(0,0),new Titik(1,1));
    }

    // Selektor (Getter) untuk setiap atribut
    // Mengambil atribut Titik Awal
    Titik getTitikAwal(){
        return this.TitikAwal;
    }
    // Mengambil atribut Titik Akhir
    Titik getTitikAkhir(){
        return this.TitikAkhir;
    }
    // Selektor atribut statis CounterGaris
    static int getCounterGaris(){
        return CounterGaris;
    }

    // Mutator (Setter) Untuk Setiap Atribut
    // Setter untuk atribut titik awal
    void setTitikAwal(Titik T){
        this.TitikAwal = T;
    }
    // Setter untuk atribut titik akhir
    void setTitikAkhir(Titik T){
        this.TitikAkhir = T;
    }

    // Mendapatkan Panjang Garis
    double getPanjang(){
        return  Math.sqrt(Pow2(this.TitikAwal.absis - this.TitikAkhir.absis) + 
        Pow2(this.TitikAwal.ordinat - this.TitikAkhir.ordinat));
    }
    // Gradien Garis
    double getGradien(){
        if (this.TitikAkhir.absis == this.TitikAwal.absis) {
            return 0.0;
        }
        return (this.TitikAkhir.ordinat - this.TitikAwal.ordinat) 
               / (this.TitikAkhir.absis - this.TitikAwal.absis);
    }
    // Mencari sebuah titik tengah dari sebuah persamaan garis
    Titik TitikTengah(){
        return new Titik((this.TitikAkhir.absis + this.TitikAwal.absis)/2
        ,(this.TitikAkhir.ordinat + this.TitikAwal.ordinat)/2);
    }
    // Mengecek Kesejajaran garis dengan garis lain
    boolean IsSejajar(Garis G2){
        return this.getGradien() == G2.getGradien();
    }
    // Mengecek apakah garis tegak lurus dengan gar{is lainnya
    boolean IsTegakLurus(Garis G2){
        return this.getGradien() * G2.getGradien() == -1;
    }
    // Menampilkan Titik Awal dan Titik Akhir garis
    void Print2Titik(){
        System.out.println("Titik Awal : (" + TitikAwal.absis + "," 
            + TitikAwal.ordinat + ") Titik Akhir : (" 
            + TitikAkhir.absis + "," + TitikAkhir.ordinat + ")");
    }
    // Menyusun persamaan garis dalam bentuk y = mx + c
    void printPersamaanGaris() {
        double m = this.getGradien();
        double c = this.TitikAwal.ordinat - m * this.TitikAwal.absis;
        System.out.println("Persamaan garisnya adalah: ");
        System.out.println("y = " + m + "x + " + c);
    }
}