package Recursion;

public class FibonacciUsingIterativeApproach {

    public static void main(String args[]) {
        System.out.println(getNthFib(3));
    }

    private static int getNthFib(int n) {

        int[] lastTwo = {0,1};
        int counter = 3;

        while(counter<=n){
        int numberInSeries = lastTwo[0]+lastTwo[1];
        lastTwo[0] = lastTwo[1];
        lastTwo[1] = numberInSeries;
        counter++;
        }
        return n>1?lastTwo[1]:lastTwo[0];
    }
}
