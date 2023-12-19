import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = input.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.print("Введите вторую строку: ");
        String secondString = input.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (isAnagram(firstString, secondString)) {
            System.out.println("Yes, строки являются анаграммой.");
        } else {
            System.out.println("No, строки не являются анаграммой.");
        }

        input.close();
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
}