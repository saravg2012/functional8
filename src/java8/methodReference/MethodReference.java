package java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5,4,3,2,1);
        values.forEach(i -> System.out.println(i));
        values.forEach(System.out::println); //Here passing method as parameter // call by method

    }
}
