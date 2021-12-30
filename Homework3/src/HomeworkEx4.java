
import java.util.Scanner;

public class HomeworkEx4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int count = 1;
        int maxCount = 1;
        int mostFrequentNumber = 0;


        do {
            System.out.println("Enter array length");
            n = scan.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 1; i < array.length - 1; i++) {
         if (array[i] == array[i + 1]) {
             count++;
         } else {
             count = 1;
         }

         if (count > maxCount) {
             maxCount = count;
             mostFrequentNumber = array[i];
         }
     }
        for (int i = 0; i < maxCount; i++) {
         System.out.print(mostFrequentNumber + " ");
     }
    }
}
