public class StringEx1 {

    public static void main(String[] args) {

        int[] array = new int[2];

        String word = "mamamm";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'm') {
                array[0]++;
            } else {
                array[1]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
