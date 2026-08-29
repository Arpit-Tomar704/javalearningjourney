package chap24_Maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ansh",20);
        map.put("Ram",10);
        map.put("sohan",15);
        System.out.println(map.size());
        System.out.println(map.get("ansh"));
        System.out.println(map.containsKey("sohan"));
        System.out.println(map.containsKey("shyam"));
        System.out.println(map.remove("sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s:%s\n",key,map.get(key));
            
        }
    }
}
