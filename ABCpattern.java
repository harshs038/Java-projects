public class ABCpattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        char ch = 'A'; // Starting character

        for (int i = 1; i <= n; i++) {
            // Print characters in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Move to the next character
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
