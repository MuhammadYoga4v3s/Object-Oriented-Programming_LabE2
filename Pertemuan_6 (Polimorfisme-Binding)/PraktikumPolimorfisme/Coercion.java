/* NamaFile  : Coercion.java
 * Deskripsi : Program untuk mendemonstrasikan konsep casting dalam polimorfisme coercion di Java
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 27/04/2025
 */

 public class Coercion {
    public static void main(String[] args) {
        // =================================== Contoh 1 ===================================
        // Coercion (implicit widening conversion): char -> int
        int output1 = 'a';  // Nilai ASCII 'a' adalah 97
        System.out.println(output1);  // Output: 97

        // =================================== Contoh 2 ===================================
        // Error: Tidak bisa coercion dari double ke int (narrowing)
        // Perlu explicit casting
        double x = 15.5; 
        int output2 = (int) x;  // awalnya int output2 = x;
        System.out.println(output2);  // Output: 15

        // =================================== Contoh 3 ===================================
        // Coercion (implicit widening conversion): int -> double
        int y = 15;
        double output3 = y;  // Implicit conversion int -> double
        System.out.println(output3);  // Output: 15.0

        // =================================== Contoh 4 ===================================
        // Explicit casting: int -> char
        int z = 78;  
        char output4 = (char) z;  // Explicit casting int -> char (ASCII 78 = 'N')
        System.out.println(output4);  // Output: N

        // =================================== Contoh 5 ===================================
        // Coercion (implicit widening conversion): int -> double
        int a = 'a';  // 'a' ASCII = 97
        double output5 = a;  // Implicit conversion int -> double
        System.out.println(output5);  // Output: 97.0
    }
}