import java.util.Scanner;

public class VowelCasePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a vowel (a, e, i, o, u): ");
        char vowel = scanner.next().toLowerCase().charAt(0); // Read and convert to lowercase
        switch (vowel) {
            case 'a':
                System.out.println("Lowercase: a");
                System.out.println("Uppercase: A");
                break;
            case 'e':
                System.out.println("Lowercase: e");
                System.out.println("Uppercase: E");
                break;
            case 'i':
                System.out.println("Lowercase: i");
                System.out.println("Uppercase: I");
                break;
            case 'o':
                System.out.println("Lowercase: o");
                System.out.println("Uppercase: O");
                break;
            case 'u':
                System.out.println("Lowercase: u");
                System.out.println("Uppercase: U");
                break;
            default:
                System.out.println("Invalid input. Please enter a vowel (a, e, i, o, u).");
        }

        scanner.close();
    }
}
