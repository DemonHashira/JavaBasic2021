import java.util.Scanner;

public class PractiseEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int space = 1;

        for (int row = 1; row <= rows; row++) {
            for (int i = 1; i <= rows - row; i++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.print("*");
                System.out.println();
            } else if (row == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                space += 2;
            }
        }
    }
}
