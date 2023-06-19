package problemSolving;

import java.util.LinkedList;

public class Graph1 {
	int nodecount;

	LinkedList<LinkedList<Integer>> adj = new LinkedList<LinkedList<Integer>>();

	Graph1(int nodecount) {
		this.nodecount = nodecount;

		for (int i = 0; i < nodecount; i++) {
			adj.add(new LinkedList<Integer>());
		}

	}

	public void addEdge(int node, int adjNode) {
		this.adj.get(node).add(adjNode);
	}

	public void dfs(int startNode, boolean[] checkVisted) {

		checkVisted[startNode] = true;
		System.out.print(startNode + " ");
		for (int i = 0; i < adj.get(startNode).size(); i++) {
		if(checkVisted[adj.get(startNode).get(i)] != true) {
			dfs(adj.get(startNode).get(i), checkVisted);}
		}

	}

	public static void main(String args[]) {
		Graph1 g = new Graph1(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		boolean[] checkVisted = new boolean[4];
		g.dfs(2, checkVisted);
	}

}
