import java.util.Scanner;

public class HitungCatRuangan_M51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = scanner.nextDouble();

        // Luas dinding (2 * panjang * tinggi + 2 * lebar * tinggi) + Luas langit-langit (panjang * lebar)
        double luasDinding = (2 * panjang * tinggi) + (2 * lebar * tinggi);
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        System.out.println("Total luas permukaan yang harus dicat: " + totalLuas + " kaki persegi.");

        // Menghitung kebutuhan cat
        // Ember 5 liter mencakup 1500 sq ft ($15)
        // Ember 1 liter mencakup 300 sq ft ($4)
        
        int ember5Liter = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;
        
        int ember1Liter = (int) Math.ceil(sisaLuas / 300);

        // Pengecekan efisiensi biaya: Jika harga 4 ember 1 liter ($16) lebih mahal dari 1 ember 5 liter ($15), bulatkan ke ember 5 liter
        if (ember1Liter >= 5) {
            ember5Liter += 1;
            ember1Liter = 0;
        }

        double totalBiaya = (ember5Liter * 15.0) + (ember1Liter * 4.0);

        System.out.println("Jumlah ember 5 liter yang dibutuhkan: " + ember5Liter);
        System.out.println("Jumlah ember 1 liter yang dibutuhkan: " + ember1Liter);
        System.out.println("Total biaya optimal: $" + totalBiaya);

        scanner.close();
    }
}