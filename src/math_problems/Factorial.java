package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {


    }
    public static int factorial(int n){

        if (n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static int factorialIteration(int x){
    int m =1;
    for (int i =x; i>1;i--){
    m = m*i;
    }
    return m;}

}
