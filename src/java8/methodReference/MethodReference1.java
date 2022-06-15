package java8.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference1 {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Navin","Reddy","Priya","Anto");
        // anonymous class
        Consumer<String> con= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(con);
        System.out.println("----------------------------");
        //Lambada expression
        names.forEach(s-> System.out.println(s));


    }
}
