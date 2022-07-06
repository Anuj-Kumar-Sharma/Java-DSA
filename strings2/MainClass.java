package strings2;

public class MainClass {
	
	static void patternMatching(String s, String p) {
		int n = s.length();
		int m = p.length();
		
		for(int i = 0; i<=n-m; i++) {
			int j = 0;
			for(; j<m; j++) {
				if(s.charAt(i+j) != p.charAt(j)) {
					break;
				}
			}
			if(j == m) {
				System.out.println("pattern found at "+i);
			}
		}
	}
	

	public static void main(String[] args) {
		String s = "abcabdabbacbdabda";
		String p = "bda";
		
		patternMatching(s, p);
	}

}
