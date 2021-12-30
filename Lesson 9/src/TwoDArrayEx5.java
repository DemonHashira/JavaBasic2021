import java.util.Scanner;

public class TwoDArrayEx5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i + j == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
