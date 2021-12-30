import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 1;
        int step = 0;


        do {
            step++;
            result *= step;
        } while (step < n);
            System.out.println(result);
    }
}
