package grpah1;

public class Graph {

	int a[][];
	int v;
	
	public Graph(int v) {
		this.v = v;
		a = new int[v][v];
	}
	
	public void addEdge(int src, int dest) {
		a[src][dest] = 1;
		a[dest][src] = 1;
	}
	
	public static void main(String args[]) {
		int v = 4;
		Graph graph = new Graph(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(2, 3);
		graph.addEdge(0, 3);
		graph.addEdge(2, 1);
	}
	
}
