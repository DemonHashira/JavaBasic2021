
public class StringOperations {

    public static void main(String[] args) {

        String s = "floWer rose is beautiful flower";
        String s2 = "Rose";
        String s3 = s.concat(s2);

        System.out.println(s.length());
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.toUpperCase().trim());
        System.out.println(s.toLowerCase().trim().length());
        System.out.println("========================");
        System.out.println(s.replace("floWer", "").trim());
        System.out.println(s.compareTo(s2));
    }
}
