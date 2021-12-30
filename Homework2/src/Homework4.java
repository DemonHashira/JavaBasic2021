import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        int max = 0;
        int min = 0;

        if (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0) {
            do {

                if (num1 > num2){
                    max = num1;
                    min = num2;

                }
                if (num2 > num1) {
                    max = num2;
                    min = num1;

                }

                if (num3 > num4){
                    if (num3 > max) {
                        max = num3;

                    }
                    if (num4 < min) {
                        min = num4;

                    }
                } else {
                    if (num4 > max) {
                        max = num4;

                    }
                    if (num3 < min) {
                        min = num3;
                    }
                }
                String sep = "";
                for (int i = min; i < max; i++) {
                    if (i == min) {
                        continue;
                    }
                    System.out.print(sep + i);
                    sep = ",";
                }
                break;
            } while (num1 >= 0 && num2 >= 0 && num3 >= 0 && num4 >= 0);
        } else {
            System.out.println("Invalid numbers!");
        }
    }
}
