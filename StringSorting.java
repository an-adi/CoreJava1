// Java program for sorting list of Names(Strings)
import java.util.Scanner;
class StringSorting {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter each string on a new line: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        String temp;
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("\nAlphabetically sorted strings are: ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}