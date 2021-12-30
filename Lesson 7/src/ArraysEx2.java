public class ArraysEx2 {

    public static void main(String[] args) {

        double[] array = {0.1,4.3,5.4,5.6,7.8,8.6,9.9,1.2,4.5,2.5};

        double lowestNum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowestNum) {
                lowestNum = array[i];
                index = i;
            }
        }
        System.out.println(lowestNum);
        System.out.println(index);
    }
}
