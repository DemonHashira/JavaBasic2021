public class Homework2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i == 5 || i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
