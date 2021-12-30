
import java.util.Scanner;

public class ArraysEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int lowestNum = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0) {
                if (array[j] < lowestNum) {
                    lowestNum = array[j];
                }
            }
        }
        System.out.println(lowestNum);
    }
}
