import java.util.Scanner;

public class areatri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base :");
        float b = input.nextFloat();
        System.out.print("Enter height :");
        float h = input.nextFloat();
        float area = b * h;
        area = area / 2;
        System.out.println("Area of Triangle :" + area);
    }
}
