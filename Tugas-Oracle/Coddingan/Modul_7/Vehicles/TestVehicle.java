package Modul_7.Vehicles;

import Modul_7.Vehicles.Vehicle.Engine;

public class TestVehicle {
    public static void main(String[] args) {
        // Menguji static variable MAKE dan numVehicles sebelum instance dibuat
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Membuat vehicle pertama
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1); // Menampilkan via toString

        // Membuat vehicle kedua dengan parameter "Edict"
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        // Menampilkan total jumlah mobil yang diproduksi
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Mengubah nilai static variable MAKE melalui vehicle2 (Soal 3)
        vehicle2.setMake("Seer");

        System.out.println("\n--- Setelah mengubah MAKE via vehicle2 ---");
        System.out.println("Vehicle 1:\n" + vehicle1);
        System.out.println("\nVehicle 2:\n" + vehicle2);

        // Menguji Static Inner Class Engine (Soal 5)
        System.out.println("\n--- Pengujian Engine Inner Class ---");
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");
    }
}