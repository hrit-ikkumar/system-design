import java.util.*;

/*
A : [ 359, 963, 465, 706, 146, 282, 828, 962, 492 ]
B : [ 96, 43, 28, 37, 92, 5, 3, 54, 93 ]
C : 383
 */
class Main {
    public static void main(String args[]) {
        Solution sol = new Solution();
        sol.solve(new ArrayList<>(Arrays.asList(8, 4, 5, 7, 6, 2)));
    }

}
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        int sum = 0;
        int n = A.size();
        for(int x: A) sum+= x;
        sum/=2;

        int dp_table[][] = new int[n+1][sum+1];
        for(int i=1; i<= sum;i++)dp_table[0][i] = Integer.MAX_VALUE;

        for(int i=1;i<= n;i++) {
            for(int j=1;j<= sum;j++) {
                dp_table[i][j] = dp_table[i-1][j];
                if(A.get(i-1) <= j && dp_table[i-1][j - A.get(i-1)] != Integer.MAX_VALUE) {
                    dp_table[i][j] = Math.min(dp_table[i][j], dp_table[i-1][j-A.get(i-1)] + 1);
                }
            }
        }

        for(int i=sum;i>=0;i--) {
            if(dp_table[A.size()][i] != Integer.MAX_VALUE) {
                return dp_table[A.size()][i];
            }
        }
        return 0;
    }
}
