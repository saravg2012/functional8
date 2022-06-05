package commonprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateString {
    public static void main(String[] args) {
        String name = "Saravanakumar";
        char[] countchars = name.toCharArray();
        System.out.println(countchars);

        Map<Character,Integer> mapCount = new HashMap<>();

        for(Character ch: countchars) {

            if(mapCount.get(ch)  == null) {
                mapCount.put(ch,1);
            } else {
                mapCount.put(ch,mapCount.get(ch)+1);
            }
        }
        System.out.println(mapCount);

        Set<Character> keys = mapCount.keySet();
        for(Character key :keys) {
            if(mapCount.get(key) > 1) {
                System.out.println(   key +" - "+mapCount.get(key));


            }
        }
    }
}

