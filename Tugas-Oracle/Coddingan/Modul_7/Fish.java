package Modul_7;
public class Fish {
    private String name;
    private String typeOfFish;
    private int friendliness;

    // Soal 1 & 2: No-argument constructor (Mengatur nilai default)
    public Fish() {
        this.name = "Unknown";
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Soal 3: Constructor overloading dengan parameter t (type) dan f (friendliness)
    public Fish(String t, int f) {
        this.name = "Unknown";
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Constructor tambahan untuk mendukung nama ikan (Soal 6)
    public Fish(String name, String t, int f) {
        this.name = name;
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Soal 4: Penjelasan Overloading Constructor
    // Mengapa dimungkinkan memiliki lebih dari satu constructor dengan nama sama?
    // Jawab: Karena Java membedakan constructor berdasarkan jumlah, tipe, atau urutan parameter 
    // yang diterimanya (signature-nya berbeda), sehingga compiler tahu constructor mana yang harus dipanggil.

    // Soal 5: Method getFriendliness() untuk mengembalikan tingkat keramahan
    public int getFriendliness() {
        return friendliness;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    // Soal 7: Method nicestFish yang menerima dua ikan sebagai parameter
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Soal 8: Modifikasi nicestFish menjadi Variable Argument Method (Varargs)
    public static Fish nicestFish(Fish... fishes) {
        if (fishes.length == 0) {
            return null;
        }
        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public String toString() {
        return name + " (" + typeOfFish + ", Keramahan: " + friendliness + ")";
    }
}