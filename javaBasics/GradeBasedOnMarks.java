package dsa.course.javabasics1;

import java.util.Scanner;

public class GradeBasedOnMarks {
    /**
     * 7. Write a Java program to grade students based on their marks.
     * @param args
     */

    public static void main(String[] args) {
	    gradeBasedOnMarks();
    }

    private static void gradeBasedOnMarks() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter five marks :");

        for(int i=0;i<5;i++){
            int mark = scanner.nextInt();
            if(mark>80){
                System.out.println("Grade is A.");
            }else if(mark>35){
                System.out.println("Grade is B.");
            }else{
                System.out.println("Grade is C.");
            }
        }
    }
}
