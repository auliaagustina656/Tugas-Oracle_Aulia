import java.util.Random;
import java.util.Scanner;

public class Main_M61 {
        		public static void main(String args[]) {
        			Scanner scanner = new Scanner(System.in);
        			Deck d = new Deck();
       			d.shuffle(); // a. Mengacak deck kartu

       			Hand playerHand = new Hand();
        			Hand dealerHand = new Hand();

        			// b. Membagikan 2 kartu awal ke Player
       			playerHand.addCard(d.drawCard());
       			playerHand.addCard(d.drawCard());

       			System.out.println("Kartu Anda:");
        			playerHand.printHand();
        			System.out.println("Total poin Anda: " + playerHand.getTotalPoints());

        			// Player turn
        			while (playerHand.getTotalPoints() < 21) {
            			System.out.print("Apakah Anda ingin mengambil kartu lagi (y/n)? ");
            			char choice = scanner.next().charAt(0);
            			if (choice == 'y' || choice == 'Y') {
                			playerHand.addCard(d.drawCard());
                			System.out.println("Kartu Anda sekarang:");
                			playerHand.printHand();
               		System.out.println("Total poin Anda: " + playerHand.getTotalPoints());
            			} else {
                		break;
           			 }
       		}

        			if (playerHand.getTotalPoints() > 21) {
            				System.out.println("Anda Bust (Lebih dari 21)! Anda Kalah.");
       		} else {
           			 // d. Dealer turn
            			dealerHand.addCard(d.drawCard());
            			dealerHand.addCard(d.drawCard());
            
            			while (dealerHand.getTotalPoints() < 16) {
                		dealerHand.addCard(d.drawCard());
           			 }

           				 System.out.println("\nKartu Dealer:");
         		   	dealerHand.printHand();
            				 System.out.println("Total poin Dealer: " + dealerHand.getTotalPoints());

            			int playerScore = playerHand.getTotalPoints();
           			int dealerScore = dealerHand.getTotalPoints();

            			if (dealerScore > 21 || playerScore > dealerScore) {
                			System.out.println("Selamat, Anda Menang!");
           			 } else if (playerScore == dealerScore) {
                			System.out.println("Seri (Push)!");
            			} else {
                			System.out.println("Dealer Menang!");
          			  }
        			    }
        			scanner.close();
   			 }
   }

class Deck {
   				Card[] cardArray = new Card[52];
    				int cardCount = 0;
    				int currentIndex = 0;

    			Deck() {
        			int suits = 4;
       			int cardType = 13;
       			for (int i = 1; i <= suits; i++) {
            			for (int j = 1; j <= cardType; j++) {
                		cardArray[cardCount] = new Card(i, j);
                		cardCount++;
          			      }
      			   }
   			 }

    			// a. Method shuffle untuk mengacak kartu
   		 public void shuffle() {
        			Random rand = new Random();
        			for (int i = 0; i < cardArray.length; i++) {
            				int randomIndex = rand.nextInt(cardArray.length);
            				Card temp = cardArray[i];
           				cardArray[i] = cardArray[randomIndex];
           				cardArray[randomIndex] = temp;
        				}
   			          }

    		public Card drawCard() {
       			if (currentIndex < cardArray.length) {
            			return cardArray[currentIndex++];
        			}
        			return null;
    		          }

   		 public void print() {
        			for (int i = 0; i < cardArray.length; i++) {
           			System.out.println(cardArray[i]);
       		 	}
   		         }
     }

class Card {
    			String suit, name;
   			int points;

    			Card(int nl, int n2) {
        			name = getName(n2);
        			suit = getSuit(nl);
        			points = getPoints(name);
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

    		public String getSuit(int nl) {
        			switch (nl) {
           			case 1: return "Hearts";
            			case 2: return "Diamonds";
            			case 3: return "Clubs";
            			case 4: return "Spades";
            			default: return "";
       			 }
    		 }

    		public int getPoints(String name) {
        			switch (name) {
           			case "Ace": return 11; // c. Ace dihitung 11 di awal
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

// b. Class Hand untuk menyimpan array Card
class Hand {
    			Card[] cards = new Card[5];
    			int count = 0;

    		public void addCard(Card c) {
        			if (count < 5) {
            			cards[count] = c;
            			count++;
        			}
    		}

    		// c. Cek Ace dan kurangi nilai menjadi 1 jika total > 21
    		public int getTotalPoints() {
        			int total = 0;
        			int aceCount = 0;
        			for (int i = 0; i < count; i++) {
            				total += cards[i].points;
           			 if (cards[i].name.equals("Ace")) {
                			aceCount++;
            			}
        		}
        			while (total > 21 && aceCount > 0) {
            				total -= 10; 
            				aceCount--;
       			 }
        			return total;
   		 }

    		public void printHand() {
        			for (int i = 0; i < count; i++) {
            			System.out.println("- " + cards[i]);
       			 }
  		  }
         } 

