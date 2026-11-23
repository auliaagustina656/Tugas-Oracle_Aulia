package Modul_7;
import java.util.Scanner;

class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        this.suit = getSuit(n1);
        this.name = getName(n2);
        this.points = getPoints(this.name);
    }

    public String getName(int n2) {
        switch (n2) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(n2);
        }
    }

    public String getSuit(int n1) {
        switch (n1) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            case 4: return "Spades";
            default: return "";
        }
    }

    public int getPoints(String name) {
        switch (name) {
            case "Ace": return 11;
            case "Jack":
            case "Queen":
            case "King": return 10;
            default: return Integer.parseInt(name);
        }
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}

public class Main_M71 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat dua kartu acak pertama
        int suit1 = (int)(Math.random() * 4.0 + 1);
        int face1 = (int)(Math.random() * 13.0 + 1);
        Card card1 = new Card(suit1, face1);

        int suit2 = (int)(Math.random() * 4.0 + 1);
        int face2 = (int)(Math.random() * 13.0 + 1);
        Card card2 = new Card(suit2, face2);

        System.out.println("Kartu 1: " + card1);
        System.out.println("Kartu 2: " + card2);

        // Menghitung total nilai poin dari dua kartu awal
        int totalPoints = card1.points + card2.points;
        int cardCount = 2;

        System.out.println("Total poin saat ini: " + totalPoints);

        // Loop untuk menambah kartu hingga maksimal 5 kartu atau poin > 21
        while (cardCount < 5 && totalPoints <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            char choice = scanner.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                int suitNew = (int)(Math.random() * 4.0 + 1);
                int faceNew = (int)(Math.random() * 13.0 + 1);
                Card newCard = new Card(suitNew, faceNew);
                
                cardCount++;
                totalPoints += newCard.points;

                System.out.println("Kartu baru: " + newCard);
                System.out.println("Total poin untuk " + cardCount + " kartu: " + totalPoints);

                if (totalPoints > 21) {
                    System.out.println("Bust! Poin Anda melebihi 21.");
                }
            } else {
                break;
            }
        }

        System.out.println("Permainan selesai. Total akhir poin Anda: " + totalPoints);
        scanner.close();
    }
} 
