import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker_M52 {
    public static boolean isAnagram(String s1, String s2) {
        // Membersihkan string dari spasi/tanda baca dan mengubah ke huruf kecil
        String bersih1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String bersih2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        if (bersih1.length() != bersih2.length()) {
            return false;
        }
        
        char[] charArray1 = bersih1.toCharArray();
        char[] charArray2 = bersih2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string pertama: ");
        String str1 = scanner.nextLine();
        System.out.print("Masukkan string kedua: ");
        String str2 = scanner.nextLine();
        
        if (isAnagram(str1, str2)) {
            System.out.println("Hasil: Kedua string adalah anagram.");
        } else {
            System.out.println("Hasil: Kedua string BUKAN anagram.");
        }
        scanner.close();
    }
}
