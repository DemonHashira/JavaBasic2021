import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();


        if (num >= 100000 && num <= 999999) {
            int thirdNum = (num / 1000) % 10;
            int fifthNum = (num / 10) % 10;
            int sixthNum = num % 10;
            int fourthNum = (num / 100) % 10;
            int secondNum = (num / 10000) % 10;
            int firstNum = (num / 100000) % 10;
            int loopB = 1;

            int firmSumNum = firstNum * 10 + fourthNum;
            int secondSumNum = secondNum * 10 + thirdNum;
            int thirdSumNum = fifthNum * 10 + sixthNum;

            System.out.println("The first formed number is " + firmSumNum);
            System.out.println("The second formed number is " + secondSumNum);
            System.out.println("The third formed number is " + thirdSumNum);

            if (firmSumNum > secondSumNum && firmSumNum > thirdSumNum) {
                System.out.println("First formed number is greater than the second and third");
            } else if (secondSumNum > firmSumNum && secondSumNum > thirdSumNum) {
                System.out.println("Second formed number is greater than the first and third");
            } else if (thirdSumNum > firmSumNum && thirdSumNum > secondSumNum){
                System.out.println("The third formed number is greater than the first and second");
            } else if (thirdSumNum == firmSumNum && thirdSumNum == secondSumNum) {
                System.out.println("The formed numbers are even");
            }

            while (loopB <= firmSumNum) {
                System.out.println(firmSumNum);
                loopB++;
            }

        } else {
            System.out.println("Invalid numbers");
        }
    }
}