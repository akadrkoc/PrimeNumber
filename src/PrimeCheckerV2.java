import java.util.Scanner;

public class PrimeCheckerV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = getUserChoice(input);

            switch (choice) {
                case 1:
                    handleRangeCheck(input);
                    break;
                case 2:
                    handleSingleCheck(input);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid value. Please try again.");
            }

        } while (choice != 3);
        input.close();
    }

    public static void showMenu() {
        System.out.println("\n--- Prime Number Checker ---");
        System.out.println("1. Show prime numbers in a range");
        System.out.println("2. Check if a number is prime");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
    }

    public static int getUserChoice(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Please enter a valid number between 1 and 3: ");
            input.next();
        }
        return input.nextInt();
    }

    public static void handleRangeCheck(Scanner input) {
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
        System.out.println();
    }

    public static void handleSingleCheck(Scanner input) {
        System.out.print("Enter a number to check: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers cannot be prime.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        return Main.isPrime(number);
    }
}
