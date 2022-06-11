import java.util.*;

/*
A : [ 359, 963, 465, 706, 146, 282, 828, 962, 492 ]
B : [ 96, 43, 28, 37, 92, 5, 3, 54, 93 ]
C : 383
 */
class Main {
    public static void main(String args[]) {
        Solution sol = new Solution();
        ArrayList<Integer> w = new ArrayList<>(Arrays.asList(359, 963, 465, 706, 146, 282, 828, 962, 492));
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(96, 43, 28, 37, 92, 5, 3, 54, 93));
        int c = 383;
        int res = sol.solve(w, v, c);
        int resExp = 5057;
    }

}

public class Solution {
    int mem[];
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        mem = new int[C+1];
        Arrays.fill(mem,-1);
        mem[0] = 0;

        int res = knapsackWithCapacity(C,A,B,0);

        return mem[C];
    }

    private int knapsackWithCapacity(int c, ArrayList<Integer> w, ArrayList<Integer> v, int index) {
        if(c == 0 || index >= w.size()) {
            return 0;
        }
        int firstAns =
                c >= w.get(index)
                        ?
                        v.get(index) + knapsackWithCapacity(c - w.get(index), w, v, index + 1)
                        :
                        0;
        int secondAns = knapsackWithCapacity(c, w, v, index + 1);

        return  Math.max(firstAns, secondAns);
    }

    private int knapsack(int capacity,ArrayList<Integer> A,ArrayList<Integer> B,int index)
    {
        if(capacity == 0)
        {
            return 0;
        }
        else if(capacity <0 || index <= A.size()) {
            return Integer.MIN_VALUE;
        }

        if(mem[capacity]!=-1)
        {
            return mem[capacity];
        }
        int choose = Integer.MIN_VALUE;
        if(B.get(index) <= capacity)
        {
            int val = knapsack(capacity-B.get(index),A,B,index+1);
            if(val != Integer.MIN_VALUE) {
                choose = A.get(index)+ val;
            }
        }
        mem[capacity] = Math.max(choose,knapsack(capacity,A,B,index+1));

        return mem[capacity];
    }

    private ArrayList<Integer> solve_2d(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        ArrayList<ArrayList<Integer>> dp_table = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=A.size();i++) {
            dp_table.add(new ArrayList<>(Collections.nCopies(C+1, 0)));
        }

        for(int i=1;i<dp_table.size();i++) {
            for(int j=1;j<dp_table.get(0).size();j++) {
                if(B.get(i-1) <= j) {
                    dp_table.get(i)
                            .set(
                                    j,
                                    Math.max(A.get(i-1) + dp_table.get(i-1).get(j-B.get(i-1)),
                                            dp_table.get(i-1).get(j)));
                } else {
                    dp_table.get(i).set(j, dp_table.get(i-1).get(j));
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Collections.nCopies(C+1, Integer.MIN_VALUE));
        for(int i=0;i<dp_table.size();i++) {
            for(int j=0;j<dp_table.get(0).size();j++) {
                result.set(j, Math.max(result.get(j), dp_table.get(i).get(j)));
            }
        }
        return result;
    }
}