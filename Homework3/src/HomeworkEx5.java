import java.util.Scanner;

public class HomeworkEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        boolean isZigzag = false;
        boolean isZigZag2 = false;

        do {
            System.out.println("Enter array length");
            n = scan.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = 1; i < array.length; i += 2 ) {
                if (i == n - 1) {
                    if (array[i] > array[i - 1]) {
                        isZigZag2 = true;
                        break;
                    }
                }
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    isZigzag = true;
                } else {
                    break;
                }
            }
        } else {
            for (int i = 1; i < array.length; i += 2 ) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    isZigzag = true;
                    isZigZag2 = true;
                } else {
                    break;
                }
            }
        }


        if (isZigzag && isZigZag2) {
            System.out.println("The given array passes the requirements for zigzag row");
            isTrue();
        } else {
            System.out.println("The given array does not pass the requirements for zigzag row");
            isFalse();
        }
    }

    static void isTrue() {
        boolean isTrue = true;
        System.out.println("True");
    }

    static void isFalse() {
        boolean isFalse = false;
        System.out.println("False");
    }
}
