package streams;

public class PrimeNumberProgram {

    public static void main(String[] args) {
     int inputArray[] = {7,10,11};
        for (int i = 0; i <inputArray.length ; i++) {
            int num = inputArray[i];
            isPrime(num);

        }

    }

    private static void isPrime(int num) {
        int count=0;
        // to find prime number
        for (int i = 1; i<= num; i++){
            if(num %i==0){
                count++;
            }

            }
        if (count==2){
         System.out.println(num + " is prime number");
         }
        else{
            System.out.println(num + " is not prime number");
     }
    }

}