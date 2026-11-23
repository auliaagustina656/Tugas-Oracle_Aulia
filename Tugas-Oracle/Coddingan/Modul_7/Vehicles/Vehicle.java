package Modul_7.Vehicles;

public class Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor
    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // Getter dan Setter
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static String getMake() {
        return MAKE;
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    // Method toString()
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + 
               "\nThe model type is " + model + 
               "\nThe chassis number is " + chassisNo;
    }

    // Static nested class Engine (Soal 4 & 5)
    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Constructor Engine yang memanggil super constructor
        public Engine(String model) {
            super(model);
        }

        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }
}