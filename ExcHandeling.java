// Java program for exception handling
import java.util.Scanner;
class ExcHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's perform division");
        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter denominator: ");
        int den = sc.nextInt();
        try {
            System.out.println(num + "/" + den + " = " + (num / den));
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Program executed successfully...");
    }
}