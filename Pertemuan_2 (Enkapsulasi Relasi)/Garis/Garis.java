/* NamaFile  : Garis.java
 * Deskripsi : berisi atribut dan Method dalam class Garis (2 Titik)
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 22/02/2025
 */

public class Garis {
    /*********************************** ATRIBUT *******************************************/
    private Titik TitikAwal;
    private Titik TitikAkhir;
    static int CounterGaris;

    /************************************* OTHER ******************************************/
    /* Pangkat dua ajah */
    public double Pow2(double x){
        return x*x;
    }
    /************************************ METHOD ******************************************/
    // Konstruktor dengan Parameter masukan titik awal dan Titik Akhir
    public Garis(Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        CounterGaris++;
    }
    // Konstruktor tanpa parameter yang menginisialisasi 
    // Titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis(){
        this(new Titik(0,0),new Titik(1,1));
    }

    // Selektor (Getter) untuk setiap atribut
    // Mengambil atribut Titik Awal
    public Titik getTitikAwal(){
        return this.TitikAwal;
    }
    // Mengambil atribut Titik Akhir
    public Titik getTitikAkhir(){
        return this.TitikAkhir;
    }
    // Selektor atribut statis CounterGaris
    public static int getCounterGaris(){
        return CounterGaris;
    }

    // Mutator (Setter) Untuk Setiap Atribut
    // Setter untuk atribut titik awal
    public void setTitikAwal(Titik T){
        this.TitikAwal = T;
    }
    // Setter untuk atribut titik akhir
    public void setTitikAkhir(Titik T){
        this.TitikAkhir = T;
    }

    // Mendapatkan Panjang Garis
    public double getPanjang(){
        return  Math.sqrt(Pow2(this.TitikAwal.getAbsis() - this.TitikAkhir.getAbsis()) + 
        Pow2(this.TitikAwal.getOrdinat() - this.TitikAkhir.getOrdinat()));
    }
    // Gradien Garis
    public double getGradien(){
        if (this.TitikAkhir.getAbsis() == this.TitikAwal.getAbsis()) {
            return 0.0;
        }
        return (this.TitikAkhir.getOrdinat() - this.TitikAwal.getOrdinat()) 
               / (this.TitikAkhir.getAbsis() - this.TitikAwal.getAbsis());
    }
    // Mencari sebuah titik tengah dari sebuah persamaan garis
    public Titik TitikTengah(){
        return new Titik((this.TitikAkhir.getAbsis() + this.TitikAwal.getAbsis())/2
        ,(this.TitikAkhir.getOrdinat() + this.TitikAwal.getOrdinat())/2);
    }
    // Mengecek Kesejajaran garis dengan garis lain
    public boolean IsSejajar(Garis G2){
        return this.getGradien() == G2.getGradien();
    }
    // Mengecek apakah garis tegak lurus dengan gar{is lainnya
    public boolean IsTegakLurus(Garis G2){
        return this.getGradien() * G2.getGradien() == -1;
    }
    // Menampilkan Titik Awal dan Titik Akhir garis
    public void Print2Titik(){
        System.out.println("Titik Awal : (" + TitikAwal.getAbsis() + "," 
            + TitikAwal.getOrdinat() + ") Titik Akhir : (" 
            + TitikAkhir.getAbsis() + "," + TitikAkhir.getOrdinat() + ")");
    }
    // Menyusun persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = this.TitikAwal.getOrdinat() - m * this.TitikAwal.getAbsis();
        System.out.println("Persamaan garisnya adalah: ");
        System.out.println("y = " + m + "x + " + c);
    }
}