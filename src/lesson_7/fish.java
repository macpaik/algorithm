// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {

            Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {

        	if (stack.isEmpty()) {

        		stack.push(i);

        	} else {

        		if (B[i] == 0 && B[stack.peek()] == 1 && A[i] > A[stack.peek()]) {

        			while (!stack.isEmpty() && A[i] > A[stack.peek()] && B[stack.peek()] == 1) {
        				stack.pop();
        			}

        			if (stack.isEmpty()) {
        				stack.push(i);
        			}

        			if (!stack.isEmpty() && B[stack.peek()] == 0) {
        				stack.push(i);
        			}


        		} else if (B[i] == 0 && B[stack.peek()] == 0) {
        			stack.push(i);
        		} else if (B[i] == 1) {

        			stack.push(i);

        		}

        	}

        }

        return stack.size();


    }
}
