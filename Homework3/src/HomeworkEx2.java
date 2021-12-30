import java.util.Scanner;

public class HomeworkEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Enter arrays length");
            n = scan.nextInt();
        } while (n <= 0);

        int[] array = new int[n];
        int[] array2 = new int[n];

        if (n % 2 == 0) {
            int half = n / 2;
            int counter = half;

            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }

            System.arraycopy(array, 0, array2, 0, half);

            for (int i = counter; i < n; i++) {
                for (int j = n - 1; j >= counter; j--, i++) {
                    array2[i] = array[j];
                }
            }

            for (int j : array2) {
                System.out.print(j + " ");
            }
        } else {
            int half = n / 2 + 1;
            int counter = half;

            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }

            if (half >= 0) System.arraycopy(array, 0, array2, 0, half);

            for (int i = counter; i < n; i++) {
                for (int j = n - 1; j >= counter; j--, i++) {
                    array2[i] = array[j];
                }
            }

            for (int j : array2) {
                System.out.print(j + " ");
            }
        }

    }
}
