
public class BinarySearchAl {

    public static void main( String[] args ) {
        int[] arr = {1,5,8,15,90,99};
        int n = arr.length;
        int x = 5;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            // If the element is present at the mid
            if (arr[mid] == x) {
                return mid;
            }

            // If element is smaller than mid, then it can only be present in left sub array
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            } else {
                // Else the element can only be present in right sub array
                return binarySearch(arr, mid + 1, right, x);
            }
        }

        // If element is not present in the array
        return -1;
    }
}
