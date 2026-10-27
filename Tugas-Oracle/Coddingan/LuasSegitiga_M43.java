import java.util.Scanner;

public class LuasSegitiga_M43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + luas);
        scanner.close();
    }
}