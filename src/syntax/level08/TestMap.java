package syntax.level08;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Si", "asdf");
        map.put("Si", "jkl;");
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);


        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("Tom"));
        System.out.println(map.containsKey("Tom"));
        System.out.println(map.containsValue(false));
        map.remove("Tom");
        System.out.println(map.entrySet());

    }
}
