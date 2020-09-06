import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // hashmap is not in maintain order
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(4, "fojgur");
        map.put(5, "fohujr");
        map.put(6, "foujr");
        map.put(7, "fou8r");

        String text = map.get(6);

        System.out.println(text);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);



        }

    }
}