package collectionFramework;

import java.util.*;

public class Sorting {
	
	static class Student implements Comparable<Student> {
		int rollNo;
		String name;
		
		public Student(int rollNo, String name) {
			this.rollNo = rollNo;
			this.name = name;
		}

		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + "]";
		}

		@Override
		public int compareTo(Student that) {
//			if(this.rollNo < that.rollNo) return -1;
//			if(this.rollNo > that.rollNo) return 1;
//			return 0;
			
			return this.rollNo - that.rollNo;
		}
	}
	
	static class StudentNameComparator implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rakesh");
		Student s2 = new Student(2, "Bob");
		Student s3 = new Student(3, "Anuj");
		Student s4 = new Student(8, "Anuj");
		Student s5 = new Student(12, "Anuj");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s4);
		list.add(s5);
		list.add(s2);
		list.add(s1);
		list.add(s3);
		
//		System.out.println(list);
		
//		Collections.sort(list, new StudentNameComparator());
		
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.equals(o2.name)) {
					return o1.rollNo - o2.rollNo;
				}
				return o1.name.compareTo(o2.name);
			}
		});
		
		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		
//		Collections.sort(list, new Comparator(Student::getName));
		
//		Comparator<Student> studentNameComparator
//	      = Comparator.comparing(Student::getName);
		
//		System.out.println(list);
		
		int a[][] = {
				{1, 2, 23}, 
				{3, 5, 12}, 
				{2, 7, 1}
			};
		
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		for(int x[]: a) {
			for(int e: x) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		List<List<Integer>> anotherList = new ArrayList<List<Integer>>();
		for(int i = 0; i<3; i++) {
			List<Integer> l = new ArrayList<>();
			anotherList.add(l);
		}
//		
//		list.get(0).add(1);
//		list.get(0).add(2);
//		
//		list.get(1).add(3);
//		list.get(1).add(5);
//		
//		list.get(2).add(1);
//		list.get(2).add(7);
//		
//		System.out.println(list);
//		

	}

}
