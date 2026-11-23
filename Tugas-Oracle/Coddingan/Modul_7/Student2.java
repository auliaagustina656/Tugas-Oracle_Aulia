package Modul_7;

import java.util.Date;

public class Student2 extends Person {
    private String nim;
    private double gpa;
    private String major;
    private String degree;
    private int graduationYear;

    public Student2(String firstName, String middleName, String lastName, Date dateOfBirth, 
                    String nim, String major, String degree, int graduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.major = major;
        this.degree = degree;
        this.graduationYear = graduationYear;
        this.gpa = 0.0;
    }

    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    public void calculateGpa(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return;
        }

        double totalPoints = 0;
        for (String grade : grades) {
            switch (grade.toUpperCase()) {
                case "A": totalPoints += 4.0; break;
                case "A-": totalPoints += 3.67; break;
                case "B+": totalPoints += 3.33; break;
                case "B": totalPoints += 3.0; break;
                case "B-": totalPoints += 2.67; break;
                case "C+": totalPoints += 2.33; break;
                case "C": totalPoints += 2.0; break;
                case "D": totalPoints += 1.0; break;
                case "F": totalPoints += 0.0; break;
                default: break;
            }
        }
        this.gpa = totalPoints / grades.length;
    }

    public String getNim() { return nim; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getGraduationYear() { return graduationYear; }
}