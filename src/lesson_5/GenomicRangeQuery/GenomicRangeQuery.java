// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8

        int [] result = new int[P.length];

		for (int i = 0; i < P.length; i++) {

			String dif = S.substring(P[i], Q[i] + 1);
			char [] newS = dif.toCharArray();
			int tmp = 0;
			Arrays.sort(newS);
			switch (newS[0]) {
			case 'A' :
				tmp = 1;
				break;
			case 'C' :
				tmp = 2;
				break;
			case 'G' :
				tmp = 3;
				break;
			case 'T' :
				tmp = 4;
				break;
			}
			result[i] = tmp;

		}

		return result;

    }
}
