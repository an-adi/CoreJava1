
// Java program for calculator
import java.util.Scanner;
class Calculator {
    public static void main(String args[]) {
        int choice;
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication");
            System.out.print("4.Division\n0.Exit\nEnter choice: ");
            choice = sc.nextInt();
            if (choice == 0)
                break;
            System.out.print("Enter first number: ");
            num1 = sc.nextFloat();
            System.out.print("Enter second number: ");
            num2 = sc.nextFloat();
            switch (choice) {
            case 1:
                System.out.println("Addition is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction is " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication is " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division is " + (num1 / num2));
                break;
            default:
                System.out.println("invalid choice");
            }
            System.out.println("\n============================\n");
        } while (true);
        System.out.println("Thank you");
    }
}