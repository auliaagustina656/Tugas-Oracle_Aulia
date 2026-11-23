package Modul_7;

public class AnimalMain_M71 {
    public static void main(String[] args) {
        // Menggunakan constructor pertama (default)
        Animal_M71 animal1 = new Animal_M71();
        
        // Menggunakan constructor kedua
        Animal_M71 animal2 = new Animal_M71(60, 5, 4);

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}