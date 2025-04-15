import java.util.Scanner;

public class bitwiseand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise and operator.\n");
        // working of this operator is given below
        // exmaple 12 and 13 so, 12 binary is 1100 and 13 is 1101
        // 1100 | 1101 = 1100 so, the answer is : 12
        System.out.print("Please Enter first number : ");
        int n1 = input.nextInt();
        System.out.print("Please Enter second number :");
        int n2 = input.nextInt();
        int res = n1 & n2;
        System.out.println("Result is : " + res);
    }
}
