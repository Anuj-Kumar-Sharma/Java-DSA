package graphs4;

import java.util.*;

class Pair {
	int v, wt;
	public Pair(int v, int wt) {
		this.v = v;
		this.wt = wt;
	}
}

class Graph4 {
	
	ArrayList<ArrayList<Pair>> adj;
	int v;
	
	int INF = 100000;
	
	public Graph4(int v) {
		this.v = v;
		adj = new ArrayList<ArrayList<Pair>>();
		for(int i = 0; i<v; i++) {
			adj.add(new ArrayList<Pair>());
		}
	}
	
	public void addEdge(int src, int dest, int wt) {
		adj.get(src).add(new Pair(dest, wt));
	}
	
	public void addUnDirectedEdge(int src, int dest, int wt) {
		adj.get(src).add(new Pair(dest, wt));
		adj.get(dest).add(new Pair(src, wt));
	}
	
	ArrayDeque<Integer> topologicalSortUsingDFS() {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		boolean vis[] = new boolean[v];
		
		for(int i = 0; i<v; i++) {
			if(!vis[i]) {
				dfs(i, vis, stack);
			}
		}
		
		return stack;
	}
	
	void dfs(int src, boolean vis[], ArrayDeque<Integer> stack) {
		vis[src] = true;
		
		for(Pair neighbor: adj.get(src)) {
			if(!vis[neighbor.v]) {
				dfs(neighbor.v, vis, stack);
			}
		}
		
		stack.push(src);
	}
	
	int[] shortestPathInDAG(int src) {
		ArrayDeque<Integer> topologicalStack = topologicalSortUsingDFS();
		int dis[] = new int[v];
		Arrays.fill(dis, INF);
		dis[src] = 0;
		
		
		while(!topologicalStack.isEmpty()) {
			int cur = topologicalStack.pop();
			
			for(Pair neighbor: adj.get(cur)) {
				if(dis[neighbor.v] > dis[cur] + neighbor.wt) {
					dis[neighbor.v] = dis[cur] + neighbor.wt;
				}
			}
		}
		return dis;
	}
	
	int primsMST() {
		int dis[] = new int[v];
		boolean vis[] = new boolean[v];
		PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.wt - p2.wt);
		
		Arrays.fill(dis, INF);
		dis[0] = 0;
		
		pq.add(new Pair(0, 0));
		
		int ans = 0;
		
		while(!pq.isEmpty()) {
			Pair cur = pq.poll();
			if(vis[cur.v]) {
				continue;
			}
			vis[cur.v] = true;
			ans += dis[cur.v];
			
			for(Pair neighbor: adj.get(cur.v)) {
				if(!vis[neighbor.v]) {
					if(dis[neighbor.v] > neighbor.wt) {
						dis[neighbor.v] = neighbor.wt;
						pq.add(new Pair(neighbor.v, neighbor.wt));
					}
				}
			}
		}
		
		for(int e: dis) {
			System.out.print(e+" ");
		}
		return ans;
	}
	
	int[] dijkstra(int src) {
		int dis[] = new int[v];
		int par[] = new int[v];
		boolean vis[] = new boolean[v];
		PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.wt - p2.wt);
		
		Arrays.fill(dis, INF);
		dis[src] = 0;
		par[src] = -1;
		
		pq.add(new Pair(src, 0));
		
		while(!pq.isEmpty()) {
			Pair cur = pq.poll();
			if(vis[cur.v]) {
				continue;
			}
			vis[cur.v] = true;
			
			for(Pair neighbor: adj.get(cur.v)) {
				if(!vis[neighbor.v]) {
					if(dis[neighbor.v] > dis[cur.v] + neighbor.wt) {
						dis[neighbor.v] =  dis[cur.v] + neighbor.wt;
						par[neighbor.v] = cur.v;
						pq.add(new Pair(neighbor.v, dis[neighbor.v]));
					}
				}
			}
		}
		
		for(int e: dis) {
			System.out.print(e+" ");
		}
		return dis;
	}
}


public class MainClass {
	
	public static void main(String[] args) {
		int v = 5;
		int src = 0;
		
		Graph4 graph = new Graph4(v);
//		graph.addEdge(0, 1, 2);
//		graph.addEdge(0, 4, 7);
//		graph.addEdge(0, 2, 1);
//		graph.addEdge(2, 3, 2);
//		graph.addEdge(3, 4, 2);
//		graph.addEdge(1, 4, 4);
		
		graph.addUnDirectedEdge(0, 1, 7);
		graph.addUnDirectedEdge(0, 3, 3);
		graph.addUnDirectedEdge(0, 2, 8);
		graph.addUnDirectedEdge(2, 1, 2);
		graph.addUnDirectedEdge(2, 3, 1);
		graph.addUnDirectedEdge(3, 1, 1);
		graph.addUnDirectedEdge(1, 4, 2);
		graph.addUnDirectedEdge(3, 4, 5);

		
//		int shortestDis[] = graph.shortestPathInDAG(src);
//		
//		for(int e: shortestDis) {
//			System.out.println(e);
//		}
		
//		int mstDis = graph.primsMST();
//		System.out.println();
//		System.out.println(mstDis);
		
		graph.dijkstra(src);
	}

}
