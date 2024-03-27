import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        double base, exponent, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        base = sc.nextDouble();
        System.out.println("Enter the exponent:");
        exponent = sc.nextDouble();
        sc.close();
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }
}