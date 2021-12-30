public class Array {
    public static void main(String[] args) {
        // Initialize array with 10 elements
        int[] array = new int[10];

        // Assign values to each element from 1 to 10
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }

        // print all arrays values
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        System.out.println();
//        System.out.println(array[4]);
//        System.out.println(array[6]);
//        System.out.println(array.length);

        System.out.println();
        array[0] = 30;
        array[9] = 20;

        System.out.println(array[0]);
        System.out.println(array[9]);

        array = new int[5];

        for (int j : array) {
            System.out.println(array[j]);
        }
    }
}
