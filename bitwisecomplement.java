import java.util.Scanner;

public class bitwisecomplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise and operator.\n");
        // working of this operator is given below
        // example 11= 1011 but answer is -12 because , integer consist 4 bytes and
        // complete when eigth number like 0000,1011 then the first zero
        // will be convert into 1111 so answer is 00001011 os 11110100
        // this is a binary of -12
        System.out.print("Please Enter first number : ");
        int n1 = input.nextInt();

        int res = ~n1;
        System.out.println("Result is : " + res);
    }
}
