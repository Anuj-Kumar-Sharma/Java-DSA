package strings1;

public class ComparisionOfSpeed {

	public static void main(String[] args) {
		String concatString = "concatString";
		StringBuffer appendBuffer = new StringBuffer("appendBuffer");
		StringBuilder appendBuilder = new StringBuilder("appendBuilder");
		long timerStarted;

		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    concatString += " another string";
		}
		System.out.println("Time needed for 50000 String concatenations: " + (System.currentTimeMillis() - timerStarted) + "ms");

		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    appendBuffer.append(" another string");
		}
		System.out.println("Time needed for 50000 StringBuffer appends: " + (System.currentTimeMillis() - timerStarted) + "ms");
		        
		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    appendBuilder.append(" another string");
		}
		System.out.println("Time needed for 50000 StringBuilder appends: " + (System.currentTimeMillis() - timerStarted) + "ms");

	}

}
