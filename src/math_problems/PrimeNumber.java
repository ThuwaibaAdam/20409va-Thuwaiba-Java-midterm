package math_problems;

import java.util.ArrayList;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

    }
    public static ArrayList<Integer> findPrimes (int start, int end){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int n = start; n < end; n++){
            boolean prime = true;
            int i =2;
            while(i <= n/2){
                if (n % i ==0){
                    prime = false;
                    break;
                }i++;
            }
        if (prime){
            primes.add(n);
        }
    }
    return primes;
}}
