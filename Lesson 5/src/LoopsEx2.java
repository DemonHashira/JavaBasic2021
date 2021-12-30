import java.util.Scanner;

public class LoopsEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        char symbol = '+';

        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= m; column++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
