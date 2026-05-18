import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char d = sc.next().charAt(0);

        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ||
            d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }

        sc.close();
    }
}y