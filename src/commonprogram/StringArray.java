package commonprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArray {
    public static void main(String[] args) {

        String[] names = {"viji", "rahni", "rohan", "rohan", "sara"};

        // iteration one way with stream
        Object[] namess = Arrays.stream(names).toArray();
        System.out.println(Arrays.toString(namess));

        //other way without stream using iteration
        for (String name :
                names) {
            System.out.println(name);

        }
        // how to reverse the String
        List<String> list=Arrays.asList(names);
        Collections.reverse(list);
        String[] arr= list.toArray(names);
        System.out.println(Arrays.toString(arr));

        //sorting string array
        Object[] name = Arrays.stream(names).sorted().toArray();
        //Arrays.sort(names);
        System.out.println(Arrays.toString(name));

        //count of elements
        Long count = Arrays.stream(names).count();
        System.out.println("element counting   :" + count);

        // find duplicate in string array name
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate name in the array :" + names[i]);

                }
            }

            //---------------------------------------------//

            int[] noArray = {25, 10, 55, 15, 95, 35, 5};

            //iteration  int array without stream
            for (Integer k : noArray) {
                System.out.println(k);
            }
            //int array iteration with stream
            int[] nos = Arrays.stream(noArray).toArray();
            System.out.println(Arrays.toString(nos));
            //----------------------------------------------------//
            //int array sorting with stream
            int[] number = Arrays.stream(noArray).sorted().toArray();
            System.out.println(Arrays.toString(number));
            // ------------------------------------//
            //other way to sort
            //Arrays.sort(noArray);
            //System.out.println(Arrays.toString(noArray));
            //-----------------------------------------//
            // int array sorting without Stream
            for (int k = 0; k< noArray.length; k++) {
                for (int j = i + 1; j < noArray.length; j++) {
                    if (noArray[k] > noArray[j]) {
                        int temp = noArray[k];
                        noArray[k] = noArray[j];
                        noArray[j] = temp;
                    }
                }
            }
            for (int k = 0; k < noArray.length; k++) {
                System.out.println(noArray[k]);


            }


        }

    }
}

























