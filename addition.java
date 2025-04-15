import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // number1 input
        System.out.print("Enter first number :");
        int number1 = input.nextInt();
        // number2 input
        System.out.print("Enter second number :");
        int number2 = input.nextInt();
        // print addition of the number1 and number2
        System.out.println("the addition of two number is :" + (number1 + number2));
    }
}