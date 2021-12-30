import java.util.Scanner;

public class forEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int counter = 0;

        for (int i = 3; counter < num; i+=3) {
            counter++;
            System.out.println(i);
        }
    }
}
