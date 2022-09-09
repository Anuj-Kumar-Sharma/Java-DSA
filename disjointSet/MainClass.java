package disjointSet;

public class MainClass {

	public static void main(String[] args) {
		
		int n = 8;
		DisjointSet obj = new DisjointSet(n);
		
		obj.union(0, 2);
		obj.union(3, 5);
		
		System.out.println(obj.isConnected(0, 3));
		
		obj.union(0, 5);
		
		System.out.println(obj.isConnected(0, 3));

	}

}
