package commonprogram;

public class FindPrimeNumer {
        static boolean checkForPrime(int inputNumber)
        {
            boolean isItPrime = true;

            {
                for (int i = 2; i <= inputNumber/2; i++)
                {
                    if ((inputNumber % i) == 0)
                    {
                        isItPrime = false;
                        break;
                    }
                }

                return isItPrime;
            }
        }

        public static void main(String[] args)
        {
            int inputArray[] = {7,10,11};
            for(int i=0;i<inputArray.length;i++) {

                int inputNumber =inputArray[i];
                boolean isItPrime = checkForPrime(inputNumber);
                if (isItPrime)
                {
                    System.out.println(inputNumber+" is a prime number.");
                }
                else
                {
                    System.out.println(inputNumber+" is not a prime number.");
                }

            }


        }
    }

