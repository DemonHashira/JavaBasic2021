import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temp = scan.nextInt();

        if (temp >= -100 && temp <= 100) {
            if (temp <= -20) {
                System.out.println("Its freezing cold!");
            } else if (temp <= 0 && temp >= -19) {
                System.out.println("Its cold");
            } else if (temp >= 1 && temp <= 15) {
                System.out.println("Its chilly ");
            } else if (temp >= 16 && temp <= 25) {
                System.out.println("Its hot");
            } else {
                System.out.println("Its burning");
            }
        } else  {
            System.out.println("Invalid temperature");
        }

    }
}
