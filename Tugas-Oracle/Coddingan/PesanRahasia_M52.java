import java.util.Scanner;

public class PesanRahasia_M52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Masukkan 10 angka satu per satu (angka 1 sampai 7):");
        while (count < 10) {
            System.out.print("Angka ke-" + (count + 1) + ": ");
            int angka = scanner.nextInt();
            char huruf = ' ';
            boolean valid = true;
            
            switch (angka) {
                case 1: huruf = 'D'; break;
                case 2: huruf = 'W'; break;
                case 3: huruf = 'E'; break;
                case 4: huruf = 'L'; break;
                case 5: huruf = 'H'; break;
                case 6: huruf = 'O'; break;
                case 7: huruf = 'R'; break;
                default:
                    System.out.println("Angka belum terpecahkan! Silakan masukkan angka lain.");
                    valid = false;
            }
            
            if (valid) {
                System.out.print(huruf);
                count++;
            }
        }
        System.out.println();
        scanner.close();
    }
}