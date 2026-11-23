package Modul_7;

public class FishTest {
    public static void main(String[] args) {
        // Soal 6: Inisialisasi 2 ikan baru
        Fish ikan1 = new Fish("Amber", "AngelFish", 5); // Sangat ramah
        Fish ikan2 = new Fish("James", "Guppy", 3);     // Netral

        // Soal 9: Uji method nicestFish()
        Fish ikanPalingRamah = Fish.nicestFish(ikan1, ikan2);

        System.out.println("Ikan 1: " + ikan1);
        System.out.println("Ikan 2: " + ikan2);
        System.out.println("\nIkan mana yang dikembalikan oleh nicestFish()?");
        System.out.println("-> " + ikanPalingRamah);
        // Ikan yang dikembalikan adalah Amber karena memiliki tingkat keramahan 5 (lebih tinggi dari James yang bernilai 3).
    }
}