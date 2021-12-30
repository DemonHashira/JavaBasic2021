import java.util.Arrays;

public class CountingSortTry {
    public static void main(String[] args) {

        int[] arr = {50,50,50,40,40,40,30,30,30,20,20,20,10,10,10};

        int max = 50;

        int[] arr2 = countingSort(arr, max);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] countingSort(int[] array, int max) {

        int[] arr = new int[max + 1];

        for (int i : array) {
            arr[i]++;
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            while (0 < arr[i]) {
                array[index++] = i;
                arr[i]--;
            }
        }
        return array;
    }
}
