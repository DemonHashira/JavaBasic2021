public class RecursionEx1 {
    public static void main(String[] args) {
        System.out.println(sum(7));
    }

    static int sum(int n){
        if (n == 1) {
            return 1;
        } else {
            return sum(n-1)+n;
        }
    }
}
