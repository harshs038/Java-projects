import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + number + " is: " + sum);
    }

}
