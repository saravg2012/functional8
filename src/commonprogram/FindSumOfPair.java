package commonprogram;

public class FindSumOfPair {
    public static void main(String[] args) {

        int[] inputArray =  new int[]{ 2,6,20,30,10,5,20};
        findThePairs(inputArray,40);

        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }

    private static void findThePairs(int[] inputArray, int inputNumber) {

        for(int i =0;i < inputArray.length; i++) {

            for(int j = i+1;j< inputArray.length;j++) {

                if(inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.print(inputArray[i]  + " + " + inputArray[j] + " = " +inputNumber);
                    System.out.println();


                }
            }

        }
    }
}
