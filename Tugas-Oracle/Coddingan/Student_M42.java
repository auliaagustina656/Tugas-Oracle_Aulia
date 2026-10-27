public class Student_M42{

    // Variables
    String fName;
    String lName;
    String stuId;
    String stuStatus;

    // Constructor
    public Student_M42() {
        fName = "Lisa";
        lName = "Palombo";
        stuId = "123456789";
        stuStatus = "Active";
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayStudent() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}
