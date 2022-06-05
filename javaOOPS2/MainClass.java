package javaOOPS2;

public class MainClass {

	public static void main(String[] args) {
		
//		Alien obj = new Alien();
//		obj.speak();
		
		Alien.speak();
		
		add(3, 5);
	}
	
	static int add(int a, int b) {
		return a+b;
	}
}

class Alien {
	static boolean isMemberOfEarth = false;
	
	int legs;
	
	static void speak() {
		System.out.println("alien speaks");
		sayHello();
	}
	
	static void sayHello() {
		System.out.println("alien says hello");
	}
}
