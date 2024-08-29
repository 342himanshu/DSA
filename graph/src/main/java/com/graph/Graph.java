package com.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {

    List<List<Integer>> graph;
    boolean dir = false;

    public Graph(int vertices, boolean dir) {
        this.graph = new ArrayList<>();
        this.dir = dir;
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination){
        if(!dir) {
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
        else{
            graph.get(source).add(destination);
        }
    }

    public void print(){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+"-->");
            for(Integer nbr : graph.get(i)){
                System.out.print(nbr+" ");
            }
            System.out.println();
        }
    }

    public void BFS(int source) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()) {
            int n = q.remove();
            System.out.print(n+" ");
            for(Integer nbr : graph.get(n)) {
                if(!visited[nbr]){
                    q.add(nbr);
                    visited[nbr] = true;
                }
            }
        }
        System.out.println();
    }
}