import java.util.Scanner;

public class evenoddbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        // 0 - even example = 2 (0010) so this is even
        // 1 - odd
        if ((n & 1) == 1) {
            System.out.println("The number is odd ");
        } else {
            System.out.println("The number is even ");
        }
    }
}
