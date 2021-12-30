
public class TwoDArrayEx4 {

    public static void main(String[] args) {

        int[][] array = {
                {48,72,9,14,15},
                {21,22,53,24,75},
                {31,57,7,34,35},
                {41,95,43,44,45},
                {59,52,53,54,55},
                {61,69,63,100,65}
        };

        int lowestNum = array[0][0];
        int highestNum = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (lowestNum > array[i][j]) {
                    lowestNum = array[i][j];
                }

                if (highestNum < array[i][j]) {
                    highestNum = array[i][j];
                }
            }
        }
        System.out.println("The lowest number is: " + lowestNum);
        System.out.println("The highest number is: " + highestNum);
    }
}
