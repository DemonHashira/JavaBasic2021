import java.util.Scanner;

public class LoopsEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int stars = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= n - rows ; space++) {
                System.out.print(" ");
            }
            for (int columns = 1; columns <= stars; columns++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
    }
}
