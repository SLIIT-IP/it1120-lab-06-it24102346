
import java.util.Scanner;

public class IT24102346Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        while (count < 10) {
            numbers[count] = scanner.nextInt();
            count++;
        }

        System.out.println("The numbers you entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

