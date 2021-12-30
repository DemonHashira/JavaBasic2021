import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> addresses = new HashMap<String, String>();
        //street + number -> key
        //house/apartment/villa -> value
        addresses.put("Pirutska 2", "house Pirutska 2");
        addresses.put("Pirutska 22", "apartment Pirutska 22");
        addresses.put("Kokiche 15", "villa Kokiche 15");

//        System.out.println(addresses.containsKey("Pirutska 2"));
//        System.out.println(addresses.containsKey("Pirutska 2"));
//
//        for (String key : addresses.keySet()) {
//            System.out.println(key);
//        }
//
//        for (String value : addresses.values()) {
//            System.out.println(value);
//        }

        for (Map.Entry<String, String> entry : addresses.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
