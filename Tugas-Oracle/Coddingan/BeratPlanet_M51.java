import java.util.Scanner;

public class BeratPlanet_M51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan Anda di Bumi (lbs): ");
        double beratBumi = scanner.nextDouble();

        System.out.println("\nPilih planet tujuan:");
        System.out.println("1. Merkurius (Faktor: 0.38)");
        System.out.println("2. Venus (Faktor: 0.91)");
        System.out.println("3. Mars (Faktor: 0.38)");
        System.out.println("4. Jupiter (Faktor: 2.36)");
        System.out.println("5. Saturnus (Faktor: 0.92)");
        System.out.println("6. Uranus (Faktor: 0.89)");
        System.out.println("7. Neptunus (Faktor: 1.13)");
        System.out.print("Masukkan pilihan nomor planet (1-7): ");
        int pilihan = scanner.nextInt();

        String namaPlanet = "";
        double faktor = 0;

        switch (pilihan) {
            case 1: namaPlanet = "Mercury"; faktor = 0.38; break;
            case 2: namaPlanet = "Venus"; faktor = 0.91; break;
            case 3: namaPlanet = "Mars"; faktor = 0.38; break;
            case 4: namaPlanet = "Jupiter"; faktor = 2.36; break;
            case 5: namaPlanet = "Saturn"; faktor = 0.92; break;
            case 6: namaPlanet = "Uranus"; faktor = 0.89; break;
            case 7: namaPlanet = "Neptune"; faktor = 1.13; break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        double beratAkhir = beratBumi * faktor;
        System.out.println("Your weight on " + namaPlanet + " is " + beratAkhir + " lbs.");
        
        scanner.close();
    }
}