package Assignment1;
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * File name: MyHealthDataTest2.java
 * Author: Tsaichun Chang
 * Course: CST8284-312
 * Assignment: Assignment1
 * Date: 2023-10-11
 * Lab Professor: Daniel Cormier
 */

public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-12;	
	@Test
	public void testCalculateBMI() {
		MyHealthDataBase myHealthDataBase = new MyHealthDataBase();
		double BMIResult = myHealthDataBase.calculateBMI(123.5, 65.8);
		double expected = (123.5*703)/(65.8*65.8);
		assertEquals(BMIResult, expected, EPSILON);
	}
	
	/*
	 * According the the BMI formula, the expected result should be 28.12.
	 * The test result failed. There is an mistake in the MyHealthDataBase incorrectBMI().
	 * The correct math operation should be as below:
	 * weightParam "*" 703 / (heightParam * heightParam)
	 */ 
	@Test
	public void testIncorrectBMI() {
		MyHealthDataBase myHealthDataBase = new MyHealthDataBase();
		double BMIResult = myHealthDataBase.incorrectBMI(100, 50);
		double expected = (100*703)/(50*50);
		assertEquals(BMIResult, expected, EPSILON);
	}
	
}
