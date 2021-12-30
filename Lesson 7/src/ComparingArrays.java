public class ComparingArrays {

    public static void main(String[] args) {

        int[] array = {2, 4, 5};

        int[] array2 = new int[3];
        array2[0] = 2;
        array2[1] = 4;
        array2[2] = 5;

        boolean arraysEven = true;

        if (array.length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array2[i]) {
                    arraysEven = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are not even: " + arraysEven);
    }
}
