import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = 0;

        for (int i = 2; counter < num; i+=2) {
            counter++;
            if (i >= 6 && i <= 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
