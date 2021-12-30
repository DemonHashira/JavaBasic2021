import java.util.Scanner;

public class MethodTry {

    public static void main(String[] args) {

        InfiniteRecursion(-5);

    }

    static void  InfiniteRecursion(int count) {
        if (count > 0) {
            if (count == 0) {
                return;
            }
            System.out.println("Hello");
            InfiniteRecursion(count - 1);
        } else {
            if (count == 0) {
                return;
            }
            System.out.println("Hello");
            InfiniteRecursion(count + 1);
        }
    }
}
