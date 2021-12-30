import java.util.Arrays;

public class QuickSortTry {
    public static void main(String[] args) {
        int[] arr = {5,8,11,0,78,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] array, int x, int y) {
        int change = array[x];
        array[x] = array[y];
        array[y] = change;
    }

    public static int partition(int[] array, int left, int right) {

        int pivot = array[right];

        int k = left - 1;

        for (int i = left; i <= right; i++) {
            if (array[i] <= pivot) {
                k++;
                swap(array, k, i);
            }
        }
        return k;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(array, left, right);

        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
    }
}
