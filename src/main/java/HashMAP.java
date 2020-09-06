import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMAP {
    public static void main(String[] args) {


        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMaphashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(hashMap);


    }
    public static void testMap(Map<Integer,String> map ){
        map.put(49,"ggdfd");
        map.put(249,"fgfox");
        map.put(29,"fogx");
        map.put(979,"foxgd");
        map.put(19,"fogfdgx");

        System.out.println(map.entrySet());


    }
}
