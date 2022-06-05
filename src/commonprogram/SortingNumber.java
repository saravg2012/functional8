package commonprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumber {
    public static void main(String[] args) {

        int[] number = {10, 4, 11, 99, 33, 33, 77};

        //number array sorting
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];

                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        // sort with java8

        Arrays.sort(number);
        System.out.println("sorted elements with java8  :" + Arrays.toString(number));

        //to find even number without stream
        for (int i = 0; i < number.length; i++) {
            if (number[i ]% 2 == 0) {
                System.out.println("even  :" + number[i]);

            }
        }

        //find even number with stream
        int[] evennumber = Arrays.stream(number).filter(num -> num % 2 == 0).toArray();
        System.out.println("evenNumbers : " + Arrays.toString(evennumber));

        //find duplicate element in number array
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    System.out.println("duplicate  element :" + number[i]);
                }
            }
        }
        //REVERSED INT ARRAY
           int[] inputArray = {10, 4, 11, 99, 33, 33, 77};
        for (int i = 0; i <= inputArray.length/2; i++) {
            int temp;
            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        System.out.println("REVERSED ARRAY"+Arrays.toString(inputArray));
    }
}
