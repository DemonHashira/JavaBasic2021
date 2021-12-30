public class TwoDArrayEx6 {

    public static void main(String[] args) {

     int[][] array = {
             {5,4,3,2,1,},
             {5,4,3,2,},
             {5,4,3,},
             {5,4},
             {5}
     };

     int sum = 0;
     int count = 0;
     int average = 0;

     for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
             sum += array[i][j];
             count++;
         }
     }
        average = sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
