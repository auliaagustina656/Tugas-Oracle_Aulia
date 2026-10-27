import java.util.Scanner;

public class MountvilleAdmission_M51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah siswa merupakan valedictorian atau salutatorian? (true/false): ");
        boolean isTopStudent = scanner.nextBoolean();

        System.out.print("Masukkan jumlah total siswa di sekolah: ");
        int jumlahSiswaSekolah = scanner.nextInt();

        System.out.print("Masukkan nilai GPA mahasiswa (contoh: 3.8): ");
        double gpa = scanner.nextDouble();

        System.out.print("Masukkan skor SAT mahasiswa (contoh: 1200): ");
        int sat = scanner.nextInt();

        // Evaluasi kriteria penerimaan
        boolean diterima = (isTopStudent && jumlahSiswaSekolah >= 1400) ||
                           (gpa >= 4.0 && sat >= 1100) ||
                           (gpa >= 3.5 && sat >= 1300) ||
                           (gpa >= 3.0 && sat >= 1500);

        if (diterima) {
            System.out.println("Selamat! Mahasiswa DITERIMA di Mountville University.");
        } else {
            System.out.println("Mohon maaf, mahasiswa TIDAK DITERIMA.");
        }

        scanner.close();
    }
}
