package grpah1;

import java.util.*;

public class Graph2 {
	
	static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int v;
	
	public Graph2(int v) {
		this.v = v;
		for(int i = 0; i<v; i++) {
			a.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
		a.get(dest).add(src);
	}
	
	public static void dfs(int src, boolean vis[]) {
		vis[src] = true;
		System.out.print(src+" ");
		
		for(Integer neighbor: a.get(src)) {
			if(!vis[neighbor]) {
				dfs(neighbor, vis);
			}
		}
		
		
	}
	
	public static void bfs(int src, boolean vis[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis[src] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur+" ");
			
			for(Integer neighbor: a.get(cur)) {
				if(!vis[neighbor]) {
					q.add(neighbor);
					vis[neighbor] = true;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int v = 4;
		Graph2 graph = new Graph2(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(2, 3);
		graph.addEdge(0, 3);
		graph.addEdge(2, 1);
		
		boolean vis[] = new boolean[v];
//		dfs(0, vis);
		bfs(0, vis);
	}
	
}
