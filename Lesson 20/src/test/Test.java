package test;

public class Test {

    static public void doThis(Object o) {
        System.out.println("Object parameter");
    }

    static public void doThis(String s) {
        System.out.println("String parameter");
    }

    public static void main(String[] args) {
        String s = "Test";
        doThis((Object) s);
    }
}
