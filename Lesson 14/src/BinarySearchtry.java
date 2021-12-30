public class BinarySearchtry {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int length = array.length;
        int x = 7;
        int result = binarySearch(array, 0, length, x);

        if (result == -1) {
            System.out.println("The element is not in the array");
        } else {
            System.out.println("The element is found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x) {
                return binarySearch(array, left,mid - 1, x);
            } else {
                return binarySearch(array, mid + 1, right, x);
            }
        }
        return -1;
    }
}
