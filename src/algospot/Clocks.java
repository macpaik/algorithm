import java.util.Arrays;
import java.util.Scanner;

public class Clocks {
    static int INF = 9999;
    static final int CLOCKS = 16, SWTCH = 10;
    static int[][] linked = {
        {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
        {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
        {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
        {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        while (n-- > 0) {
            int[] clocks = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

            int result = solve(clocks, 0);
            if (result == INF) result = -1;
            System.out.println(result);
        }

        
        sc.close();
    }

    static boolean isAligned(int[] clocks) {
        for (int i : clocks) {
            if (i != 12) return false;
        }
        return true;
    }

    static void push(int[] clocks, int swtch) {
        for (int i = 0; i < CLOCKS; i++) {
            if (linked[swtch][i] == 1) clocks[i] += 3;
            if (clocks[i] == 15) clocks[i] = 3;
        }
    }

    static int solve(int[] clocks, int swtch) {
        if (swtch == SWTCH) return isAligned(clocks) ? 0 : INF;

        int ret = INF;
        for (int i = 0; i < 4; i++) {
            ret = Math.min(ret, i + solve(clocks, swtch + 1));
            push(clocks, swtch);
        }
        return ret;
    }
}
