import java.util.Scanner;

public class FunFactorial {
    public static int factorial(int n) {
        int fac = 1;

        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++)
                fac = fac * i;

        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
