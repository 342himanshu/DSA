package com.graph;

public class GraphApplication {

	public static void main(String[] args) {
		 Graph graph = new Graph(7, false);
		 graph.addEdge(0, 1);
		 graph.addEdge(1, 2);
		 graph.addEdge(2, 3);
		 graph.addEdge(3, 5);
		 graph.addEdge(5, 6);
		 graph.addEdge(4, 5);
		 graph.addEdge(0, 4);
		 graph.addEdge(3, 4);

		 graph.print();
		 graph.BFS(1);
	}

}
