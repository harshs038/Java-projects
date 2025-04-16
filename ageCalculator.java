import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int yearOfBirth = input.nextInt();
        System.out.print("Enter current year : ");
        int currentYear = input.nextInt();
        int age = currentYear - yearOfBirth;
        System.err.println("Your age is " + age);
    }
}