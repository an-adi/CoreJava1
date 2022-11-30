

//Factorial of a number
import java.util.Scanner;
class FirstClass {
 public static void main(String args[]) {
     int num, factorial = 1;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     num = sc.nextInt();
     while (num != 0) {
         factorial = num * factorial;
         num--;
     }
     System.out.println("Factorial is: " + factorial);
 }
}