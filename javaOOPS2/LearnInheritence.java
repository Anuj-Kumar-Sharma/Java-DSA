package javaOOPS2;

public class LearnInheritence {
	
	public static void main(String[] args) {
		
		Samsung s10 = new Samsung();
		s10.playGames(4);
		
//		Apple a1 = new Apple();
//		a1.playGames(4);
		
		MobilePhone obj = new MobilePhone();
		obj.playGames();
		obj.playGames(4);
	}
}

class Samsung extends MobilePhone{
	void playGames() {
		System.out.println("samsung playing games");
	}
}

class Apple extends MobilePhone{
	
}

class MobilePhone {
	boolean hasHeadphoneJack;
	String oses;
	int price;
	int dimen;
	
	void playGames() {
		System.out.println("mobile phone playing games");
	}
	
	void playGames(int x) {
		for(int i = 0; i<x; i++) {
			System.out.println("playing games "+ i);
		}
	}
	
	
	
}