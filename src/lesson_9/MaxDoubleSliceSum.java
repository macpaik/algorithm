// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int N = A.length;

        int [] fromBottom = new int[N];
        int [] fromTop = new int[N];

        for (int i = 1; i < A.length - 1; i++) {
            fromBottom[i] = Math.max(0, fromBottom[i-1] + A[i]);
        }
        for (int j = N - 2; j > 0; j--) {
            fromTop[j] = Math.max(0, fromTop[j+1] + A[j]);
        }

        int result = 0;

        for (int k = 1; k < N - 1; k++ ) {
            result = Math.max(result, fromBottom[k-1] + fromTop[k+1]);
        }

        return result;

    }
}
