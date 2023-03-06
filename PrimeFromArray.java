import java.util.Arrays;
import java.util.Scanner;

public class PrimeFromArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers :");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(arr));

        System.out.print("Prime numbers in the given array are :");

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
