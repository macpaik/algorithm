// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length == 0) return -1;

        if (A.length == 1) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if(map.containsKey(A[i])) {

                map.put(A[i], map.get(A[i]) + 1);
            	
            	if(map.get(A[i]) > A.length / 2) {
            	    return i;
            	}

            } else {
            	map.put(A[i], 1);
            }

        }

        return -1;
    }
}
