import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int i = 1; i <= rows - row; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
