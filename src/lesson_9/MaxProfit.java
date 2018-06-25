// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        if (A.length == 1 || A.length == 0) return 0;

        int curProf = 0;

		int minPrice = A[0];

		int maxProf = 0;

		for (int i = 1; i < A.length; i++) {

			curProf = Math.max(0, A[i] - minPrice);
			minPrice = Math.min(minPrice, A[i]);
			maxProf = Math.max(curProf, maxProf);

		}
		
		return maxProf;
    }
}
