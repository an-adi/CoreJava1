// Java program for matching rectangles
import java.util.Scanner;
class Rectangle {
    double width, length, area;
    String colour;
    Scanner sc = new Scanner(System.in);
    Rectangle() {
        get_length();
        get_width();
        get_colour();
        find_area(); 
    } 
    void get_length() {
        System.out.print("Enter the length: ");
        length = sc.nextDouble();
    }
    void get_width() {
        System.out.print("Enter the width: ");
        width = sc.nextDouble();
    }
    void get_colour() {
        System.out.print("Enter the colour: ");
        colour = sc.next();
    }
    void find_area() {
        area = length * width;
    }
    public static void main(String[] args) { 
        System.out.println("Information of First Rectangle");
        Rectangle rect1 = new Rectangle();
        System.out.println("\nInformation of Second Rectangle");
        Rectangle rect2 = new Rectangle();
        if(rect1.area==rect2.area&&rect1.colour.equals(rect2.colour)) {
            System.out.println("Matching Rectangles");
        }
        else {
            System.out.println("Non-matching Rectangles");
        }
    }
}