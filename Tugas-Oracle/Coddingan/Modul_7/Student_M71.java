package Modul_7;

public class Student_M71 {
    private String name;
    private int credits;
    private double gpa;
    private int qualityPoints;

    // Constructor
    public Student_M71(String name, int credits, int qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gapCalc();
    }

    // Method privat untuk menghitung IP / GPA
    private void gapCalc() {
        if (this.credits > 0) {
            this.gpa = (double) this.qualityPoints / this.credits;
        } else {
            this.gpa = 0.0;
        }
    }

    // Method mengembalikan nilai rata-rata IP saat ini
    public double getGpa() {
        return this.gpa;
    }

    // Method menerima input kredit baru dan poin mutu untuk memperbarui data
    public void addCourses(int newCredits, int newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gapCalc(); // Memperbarui IP
    }

    public String getName() {
        return name;
    }
} 
