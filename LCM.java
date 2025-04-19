public class LCM {
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter  A: ");
        int num1 = input.nextInt();
        System.out.print("Enter  B: ");
        int num2 = input.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));

    }
}