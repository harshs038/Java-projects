import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;

        }
        System.out.println("The factorial of  numbers is: " + fac);
    }

}
