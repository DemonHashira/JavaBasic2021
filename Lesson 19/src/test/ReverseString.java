package test;

public class ReverseString {
    public static void main(String[] args) {

        String st = "abcd";

        StringBuilder sb = new StringBuilder(st);

        sb.reverse();
        System.out.println(sb);
    }
}
