import java.util.Scanner;

public class LoopsEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

            do {
                if (m > n) {
                    for (int i = m; i >= n; i--) {
                        if (i % 50 == 0) {
                            System.out.println(i);
                        }
                    }
                } else {
                    for (int i = n; i >= m; i--) {
                        if (i % 50 == 0) {
                            System.out.println(i);
                        }
                    }
                }
                break;
            } while ((n >= 10 && n <= 5555) && (m >= 10 && m <= 5555));
    }
}
