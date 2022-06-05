package commonprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray(new int[] {10,20,30,40,50});


    }

    private static void reverseArray(int[] inputArray) {
        int temp;
        for(int i=0 ;i<inputArray.length/2;i++) {

            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;

        }



        System.out.println(Arrays.toString(inputArray));
    }
}
