package strings1;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		
		String a = "abc";
		a.concat(" HI");
		
		StringBuilder b = new StringBuilder("Hello");
		
		b.append(" HI");
		b.replace(0, 3, "CATSPEED");
		b.reverse();
		
		System.out.println(a);
		System.out.println(b);

	}

}
