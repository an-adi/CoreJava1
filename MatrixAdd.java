// Java program to add two matrices using two dimensional arrays
import java.util.Scanner;
class MatrixAdd {
    static Scanner sc = new Scanner(System.in);
    static void acceptElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void displayAddition(int[][] arr1, int[][] arr2) {
        System.out.println("\nAddition of two matrices is: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt(); 
        System.out.print("Enter no. of columns: ");
        int columns = sc.nextInt();
        int[][] arr1 = new int[rows][columns];
        System.out.println("\nEnter " + (rows * columns) + " elements of first array: ");
        MatrixAdd.acceptElements(arr1);
        int[][] arr2 = new int[rows][columns];
        System.out.println("\nEnter " + (rows * columns) + " elements of second array: ");
        MatrixAdd.acceptElements(arr2);
        MatrixAdd.displayAddition(arr1, arr2);
    }
}