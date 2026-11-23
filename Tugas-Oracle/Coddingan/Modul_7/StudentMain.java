package Modul_7;

import java.util.Date;

public class StudentMain {
    public static void main(String[] args) {
        Student2 mhs = new Student2("Aul", "lia", "Agustina", new Date(), "12345", "PPLG", "Sarjana", 2029);

        System.out.println("Nama Lengkap: " + mhs.getName());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan: " + mhs.getMajor());
        
        mhs.setMajor("Software Engineering");
        System.out.println("Jurusan Baru: " + mhs.getMajor());

        String[] nilai = {"A", "B+", "A-"};
        mhs.calculateGpa(nilai);
        System.out.println("IP / GPA: " + mhs.getGpa());
    }
}