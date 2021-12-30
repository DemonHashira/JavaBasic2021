public class StringEx2 {

    public static void main(String[] args) {

     String[] array = {"First", "Second", "Third", "Forth", "Fifth", "Sixth"};

     String result = "";

     for (int i = 0; i < array.length; i++) {
         result += array[i] + " ";
     }
        System.out.println(result);
    }
}

