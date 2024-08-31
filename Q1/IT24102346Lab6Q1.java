import java.util.Scanner;

public class IT24102346Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double squareRoot = Math.sqrt(number);

        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Square root of " + number + " is: " + squareRoot);
    }
}