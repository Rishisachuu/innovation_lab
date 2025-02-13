import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;  // Add to sum if the number is even
            }
        }
        System.out.println("The sum of even numbers is: " + sum);
        
        scanner.close();
    }
}
