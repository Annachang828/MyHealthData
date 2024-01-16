package Assignment1;
import java.util.Scanner;

/*
 * File name: MyHealthDataTest.java
 * Author: Tsaichun Chang
 * Course: CST8284-312
 * Assignment: Assignment1
 * Date: 2023-09-27
 * Lab Professor: Daniel Cormier
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest
 */

/**
 * @author Tsaichun Chang 
 * @version 0.1
 * @see MyHealthData
 * @see MyHealthDataBase
 * @since JDK 17.0.7
 */

public class MyHealthDataTest {
	/**
	 * This is a program for testing MyHealthData.
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		String firstName, lastName, gender;
		int birthYear, currentYear = 2023;
		double height, weight;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("First name: ");
		firstName = keyboard.nextLine();
		
		System.out.print("Last name: ");
		lastName = keyboard.nextLine();
		
		System.out.print("Gender: ");
		gender = keyboard.nextLine();
		
		System.out.print("Year of Birth: ");
		birthYear = keyboard.nextInt();
		
		System.out.print("Height: ");
		height = keyboard.nextDouble();
		
		System.out.print("Weight: ");
		weight = keyboard.nextDouble();
		
		MyHealthData healthData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		
		healthData.displayMyHealthData();
		keyboard.close();
		
	}
	
}
