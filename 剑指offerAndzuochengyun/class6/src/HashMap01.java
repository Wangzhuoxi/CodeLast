import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zuo", "31");

        System.out.println(map.containsKey("zuo"));
        System.out.println(map.containsKey("chengyun"));
        System.out.println("=========================");

        System.out.println(map.get("zuo"));
        System.out.println(map.get("chengyun"));
        System.out.println("=========================");

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println("=========================");

        map.clear();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "1");
        map.put("E", "2");
        map.put("F", "3");
        map.put("G", "1");
        map.put("H", "2");
        map.put("I", "3");
        for (Map.Entry<String,String> entry:map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }



}
