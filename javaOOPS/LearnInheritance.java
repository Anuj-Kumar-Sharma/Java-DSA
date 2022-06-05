package javaOOPS;

class Animal { 
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}

// inherit from Animal
class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

public class LearnInheritance {

	public static void main(String[] args) {

	    // create an object of the subclass
	    Dog labrador = new Dog();

	    // access field of superclass
	    labrador.name = "Rohu";
	    labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();

	  }
}

