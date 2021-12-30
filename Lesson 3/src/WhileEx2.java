import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;

        do {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        } while (a <= b);
    }
}
