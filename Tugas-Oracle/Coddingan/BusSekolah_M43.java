import java.util.Scanner;

public class BusSekolah_M43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kapasitasBus = 45;
        
        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int pendaftar = input.nextInt();
        
        int jumlahBus = pendaftar / kapasitasBus;
        int orangVan = pendaftar % kapasitasBus;
        
        System.out.println("Bus yang diperlukan: " + jumlahBus);
        System.out.println("Orang yang naik van: " + orangVan);
        input.close();
    }
}