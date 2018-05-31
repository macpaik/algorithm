// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {

            if(A == null || A.length < 3) return 0;

            if (A[i] >= 0 && A[i] > A[i+2] - A[i+1]) return 1;

        }

        return 0;

    }
}
