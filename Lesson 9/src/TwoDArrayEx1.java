import java.util.Scanner;

public class TwoDArrayEx1 {

    public static void main(String[] args) {

        int[][] array = {
                {10,-1,1},
                {5,4,7},
                {7,8,9}
        };

        boolean isTrue = true;
        label:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    isTrue = false;
                    break label;
                }
            }
        }
        System.out.println(isTrue ? "True" : "False");
    }

}
