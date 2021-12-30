import java.util.Scanner;

public class PractiseEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int result = 0;

        do {
            System.out.println("Enter a number");
            number = scan.nextInt();
        } while (!(number >= 2 && number <= 27));

        for (int i = 100; i <= 999; i++) {

            int firstDigit = i % 10;
            int secondDigit = (i / 10) % 10;
            int thirdDigit = i / 100;

            result = firstDigit + secondDigit + thirdDigit;

            if (result == number) {
                System.out.println(i + ", ");
            }
        }
    }
}
