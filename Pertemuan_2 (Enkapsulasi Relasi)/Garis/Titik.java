/* NamaFile  : titik.java
 * Deskripsi : berisi atribut dan Method dalam class Titik
 * Pembuat   : Muhammad Yoga Aminudin
 * Tanggal   : 20/02/2025
 */

import java.lang.Math;

public class Titik {
    /*********************************** ATRIBUT *******************************************/
    private double absis;
    private double ordinat;
    static int CounterTitik;

    /************************************* OTHER ******************************************/
    /* Pangkat dua ajah */
    double Pow2(double x){
        return x*x;
    }
    /************************************ METHOD ******************************************/
    /* Kontruktor Membuat Titik (absis, ordinat) */
    public Titik(double absis, double ordinat) {
            this.absis = absis;
            this.ordinat = ordinat;
            CounterTitik++;
        }
    /* Kontruktor Membuat Titik (0,0) */
    public Titik(){
        this(0,0);
    }

    /************************************* Getter ****************************************/
    /* Menggembalikan Nilai ordinat */
    public double getOrdinat(){
        return this.ordinat;
    }
    /* Menggembalikan Nilai absis */
    public double getAbsis(){
        return this.absis;
    }

    /*************************************** Setter **************************************/
    /* mengeset ordinat titik dengan nilai baru x */
    public void setOrdinat(double x){
        this.ordinat = x;
    }
    /* mengeset absis titik dengan nilai baru x */
    public void setAbsis(double x){
        this.absis = x;
    }

    /* ================================================================================== */
    /********************************* Method Lain ****************************************/
    /* menggeser nilai absis titik sejauh x dan nilai ordinat titik sejauh y */
    public void Geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + y;
    }
    
    /* mencetak koordinat titik */
    public void PrintTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    /* mencetak jumlah titik yang telah dibuat */
    public static int getCounterTitik(){
        return CounterTitik;
    }

    /* Mengembalikan Kuadran dari Sebuah titik */
    public int getKuadran(){
        if( this.absis >= 0 && this.ordinat >= 0 ){
            return 1;
        } else if ( this.absis < 0 && this.ordinat >= 0 ){
            return 2;
        } else if ( this.absis < 0 && this.ordinat < 0 ){
            return 3;
        } else {
            return 4;
        }
    }

    /* Mengembalikan jarak titik dari titik Pusat (0,0) */
    public double getJarakPusat(){
        return Math.sqrt(Pow2(this.absis) + Pow2(this.ordinat));
    }
    /* Mengembalikan jarak titik dari titik Lain */
    public double getJarak(Titik T2){
        return Math.sqrt(Pow2(this.absis - T2.absis) + Pow2(this.ordinat - T2.ordinat));
    }

    /* Merefleksi Titik terhadap sumbu Y */
    public void refleksiY(){
        this.absis = this.getAbsis()*-1;
    }
    /* Merefleksi Titik terhadap sumbu X */
    public void refleksiX(){
        this.ordinat = this.getOrdinat()*-1;
    }

    /* Mengembalikan Refleksi ke sumbu Y titik */
    public Titik getRefleksiX(){
        return new Titik(this.getAbsis(), this.getOrdinat()*-1);
    }
    /* Mengembalikan Refleksi ke sumbu Y titik */
    public Titik getRefleksiY(){
        return new Titik(this.getAbsis()*-1, this.getOrdinat());
    }

    /* Merotasikan sebuah Titik sebanyak x derajat */
    public void rotasi(double x){
        double sudutRadian = Math.toRadians(x);
        this.absis = this.absis * Math.cos(sudutRadian) - this.ordinat * Math.sin(sudutRadian);
        this.ordinat = this.absis * Math.sin(sudutRadian) + this.ordinat * Math.cos(sudutRadian);
    }

} // end Class Titik
