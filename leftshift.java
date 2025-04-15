import java.util.Scanner;

public class leftshift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise and operator.\n");
        // this operator is move number , example 3 in binary is : 0011
        // so we have to declare how many int are move like num<< (number of moves
        // example num<< 1 in 0011 = 0110 so ,answer is 6 (0110)
        // it is also use find power of number
        System.out.print("Please Enter first number : ");
        int n1 = input.nextInt();

        int res = n1 << 1;
        System.out.println("Result is : " + res);
    }
}
