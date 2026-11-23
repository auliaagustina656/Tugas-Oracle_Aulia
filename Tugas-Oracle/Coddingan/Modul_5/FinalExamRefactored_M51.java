package Modul_5;
import java.util.Scanner;

public class FinalExamRefactored_M51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Program ini akan menentukan apakah Anda bisa terbebas dari ujian akhir.");
        System.out.println("Silakan jawab pertanyaan-pertanyaan berikut.");
        
        System.out.println("Berapa nilai rata-rata Anda di kelas tersebut?");
        double average = reader.nextDouble();
        
        System.out.println("Sudah berapa kali Anda melewatkan perkuliahan di kelas?");
        int daysAbsent = reader.nextInt();
        
        // Menggabungkan seluruh kondisi ke dalam satu pernyataan if menggunakan operator logika
        if ((average >= 90 && daysAbsent <= 3) || (average >= 80 && daysAbsent <= 0)) {
            System.out.println("Selamat! Anda dibebaskan dari ujian akhir.");
        } else {
            System.out.println("Anda tidak dibebaskan dari ujian akhir.");
        }
        
        reader.close();
    }
}
