package Recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciUsingMap {

    public static void main(String args[]) {
        System.out.println(getNthFib(3));
    }


    public static int getNthFib(int n) {
        // Write your code here.
        Map<Integer,Integer> cache = new HashMap<>();
        cache.put(0,0);
        cache.put(1,1);
        return getNthFib(n,cache);
    }

    public static int getNthFib(int n, Map<Integer,Integer> cache) {

        if (!cache.containsKey(n)) {
            cache.put(n, getNthFib(n - 1, cache) + getNthFib(n - 2, cache));
        }
        return cache.get(n);
    }
}
