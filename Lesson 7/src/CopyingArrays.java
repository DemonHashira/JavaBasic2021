public class CopyingArrays {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        int[] array2 = new int[3];

//        array2 = array;
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array 1: " + array[i]);
        }
        System.out.println("==========");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2: " + array2[i]);
        }
    }
}
