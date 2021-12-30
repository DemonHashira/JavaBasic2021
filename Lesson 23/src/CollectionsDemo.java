import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        Collections.swap(list, 0,1);
        Collections.shuffle(list);
//        System.out.println(list.contains("second"));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
