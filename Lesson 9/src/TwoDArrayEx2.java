import java.util.Scanner;

public class TwoDArrayEx2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int coloms = scan.nextInt();
        int counter = 0;

        int[][] array = new int[rows][coloms];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                System.out.print(array[i][j] + " ");

            }
            counter++;
            System.out.println();
        }
    }
}
