package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValuesProgram2 {
    //Java 8 Sort HashMap By Values Using Customized Comparator :
    public static void main(String[] args)
    {
        //Define one HashMap called idNameMap

        Map<Integer, String> idNameMap = new HashMap<Integer, String>();

        //Insert Id-Name pairs into idNameMap

        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");

        //Java 8 sorting using Entry.comparingByValue()

        Map<Integer, String> sortedIdNameMap
                = idNameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o1.length() - o2.length()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //Print idNameMap before and after sorting

        System.out.println("Before Sorting : ");

        System.out.println(idNameMap);

        System.out.println("After Sorting : ");

        System.out.println(sortedIdNameMap);
    }

}
