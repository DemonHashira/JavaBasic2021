import java.util.Scanner;

public class Homework3Ex4SecondTry {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int count = 1;
        int tempCount = 1;
        int number = 0;

        do {
            System.out.println("Enter array length");
            n = scan.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                tempCount++;
            } else {
                tempCount = 1;
            }

            if (tempCount > count) {
                count = tempCount;
                number = array[i];
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(number + " ");
        }
    }
}
