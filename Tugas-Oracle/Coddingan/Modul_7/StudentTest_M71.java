package Modul_7;

public class StudentTest_M71 {
    public static void main(String[] args) {
        // Soal 5: Membuat 3 instance berdasarkan tabel
        Student_M71 mary = new Student_M71("Mary Jones", 14, 46);
        Student_M71 john = new Student_M71("John Stiner", 60, 173);
        Student_M71 ari = new Student_M71("Ari Samala", 31, 69);

        // Soal 6: Menambahkan 13 kredit dan 52 poin mutu ke Ari Samala
        ari.addCourses(13, 52);

        System.out.println("IP terbaru Ari Samala: " + ari.getGpa());
    }
} 

