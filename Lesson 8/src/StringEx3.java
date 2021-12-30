import java.util.Scanner;

public class StringEx3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;

        String result = "";

        do {
            System.out.println("Enter a positive number");
            n = scan.nextInt();
        } while (n <= 0);

        for (int i = 0; i <= n; i++) {
            result += i;

        }
        System.out.println(result);
    }
}
