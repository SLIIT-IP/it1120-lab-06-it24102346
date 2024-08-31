import java.util.Scanner;

public class IT24102346Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumOfSquares = 0;
        int number;
        
        System.out.println("Enter positive integers (terminate input with -99):");

        // Loop to read user input
        while (true) {
            number = scanner.nextInt();
            
            if (number == -99) {
                break;  // End of input
            }
            
            if (number < 0) {
                System.out.println("Invalid input. Please enter positive integers only.");
                continue;  // Skip invalid input
            }
            
            // Update sum of squares and count
            sumOfSquares += number * number;
            count++;
        }

        if (count == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            // Calculate RMS
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.printf("Root Mean Square (RMS): %.2f%n", rms);
        }

        scanner.close();
    }
}
