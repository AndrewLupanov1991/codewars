package alishev.collections;

import java.util.HashMap;
import java.util.Map;

public class MainForLessons {
    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();
        map.put(1, "One" );
        map.put(2, "Two" );
        map.put(3,"more Three");

        for(Map.Entry  entry : map.entrySet()) {
            System.out.println(entry.getKey() + ";" + entry.getValue());
        }













      }
}
