package string_problems;

public class UnitTestingStringProblem {

    /*
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {

        String str1 = "ACT";
        String str2 = "CAT";
       boolean anagramResult = Anagram.anagramCheck("ACT","CAT");
       //System.out.println("Both String are Anagram " + anagramCheck( "ACT","CAT"));
        System.out.println("Both String are Anagram " + anagramResult);
    }
}
