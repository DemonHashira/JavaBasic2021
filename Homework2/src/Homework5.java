import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int rows = 0;
        int columns = 0;
        int noNewLine = 1;

        for (int i = num - 1; columns < num; i+=2, columns++) {
            rows = 0;
            if (noNewLine != 1) {
                System.out.println();
            }
            noNewLine++;
            for (int j = i; rows < num; rows++) {
                    System.out.print(j);
            }
        }
    }
}