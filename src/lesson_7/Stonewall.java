// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8

        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (int h : H) {

            while (!stack.empty() && stack.peek() > h ) {

                stack.pop();

            }

            if (!stack.empty() && stack.peek() == h ) {

                continue;
                
            }

            if(stack.empty() || stack.peek() < h ) {
                result++;
                stack.push(h);
                continue;
            }

        }

        return result;

    }
}
