import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        if ((num1 >= 1 && num1 <= 9) && (num2 >= 1 && num2 <= 9)) {
            for (int i = 1; i <= num1; i++) {
                for (int j = 1; j <= num2; j++) {
                    result = i * j;
                    System.out.println(i + "*" + j + "=" + " " + result + ";");
                }
            }
        }
    }
}
