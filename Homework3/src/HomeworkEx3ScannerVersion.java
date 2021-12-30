import java.util.Scanner;

public class HomeworkEx3ScannerVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
