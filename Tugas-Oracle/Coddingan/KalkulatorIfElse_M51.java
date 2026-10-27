import java.util.Scanner;

public class KalkulatorIfElse_M51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double hasil = 0;
        boolean valid = true;

        if (operator == '+') {
            hasil = num1 + num2;
        } else if (operator == '-') {
            hasil = num1 - num2;
        } else if (operator == '*') {
            hasil = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                hasil = num1 / num2;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                valid = false;
            }
        } else if (operator == '%') {
            hasil = num1 % num2;
        } else {
            System.out.println("Operator tidak valid!");
            valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + num1 + " " + operator + " " + num2 + " = " + hasil);
        }
        scanner.close();
    }
}