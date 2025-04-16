import java.util.Scanner;

public class kmTom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        float kilometers = input.nextFloat();
        float meter = kilometers * 1000;
        System.out.println(kilometers + " kilometers is equal to " + meter + " meters.");
    }
}
