package galToLit;

import java.util.Scanner; // Mengimpor package Scanner

public class GalToLit {
    public static void main(String[] args) {
        // Mendeklarasikan instance Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in); //

        // Declare variables
        double gallons;
        double liters;

        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah galon: ");
        gallons = in.nextDouble(); // Mendapatkan nilai desimal dari pengguna

        // Menghitung konversi galon ke liter
        liters = gallons * 3.785; //

        // Output hasil konversi ke pengguna
        System.out.println(gallons + " gallons equals " + liters + " liters"); //[cite: 2]

        // Menutup scanner
        in.close();
    }
}