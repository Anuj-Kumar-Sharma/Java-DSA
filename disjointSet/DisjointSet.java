package disjointSet;

public class DisjointSet {
	
	int parent[];
	int rank[];
	
//	make elements from 0 to n-1
	public DisjointSet(int n) {
		parent = new int[n];
		rank = new int[n];
		for(int i = 0; i<n; i++) {
			parent[i] = i;
		}
	}
	
//	Find the representative of the group 
	int find(int x) {
//		if(x != parent[x]) {
//			return find(parent[x]);
//		}
		
		if(x != parent[x]) {
			parent[x] = find(parent[x]);
		}
		
		return parent[x];
	}
	
//	Union into one group if they are not in a group already
	void union(int a, int b) {
		int captainA = find(a);
		int captainB = find(b);
		
		if(captainA == captainB) return;
		
		if(rank[captainA] < rank[captainB]) {
			parent[captainA] = captainB;
		} else if(rank[captainB] < rank[captainA]) {
			parent[captainB] = captainA;
		} else {
			parent[captainB] = captainA;
			rank[captainA]++;
		}
	}

//	Are in a Team
	boolean isConnected(int a, int b) {
		int captainA = find(a);
		int captainB = find(b);
		
		return captainA == captainB;
	}
}
