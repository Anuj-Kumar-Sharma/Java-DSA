package javaOOPS2;

public class LearningAbstraction {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		Person pObj = obj;
		LivingBeing lObj = obj;
		
		
		Vehicle v1 = new Scooty();
		
	}

}

// using abstract keyword

abstract class ElectronicItem {
	abstract void battery();
}

abstract class Vehicle {
	abstract void starts();
	void breaks() { // cannot achieve true abstraction
		System.out.println("vehicle breaks");
	}
}

class Scooty extends Vehicle {
	
	@Override
	void starts() {
		
	}
}

class Car extends Vehicle {

	@Override
	void starts() {
		
	}
}

// using Interfaces

interface Person {
	void walk();
}

interface LivingBeing {
	void walk();
	void breaths();
}

class Employee implements Person, LivingBeing {

	@Override
	public void walk() {
		
	}

	
	public void breaths() {
		// TODO Auto-generated method stub
		
	}
	
}

class Student implements Person {
	
	@Override
	public void walk() {
		
	}
}


















