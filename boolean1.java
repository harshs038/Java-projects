import java.util.Scanner;

public class boolean1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = input.nextInt();
        boolean ans = num2 > num1;
        if (num2 > num1) {
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
}
