package graphs3;

import java.util.*;

class Graph3 {
	
	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int v;
	
	int indeg[];
	
	// directed graph
	public Graph3(int v) {
		this.v = v;
		for(int i = 0; i<v; i++) {
			a.add(new ArrayList<Integer>());
		}
		indeg = new int[v];
	}
	
	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
	}
	
	void indegree() {
		for(ArrayList<Integer> adjacent: a) {
			for(Integer neighbor: adjacent) {
				indeg[neighbor]++;
			}
		}
	}
	
	void topologicalSortUsingDFS() {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		boolean vis[] = new boolean[v];
		
		for(int i = 0; i<v; i++) {
			if(!vis[i]) {
				dfs(i, vis, stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	void dfs(int src, boolean vis[], ArrayDeque<Integer> stack) {
		vis[src] = true;
		
		for(Integer neighbor: a.get(src)) {
			if(!vis[neighbor]) {
				dfs(neighbor, vis, stack);
			}
		}
		
		stack.push(src);
	}
	
//	Kahn's Algorithm
	void topologicalSortUsingBFS() {
		indegree();
		int count = 0;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for(int i = 0; i<v; i++) {
			if(indeg[i] == 0) {
				q.add(i);
				count++;
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			ans.add(cur);
			
			for(Integer neighbor: a.get(cur)) {
				indeg[neighbor]--;
				if(indeg[neighbor] == 0) {
					q.add(neighbor);
					count++;
				}
			}
		}
		
		if(count < v) {
			System.out.println("cycle is present, no topological sort possible");
		}  else {
			for(Integer e: ans) {
				System.out.print(e+" ");
			}
		}
		
	}
	
	
}

public class MainClass {
	
	public static void main(String[] args) {
		int v = 6;
		Graph3 graph = new Graph3(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(0, 2);
//		graph.addEdge(3, 5);
		graph.addEdge(5, 3);
		graph.addEdge(4, 5);
		
//		graph.indegree();
//		
//		for(int e: graph.indeg) {
//			System.out.println(e);
//		}
		
//		graph.topologicalSortUsingDFS();
		graph.topologicalSortUsingBFS();

	}

}
