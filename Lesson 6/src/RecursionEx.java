public class RecursionEx {
    public static void main(String[] args) {
        System.out.println(findFactoriel(5));
    }

    static int findFactoriel(int number) {
        if (number == 1 ) {
            return 1;
        } else {
            return number * findFactoriel(number-1);
        }
    }

}
