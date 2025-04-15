
public class function {
    public static void main(String[] args) {

        System.out.println("Welcome to Java!");
        helloworld();
        System.out.println("method calling done!");
        pattern();
    }

    public static void helloworld() {
        System.out.println("Hello World!");
    }

    public static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
