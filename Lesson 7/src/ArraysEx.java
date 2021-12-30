public class ArraysEx {
    public static void main(String[] args) {

        char[] array1 = {'5','6','7','8','9'};
        char[] array2 = new char[5];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
       for (int i = 0; i < array1.length; i++) {
           System.out.print(array1[i] + " ");
       }
        System.out.println();

       for (int i = 0; i < array2.length; i++) {
           System.out.print(array2[i] + " ");
       }
    }
}
