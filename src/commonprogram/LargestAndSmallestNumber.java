package commonprogram;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        findLargestAndSmallest(new int[]{120, 11, 55, 600, 900, 99, 44, 66, 88, 500});

    }
    private static void findLargestAndSmallest(int[] inputArray) {

        int largest =inputArray[0];
        int smallest= inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] > largest) {
                largest = inputArray[i];
            }
            else if (inputArray[i]<smallest){
                smallest=inputArray[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);
    }
}