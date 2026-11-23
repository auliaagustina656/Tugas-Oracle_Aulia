package Modul_7;

public class Shape_M71 {
    private int numSides;
    private boolean regular;

    // Constructor 1: Default constructor
    public Shape_M71() {
        this.numSides = 0;
        this.regular = false;
    }

    // Constructor 2: Parameterized constructor
    public Shape_M71(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter dan Setter untuk numSides
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter dan Setter untuk regular
    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    // Method main 
    public static void main(String[] args) {
        // Membuat objek Shape menggunakan constructor berparameter
        Shape_M71 bentuk1 = new Shape_M71(4, true);

        // Menampilkan hasil menggunakan getter
        System.out.println("Jumlah sisi: " + bentuk1.getNumSides());
        System.out.println("Apakah bentuk beraturan (regular)? " + bentuk1.isRegular());
    }
}