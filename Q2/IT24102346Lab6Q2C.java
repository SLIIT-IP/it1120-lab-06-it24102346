import java.util.Scanner;

public class IT24102346Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        // Reading 10 numbers from the user
        while (count < 10) {
            numbers[count] = scanner.nextInt();
            sum += numbers[count];  // Add the current number to sum
            count++;
        }

        // Calculating the average
        double average = sum / 10.0;

        // Printing the entered numbers
        System.out.println("The numbers you entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line

        // Printing the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
