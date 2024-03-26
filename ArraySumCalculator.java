import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

       
        int[] array = new int[size];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

       
        int sum = calculateSum(array);
        System.out.println("Sum of elements in the array: " + sum);

        sc.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}