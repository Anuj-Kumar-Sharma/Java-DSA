package graphsDoubts1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph4 {
	
	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int v;
	
	int indeg[];
	
	// directed graph
	public Graph4(int v) {
		this.v = v;
		for(int i = 0; i<v; i++) {
			a.add(new ArrayList<Integer>());
		}
		indeg = new int[v];
	}
	
	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
	}
	
	public boolean detectCycleInDirectedGraph() {
		boolean vis[] = new boolean[v];
		boolean recS[] = new boolean[v];
		
		for(int i = 0; i<v; i++) {
			if(!vis[i]) {
				if(dfsUtil(i, vis, recS)) return true;
			}
		}
		
		return false;
	}
	
	public boolean dfsUtil(int u, boolean vis[], boolean recS[]) {
		vis[u] = true;
		recS[u] = true;
		
		for(int v: a.get(u)) {
			if(!vis[v]) {
				if(dfsUtil(v, vis, recS)) return true;
			} else if(recS[v]) {
				return true;
			}
		}
		
		recS[u] = false;
		return false;
	}
	
	public boolean isBipartiteGraph(int src, boolean vis[]) {
		Queue<Integer> q = new LinkedList<>();
		int color[] = new int[v];
		q.add(src);
		vis[src] = true;
		color[src] = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur+" ");
			
			for(Integer neighbor: a.get(cur)) {
				if(!vis[neighbor]) {
					q.add(neighbor);
					vis[neighbor] = true;
					color[neighbor] = 1-color[cur];
				} else {
					if(color[neighbor] == color[cur]) return false;
				}
			}
		}
		
		return true;
	}
	
	
}


public class MainClass {
	
	static class Pair {
		int r, c;
		public Pair(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	static boolean doesPathExists(int a[][]) {
		int row = a.length;
		int col = a[0].length;
		boolean vis[][] = new boolean[row][col];
		Queue<Pair> q = new LinkedList<>();
		
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				if(a[i][j] == 1) {
					Pair src = new Pair(i, j);
					q.add(src);
					break;
				}
			}
		}
		
		while(!q.isEmpty()) {
			Pair cur = q.poll();
			int x = cur.r;
			int y = cur.c;
			
			if(x < 0 || x >= row || y < 0 || y >= col) continue; // to check if they are in bounds
			
			if(vis[x][y] || a[x][y] == 0) continue; // to check if non visited and non wall 
			
			if(a[x][y] == 2) return true; // to check if destination found
			
			vis[x][y] =  true; // to mark this visited
			
//			if(x-1 >= 0 && a[x-1][y] != 0 && !vis[x-1][y]) {
//				
//				vis[x-1][y] = true;
//			}
			
			q.add(new Pair(x-1, y));
			q.add(new Pair(x, y+1));
			q.add(new Pair(x+1, y));
			q.add(new Pair(x, y-1));
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		int v = 5;
		Graph4 graph = new Graph4(v);
		
		graph.addEdge(0, 4);
		graph.addEdge(1, 0);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(2, 1);
		
		System.out.println(graph.detectCycleInDirectedGraph());

	}

}
