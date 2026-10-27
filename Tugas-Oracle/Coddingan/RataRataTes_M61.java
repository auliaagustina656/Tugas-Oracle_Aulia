import java.util.Scanner;

public class RataRataTes_M61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nilaiTes = new int[5];
        int total = 0;

        System.out.println("Masukkan 5 nilai tes:");
        for (int i = 0; i < nilaiTes.length; i++) {
            System.out.print("Tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextInt();
            total += nilaiTes[i];
        }

        double rataRata = (double) total / nilaiTes.length;
        System.out.println("Nilai rata-rata mahasiswa adalah: " + rataRata);
        
        scanner.close();
    }
}

