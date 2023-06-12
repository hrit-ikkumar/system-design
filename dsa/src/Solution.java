import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Solution sol = new Solution();
        ArrayList<ArrayList<Character>> grid= new ArrayList<>();
        ArrayList<Character> fr = new ArrayList<>();
        for(char ch: "XOOOOOOX".toCharArray()) {
            fr.add(ch);
        }
        grid.add(fr);
        ArrayList<Character> sr = new ArrayList<>();
        for(char ch: "XXOOXOOX".toCharArray()) {
            sr.add(ch);
        }
        grid.add(sr);
        ArrayList<Character> tr = new ArrayList<>();
        for(char ch: "OXXOXOXX".toCharArray()) {
            tr.add(ch);
        }
        grid.add(tr);
        sol.solve(grid);
        System.out.println(grid);
    }
    public void solve(ArrayList<ArrayList<Character>> a) {
        int n = a.size(), m = a.get(0).size();
        Set<ArrayList<Integer>> visited = new HashSet<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                ArrayList<Integer> pos = new ArrayList<>();
                pos.addAll(Arrays.asList(i,j));
                if(!visited.contains(pos) && a.get(i).get(j) == 'O') {
                    dfs(i, j, a, visited);
                }
            }
        }
    }

    public boolean dfs(int i, int j, ArrayList<ArrayList<Character>> graph, Set<ArrayList<Integer>> visited) {
        visited.add(new ArrayList<>(Arrays.asList(i,j)));

        int [] nr = {1, -1, 0, 0};
        int [] nc = {0, 0, -1, 1};
        int count = 0;
        for(int k = 0; k<nr.length; k++) {
            int ni = i + nr[k], nj = j + nc[k];
            if(ni>=0 && nj>=0 && ni<graph.size() && nj < graph.get(0).size()) {
                if(!visited.contains(new ArrayList<>(Arrays.asList(ni,nj))) && graph.get(ni).get(nj) == 'O') {
                    if(dfs(ni, nj, graph, visited)){
                        count+= 1;
                    }
                } else if (graph.get(ni).get(nj) == 'X') {
                    count +=1 ;
                }
            }
        }
        if(count == 4) {
            graph.get(i).set(j, 'X');
            return true;
        }
        return false;
    }
}
