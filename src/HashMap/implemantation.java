package HashMap;
import java.util.*;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class implemantation {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        //insertion
        map.put("A" , 10);
        map.put("B" , 20);
        map.put("C" , 30);
        map.put("D" , 40);
        System.out.println(map);
        //contains or not in the map  map.contains(...) gives boolean value
        System.out.println("A present in the map or not : "+map.containsKey("A"));
        System.out.println("Z present in the map or not : "+map.containsKey("Z"));
        map.remove("A");
        System.out.println(map);

        // Iteration in HashMap
        //Map.Entry<Integer , Integer> mp = Map.entrySet();

        for (Map.Entry<String , Integer> me : map.entrySet()){
            System.out.print(me.getKey());
            System.out.println(" " + me.getValue());
        }
        Set<String> keys = map.keySet();
        System.out.println();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println( keys.size());

    }
}
