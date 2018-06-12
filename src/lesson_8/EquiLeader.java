// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        if (A.length < 2) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
		
		int result = 0;

		for (int i = 0; i < A.length; i++) {

			if(!map.containsKey(A[i])) {
				map.put(A[i], 1);
			} else {
				map.put(A[i], map.get(A[i]) + 1);
			}

		}

		int wholeLeader = 0;
		int wholeLeaderCnt = 0;

		for (int j : map.keySet()) {

			if (map.get(j) > wholeLeaderCnt) {
				wholeLeader = j;
				wholeLeaderCnt = map.get(j);
			}

		}

		if (wholeLeaderCnt < A.length / 2) return result;

		int leftLeaderCnt = 0;
		int rightLeaderCnt = 0;

		for (int k = 0; k < A.length; k++) {

			if (A[k] == wholeLeader) {
				leftLeaderCnt++;
				rightLeaderCnt = wholeLeaderCnt - leftLeaderCnt;
			}

			if (leftLeaderCnt > (k + 1) / 2 && rightLeaderCnt > (A.length - k - 1) / 2) {
				result++;
			}

		}

		return result;
    }
}
