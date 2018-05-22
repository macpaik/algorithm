// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8

        int min = A / K;

        int max = B / K;

        return max - min + (A % K == 0 ? 1 : 0);

    }
}
