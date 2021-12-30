public class TwoDArrayEx3 {

    public static void main(String[] args) {

        int[][] matrix = {
                {10,10,10,10},
                {50,50,50,50},
                {51,51,51,51}
        };

        int result = 0;
        int result2 = 0;
        int result3 = 0;

     for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
             if (i == 0) {
                 result += matrix[i][j];
             } else if (i == 1) {
                 result2 += matrix[i][j];
             } else if (i == 2) {
                 result3 += matrix[i][j];
             }
         }
     }
        if (result > result2 && result > result3) {
            System.out.println("Line one is the highest");
            System.out.println("The sum is: " + result);
        } else if (result2 > result && result2 > result3) {
            System.out.println("Line two is the highest");
            System.out.println("The sum is: " + result2);
        } else {
            System.out.println("Line three is the highest");
            System.out.println("The sum is: " + result3);
        }
    }
}
