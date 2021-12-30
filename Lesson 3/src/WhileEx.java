import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;

        if (a > b) {
            c = a;
            while (b <= c) {
                System.out.println(b);
                b++;
            }
        } else {
            c = b;
            while (a <= c) {
                System.out.println(a);
                a++;
            }
        }
    }
}
