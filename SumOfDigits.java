import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = scanner.nextInt();
        scanner.close();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
