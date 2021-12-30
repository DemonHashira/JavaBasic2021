import java.util.Scanner;

public class MultidimentionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array2 = new int[2][3];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
