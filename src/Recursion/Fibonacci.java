package Recursion;

public class Fibonacci {
    public static void main(String args[]){
//        System.out.println(getNthFib(3));
        System.out.println(fib(5));

    }
    public static int getNthFib(int n) {
        // Write your code here.
        int lastElement;
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            lastElement = getNthFib(n-1) + getNthFib(n-2);
        }
        return lastElement;
    }

    //Best solution from Leetcode
    public static int fib(int n) {
        int[] arr = new int[n];
        if (n == 0 || n == 1) return n;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 2] + arr[n - 1];
    }

}