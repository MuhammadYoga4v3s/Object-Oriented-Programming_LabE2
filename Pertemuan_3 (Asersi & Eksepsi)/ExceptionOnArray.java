/* NamaFile  : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 * Pembuat   : Muhammad Yoga Aminudin (24060123130106)
 * Tanggal   : 6/03/2025
 */

 public class ExceptionOnArray {
    public static void main(String[] args) {
        // Inisiasi object array integer
        Integer[] arrayIntegers = new Integer[4];

        try {
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10; 
            // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code ....");
        }
    }
}
