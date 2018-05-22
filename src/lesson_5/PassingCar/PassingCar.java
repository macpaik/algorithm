// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int cnt = 0;

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            //find cars which are going to east
            if (A[i] == 0) {

                cnt++;
            //if '1' apears, gonna meet with [cnt] cars
            } else {

                result += cnt;

            }
            //for condition
            if (result > 1000000000) {

                result = -1;
                break;
            }

        }

        return result;

    }
}
