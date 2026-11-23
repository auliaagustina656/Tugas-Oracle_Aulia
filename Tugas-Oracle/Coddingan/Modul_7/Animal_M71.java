package Modul_7;

public class Animal_M71 { 
    int weight, height; 
    double speed;

    // Constructor Default
    Animal_M71() {
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }

    // Constructor Berparameter
    Animal_M71(int w, int h, int s) { 
        weight = w;
        height = h; 
        speed = s;
    }

    public double getTime(double miles) { 
        return miles / speed;
    }

    public int getWeight() { return weight; } 
    public int getHeight() { return height; } 
    public double getSpeed() { return speed; }
}