import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number for array element " + i);
            array[i] = scan.nextInt();
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
