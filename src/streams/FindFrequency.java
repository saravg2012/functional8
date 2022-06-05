package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;




public class FindFrequency {

    public static void main(String[] args) {

        String word ="rohankrish";
      //using stream
      Map<String,Long>  frequentLetter = Arrays.stream(word.split("")).collect(Collectors.
               groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(frequentLetter);

        //without Stream

        char[] chars= word.toCharArray();

        HashMap<Character,Integer> maps= new HashMap<>();
        for (Character abc:chars) {
            if(maps.get(abc)==null){
                maps.put(abc,1);

            }
            else {
                maps.put(abc,maps.get(abc)+1);
            }

        }
        System.out.println(maps);

        //if u want to know most repetted letter
       Set< Character>  keys=maps.keySet();
        for (Character key:keys) {
            if (maps.get(key) > 5) {
                System.out.println(key + "--" + maps.get(key));
            }

        }


    }

}
