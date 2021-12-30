import java.io.IOException;

public class Trysmth {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printSomething() {

    }
}
