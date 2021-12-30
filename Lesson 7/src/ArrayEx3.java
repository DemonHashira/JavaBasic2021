public class ArrayEx3 {

    public static void main(String[] args) {

        double[] array = {5.5,4.3,5.4,5.6,7.8,8.6,9.9,1.2,4.5,2.5};

        double highestNum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highestNum) {
                highestNum = array[i];
                index = i;
            }
        }
        System.out.println(highestNum);
        System.out.println(index);
    }
}
