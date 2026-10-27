import java.util.Scanner;

public class KalkulatorMatriks_M61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        char pilihan;

        do {
            System.out.println("\n--- MENU MATRIKS 2x2 ---");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu (a-f): ");
            pilihan = scanner.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    System.out.println("Masukkan 4 elemen Matriks A (2x2):");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            matriksA[i][j] = scanner.nextInt();
                    break;
                case 'b':
                    System.out.println("Masukkan 4 elemen Matriks B (2x2):");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            matriksB[i][j] = scanner.nextInt();
                    break;
                case 'c':
                    System.out.println("Hasil A + B:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((matriksA[i][j] + matriksB[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 'd':
                    System.out.println("Hasil A - B:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((matriksA[i][j] - matriksB[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 'e':
                    System.out.println("Hasil A * B:");
                    int[][] hasilKali = new int[2][2];
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            hasilKali[i][j] = 0;
                            for (int k = 0; k < 2; k++) {
                                hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
                            }
                            System.out.print(hasilKali[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 'f':
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 'f');

        scanner.close();
    }
}