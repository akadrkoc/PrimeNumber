import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter start number: ");
            int start = input.nextInt();

            System.out.print("Enter end number: ");
            int end = input.nextInt();

            if (start > end || start < 0) {
                System.out.println("Invalid range.");
                return;
            }

            System.out.println("Prime numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter only integers.");
        }
    }

    public static boolean isPrime(int number) {
        return Main.isPrime(number);
    }
}
