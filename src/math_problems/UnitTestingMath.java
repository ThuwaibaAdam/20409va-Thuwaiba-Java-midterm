package math_problems;

import java.util.ArrayList;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {
        // unit test Factorial number using recursion
       int factorialResult = Factorial.factorial(5);
        System.out.println(factorialResult);
        //unit test Factorial number using iteration
        int factorialIterationResult = Factorial.factorialIteration(5);
        System.out.println(factorialIterationResult);
        // unit test for prime number
        ArrayList<Integer> primeNumber = PrimeNumber.findPrimes(2,1000000);
        System.out.println(primeNumber);
        // unit test for lowestNumber
        //LowestNumber.lowest(int {1,2,3,5,});
        // unit test for missing number
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumberResult = FindMissingNumber.getMissingNumber(array,10);
        System.out.println(missingNumberResult);

    }
}
