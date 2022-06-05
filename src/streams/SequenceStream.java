package streams;

import java.util.Arrays;
import java.util.List;

public class SequenceStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Hello ","G", "E", "E", "K", "S!");
        list.stream().forEach(System.out::print);


    }
}
