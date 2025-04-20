import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse digit program");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reversedNum = reverse(num);
        System.out.println("The reversed number is: " + reversedNum);
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
