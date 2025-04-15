import java.util.Scanner;

public class eifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = input.nextLine();
        System.out.print("Enter age :");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You can vote. ");
        } else {
            System.out.println("You cannot vote at this age. ");
        }
        System.out.println("Thank you, " + name);
    }
}
