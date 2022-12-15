package test;

public class studmark {


	    public static void main(String[] args) {

	        // Declare 2D array to store marks of each student
	        int[][] marks = new int[2][3]; 

	        // Initialize marks of each student
	        marks[0][0] = 90; // Student 1, Subject 1
	        marks[0][1] = 80; // Student 1, Subject 2
	        marks[0][2] = 70; // Student 1, Subject 3
	        marks[1][0] = 70; // Student 2, Subject 1
	        marks[1][1] = 80; // Student 2, Subject 2
	        marks[1][2] = 90; // Student 2, Subject 3

	        // Calculate total marks of each student in each department
	        int dep1Total = marks[0][0] + marks[0][1] + marks[0][2];
	        int dep2Total = marks[1][0] + marks[1][1] + marks[1][2];

	        // Print total marks
	        System.out.println("Department 1 Total Marks = " + dep1Total);
	        System.out.println("Department 2 Total Marks = " + dep2Total);
	    }


	}


