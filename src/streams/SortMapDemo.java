package streams;

import pojo.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Employee( "Roshan", 45, 600000,"Science"), 60);
        employeeMap.put(new Employee( "Bikash", 22, 900000,"Science"), 90);
        employeeMap.put(new Employee( "Bimal", 48, 500000,"Science"), 50);
        employeeMap.put(new Employee( "Sourav", 32, 400000,"Science"), 40);
        employeeMap.put(new Employee( "Prakash", 55, 1200000,"Science"), 120);

        System.out.println(employeeMap);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        /*
         * for (Entry<String, Integer> entry : entries) {
         * System.out.println(entry.getKey() + "   " + entry.getValue()); }
         */

        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("****************************");
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
                .forEach(System.out::println);

    }
}
