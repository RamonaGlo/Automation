import java.util.Scanner;

public class Tema {
    public static void main(String[] strings) {
        Rectangle();
        Hexagon();
        DistanceBetweenTwoPoints();
        ReverseString();
        OddNumbers();
        Lowercase();
        Fizz();
        Palindrome();
    }

    // Write a Java program to print the area and perimeter of a rectangle

    public static void Rectangle() {

        final double width = 7.6;
        final double height = 10.5;

        double perimeter = 2 * (height + width);
        double area = width * height;

        System.out.println("The perimeter of the rectangle is: " + perimeter + "\n");
        System.out.println("The area of the rectangle is: " + area + "\n");
    }

    //  Write a Java program to print the area and perimeter of a hexagon

    public static void Hexagon() {

        System.out.println("Input the length of a side of the hexagon:");
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        double perimeter = 6 * s;

        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
        System.out.print("The perimeter of the hexagon is: " + perimeter + "\n");
    }

    public static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
    // Write a Java program to compute the distance between two points on the surface of earth

    public static void DistanceBetweenTwoPoints() {
        int x1, x2, y1, y2;
        double dis;
        x1 = 2;
        y1 = 3;
        x2 = 7;
        y2 = 8;
        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between two points is:" + dis);
    }
    // Write a Java program to reverse a string

    public static void ReverseString() {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
    // Write a Java program to print the odd numbers from 1 to 99

    public static void OddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    //Write a Java program to convert a given string into lowercase
    public static void Lowercase(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String lowercase = in.nextLine();
        lowercase = lowercase.toLowerCase();
        System.out.println(lowercase);
    }

    //Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz"

    public static void Fizz(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            }
        }
        System.out.printf("\n");
    }
    //Write a Java program to check if a positive number is a palindrome or not

    public static void Palindrome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number:");

        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str))
            System.out.print("Palindrome!");

        else System.out.println("Not Palindrome");
    }
}
