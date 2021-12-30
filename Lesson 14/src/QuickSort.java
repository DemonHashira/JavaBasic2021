import java.util.Arrays;

public class QuickSort {

    public static void main( String[] args ) {
        int[] arr = {5,8,11,0,78,8};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    static int partition(int[] arr, int left, int right) {
//        int randomIndex = (int) (Math.random() * (right-left+1)) + left;
//
//        swap(arr, right, randomIndex);

        int pivot = arr[right];
        //end interval of smaller then pivot elements
        int k = left-1;

        for (int i = left; i <= right; i++) {
            if(arr[i] <= pivot) {
                k++;
                swap(arr, k, i);
            }
        }
        return k;
    }

    static void quickSort( int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(arr, left, right);

        // sort each partition recursively
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }
}
