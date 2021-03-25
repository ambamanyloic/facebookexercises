package com.loic.projectfacebook.leetcode.medium;

public class ConnectedComponentsGraph {
    public int connectedComponents(int n, int[][] edges) {
        int[] uf = new int[n];
        for(int i = 0; i < n; i++) {
            uf[i] = i;
        }

        for(int[] e : edges) {
            int x = e[0];
            int y = e[1];

            while (uf[x] != x){
                x = uf[x];
            }

            while (uf[y] != y){
                y = uf[y];
            }

            if(x != y) {
                uf[x] = y;
                n--;
            }
        }
        return n;
    }

    public static void main(String [] args){

        ConnectedComponentsGraph graph = new ConnectedComponentsGraph();
        int[][] new_arr = {{1,2},{2,6},{4,7},{5,9}};
        System.out.println(graph.connectedComponents(3,new_arr));
    }
}
