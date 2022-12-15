package test;
import java.util.Scanner;

public class Temparature{
    public static void main(String[] args) {
        // Declare two arrays to store temperature of two cities
        int[] city1 = new int[7];
        int[] city2 = new int[7];
        
        try (// Declare a Scanner object to take user inputs
		Scanner input = new Scanner(System.in)) {
			// Record temperatures of city 1
			System.out.println("Please enter temperature for city 1: ");
			for (int i = 0; i < 7; i++) {
			    System.out.println("Day " + (i + 1) + ": ");
			    city1[i] = input.nextInt();
			}
			
			// Record temperatures of city 2
			System.out.println("Please enter temperature for city 2: ");
			for (int i = 0; i < 7; i++) {
			    System.out.println("Day " + (i + 1) + ": ");
			    city2[i] = input.nextInt();
			}
		}
    }
}