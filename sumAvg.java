
import java.util.Scanner;
class sumAvg {
 public static void main(String args[]) {
     double num, sum = 0;
     Scanner sc = new Scanner(System.in);
     System.out.print("How many numbers: ");
     int count = sc.nextInt();
     System.out.print("Enter the numbers: ");
     for (int i = 0; i < count; i++) {
         num = sc.nextDouble();
         sum = sum + num;
     }
     System.out.println("Sum is: " + sum);
     System.out.println("Average is: " + sum / count);
 }
}
