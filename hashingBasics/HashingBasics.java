package hashingBasics;

import java.util.*;

public class HashingBasics {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("one", "I");
		map.put("two", "II");
		map.put("three", "I");
//		
//		HashSet<Integer> set = new HashSet<>();
//		set.add(34);
//		set.add(3);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);
		
//		Set<Student> rollCall = new HashSet<>();
//		Student s1 = new Student(1, "Anuj");
//		Student s2 = new Student(4, "Ankit");
//		Student s3 = new Student(2, "Anuj");
//		
//		rollCall.add(s1);
//		rollCall.add(s2);
//		rollCall.add(s3);
//		
//		System.out.println(rollCall);
//		
//		Student s4 = new Student(1, "Deepak");
//		rollCall.add(s4);
//		System.out.println(rollCall);
//		
//		Student s1 = new Student(1, "Anuj");
//		Student s2 = new Student(1, "Ankit");
//		Student s3 = s1;
		
		Student s1 = new Student(1, "Anuj");
		Student s2 = new Student(1, "Ankit");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
	
}

class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString() {
		return "("+rollNo+" , "+name+")";
	}
	
	@Override
	public int hashCode() {
		return rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student that = (Student)obj;
		if(this.rollNo == that.rollNo) {
			return true;
		}
		return false;
	}
	
}
