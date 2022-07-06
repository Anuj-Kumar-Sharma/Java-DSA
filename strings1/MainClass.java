package strings1;

public class MainClass {

	// both i and j are included
	static void reverseCharacters(char[] s, int i, int j) {
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			
			i++;
			j--;
		}
	}
	
//	start  = 11
//	end    = 13
//	
//	"Never Give Up"
//	"reveN eviG pU"
//	
//	"Up Give Never"
	static String reverseWords(String s) {
		char[] c = s.toCharArray();
		
		int start = 0;
		int end = 0;
		for(; end < s.length(); end++) {
			if(c[end] == ' ') {
				reverseCharacters(c, start, end-1);
				start = end + 1;
			}
		}
		reverseCharacters(c, start, end-1);
		
		//step 2
		reverseCharacters(c, 0, s.length()-1);
		return new String(c);
	}
	
	static boolean anagrams(String s1, String s2) {
		int a[] = new int[256];
		
		for(int i = 0; i<s1.length(); i++) {
			a[s1.charAt(i)]++;
		}
		
		for(int e: a) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		for(int i = 0; i<s2.length(); i++) {
			a[s2.charAt(i)]--;
		}
		for(int e: a) {
			System.out.print(e+" ");
		}
		
		for(int e: a) {
			if(e != 0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
//		String s1 = "abcda";
//		String s2 = "adacasdkfhalksdjfalsdkjfc";
//		
//		System.out.println(anagrams(s1, s2));
		
		String s = "Never Give Up";
		String ans = reverseWords(s);
		System.out.println(ans);
		
//		String s1 = "Hello";
//		String s2 = "hello";
//		String s3 = new String("Hello");
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
//		
//		String s4 = s1+"abc";
//		
//		String s5 = s1.concat("pqr").replace('H', 'b');
////		
//		System.out.println(s1);
////		System.out.println(s5);
//		
//		String s6 = s1.toUpperCase();
//		
//		System.out.println("s1 " + s1);
//		System.out.println("s6 " + s6);
	}

}
