public class ExceptionExample {

    public static void main(String[] args) {

        int[] array = new int[2];
        int index = 2;
        if (index < array.length) {
            array[index] = 5;
        }
    }
}
