import java.util.Scanner;

public class BadAdditionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (Exception e) { // Catching all exceptions
            System.out.println("Error: Something went wrong. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}

