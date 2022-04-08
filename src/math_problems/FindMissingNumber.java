package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};


    }
    public static int getMissingNumber(int []array , int n ){
        int actualSum =0;
        int expectedSum = (n * (n+1)/2);
        for (int i:array){
            actualSum = actualSum+i;}
        return expectedSum - actualSum;
        }
    }

