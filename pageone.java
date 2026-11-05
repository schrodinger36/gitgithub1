
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        // Convert strings to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert strings into character arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare both arrays
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
