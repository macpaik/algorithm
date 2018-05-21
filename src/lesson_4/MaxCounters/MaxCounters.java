// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {

        //for final roop
        int max = 0;

        //for current roop
        int tmp = 0;

        int [] result = new int [N];

        //for current max
        //if there is no consecutive operation,
        //you dont need to care about.
        for (int i = 0; i < A.length; i++) {

            if (A[i] >= 1 && A[i] <= N) {

                result[A[i] - 1] = Math.max(result[A[i] - 1], max);
                result[A[i] - 1] += 1;
                tmp = Math.max(result[A[i] - 1], tmp);

            } else if (A[i] == N+1 ){

                max = tmp;

            }

        }

        //for index which had not consecutive operation
        //after last max counters
        for (int j = 0; j < result.length; j++) {

            result[j] = Math.max(max, result[j]);

        }

        return result;

    }
}
