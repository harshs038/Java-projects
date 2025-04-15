import java.util.Scanner;

public class gretest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int n1 = input.nextInt();
        System.out.print("Enter number 2 :");
        int n2 = input.nextInt();
        System.out.print("Enter number 3 :");
        int n3 = input.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is largest");
        } else {
            System.out.println(n3 + " is largest");
        }
    }
}
