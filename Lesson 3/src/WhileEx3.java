import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();


        if (num >= 1000 && num <= 9999) {
            int fourthNum = num % 10;
            int thirdNum = (num / 10) % 10;
            int secondNum = (num / 100) % 10;
            int firstNum = (num / 1000) % 10;
            int loopA = 1;

            int firmSumNum = firstNum * 10 + fourthNum;
            int secondSumNum = secondNum * 10 + thirdNum;
            System.out.println("The first formed number is " + firmSumNum);
            System.out.println("The second formed number is " + secondSumNum);

            if (firmSumNum > secondSumNum) {
                System.out.println("First formed number is higher than the second");
            } else if (secondSumNum > firmSumNum) {
                System.out.println("Second formed number is higher than the first");
            } else {
                System.out.println("The formed numbers are even");
            }
            while (loopA <= firmSumNum) {
                System.out.println(firmSumNum);
                loopA++;
            }
        } else {
            System.out.println("Invalid numbers");
        }
    }
}
