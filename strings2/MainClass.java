package strings2;

public class MainClass {
	
	
	static boolean rotationalStrings(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		String doubleString = s1+s1;
		return doubleString.contains(s2);
	}
	
	static void patternMatching(String s, String p) {
		int n = s.length();
		int m = p.length();
		
//					0123456789
//		String s = "abcabdabdabda";
//		String p = "bda"
//					012
//		
//		i = 7
//		j = 3
//		
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
