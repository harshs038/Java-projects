import java.util.Scanner;

public class sumOFInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("sum of " + number + " is: " + sum);
    }

}