package javaBasics2;

import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		
		int[] ageList = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			ageList[i] = sc.nextInt();
		}
		
//		for(int i = 0; i<5; i++) {
//			System.out.println("age of roll no "+ (i+1) +" is " + ageList[i]);
//		}
		
		//for each loop
		
//		for(int element: ageList) {
//			System.out.println(element);
//		}
		
//		int a[] = {2, 1, 4, 5, 6};
		
		int a[][] = {
				{2, 1, 4},
				{4, 1, 3}
		};
		
		

		
	}

}
