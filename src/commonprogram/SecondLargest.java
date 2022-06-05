package commonprogram;

public class SecondLargest {

    public static void main(String[] args) {

     //   int[] array = new int[] {120,11,55,100,22,99,44,66,88,500;

        findSecondLargest(new int[] {120,11,55,100,700,99,44,66,88,500});
    }

    private static void findSecondLargest(int[] inputArray) {

        int largest=0,secondLargest=0;

        for (int i=0; i<inputArray.length;i++) {

            if(inputArray[i] > largest) {
                secondLargest = largest;
                largest = inputArray[i];
            }else if(inputArray[i] < largest && inputArray[i] >  secondLargest) {

                secondLargest = inputArray[i];
            }
        }

        System.out.println(secondLargest);


    }
}
