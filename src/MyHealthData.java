package Assignment1;
/*
 * File name: MyHealthData.java
 * Author: Tsaichun Chang
 * Course: CST8284-312
 * Assignment: Assignment1
 * Date: 2023-09-27
 * Lab Professor: Daniel Cormier
 * Purpose: This system maintains important health information about a patient.
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest
 */

/**
 * @author Tsaichun Chang 
 * @version 0.1
 * @see MyHealthDataBase
 * @see MyHealthDataTest
 * @since JDK 17.0.7
 */

public class MyHealthData extends MyHealthDataBase
{

   /**
    * Declared instance variables for firstName, lastName and gender components of the MyHealthData. 
    * Default values for String variables are null.
    */
	private String firstName, lastName, gender;
	
	/**
    * Declared instance variables for birthYear of the MyHealthData and currentYear. 
    * Default values for integer variables are zero.
    */
	private int birthYear, currentYear;
	
	/**
    * Declared instance variables for height and weight of the MyHealthData. 
    * Default values for integer and double variables are zero.
    */
	private double height, weight;

	/**
	 * The constructor sets firstName, lastName, gender, height, weight, birthYear, currentYear
	 * @param firstName of the patient
	 * @param lastName of the patient
	 * @param gender of the patient
	 * @param height of the patient
	 * @param weight of the patient
	 * @param birthYear of the patient
	 * @param currentYear the value of this year
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}

   /**
    * Gets the current value of this firstName.
    * @return the current value of firstName
    */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Sets the firstName for this MyHealthData.
	 * @param firstName for this MyHealthData.
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
   /**
    * Gets the current value of this lastName.
    * @return the current value of lastName
    */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Sets the lastName for this MyHealthData.
	 * @param lastName for this MyHealthData.
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
     * Gets the current value of this gender.
     * @return the current value of gender
     */
	public String getGender()
	{
		return gender;
	}
	
	/**
	 * Sets the gender for this MyHealthData.
	 * @param gender for this MyHealthData.
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

    /**
     * Gets the current value of this birthYear.
     * @return the current value of birthYear
     */
	public int getBirthYear()
	{
		return birthYear;
	}
	
	/**
	 * Sets the birthYear for this MyHealthData.
	 * @param birthYear for this MyHealthData.
	 */
	public void setBirthYear(int birthYear)
	{
		this.birthYear = birthYear;
	}
	
    /**
     * Gets the currentYear.
     * @return currentYear the value of current year
     */
	public int getCurrentYear()
	{
		return currentYear;
	}
	
    /**
     * Gets the current value of this height.
     * @return the current value of height
     */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the height for this MyHealthData.
	 * @param height for this MyHealthData.
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
    /**
     * Gets the current value of this weight.
     * @return the current value of weight
     */
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * Sets the weight for this MyHealthData.
	 * @param weight for this MyHealthData.
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
    /**
     * Gets the calculation result for age.
     * @return the calculation result for age
     */
	public int getAge()
	{
		return currentYear - birthYear;
	}

	/**
	 * Output a report that represents this MyHealthData,
	 * including firstName, lastName, gender, birthYear, weight, height, age,
	 * maximum heart rate, target heart rate range, BMI and BMI standards.
	 */
    public void displayMyHealthData() 
    { 
    	System.out.printf("First name: %s%n", firstName);
    	System.out.printf("Last name: %s%n", lastName);
    	System.out.printf("Gender: %s%n", gender);
    	System.out.printf("Year of birth: %d%n", birthYear);
    	System.out.printf("Height: %.2f%n", height);
    	System.out.printf("Weight: %.2f%n", weight);
    	System.out.printf("Age in years: %d%n", getAge());
    	System.out.printf("maximum heart rate: %d%n", (220 - getAge()));
    	System.out.printf("target heart rate range: %.2f", (0.5 * (220 - getAge())));
    	System.out.printf("%s", " - ");
    	System.out.printf("%.2f%n", (0.85 * (220 - getAge())));
    	System.out.printf("BMI: %.2f%n%n", calculateBMI(weight, height));    	

	    System.out.println("BMI VALUES");
	    System.out.println("Underweight: less than 18.5");
	    System.out.println("Normal:      between 18.5 and 24.9");
	    System.out.println("Overweight:  between 25 and 29.9");
	    System.out.println("Obese:       30 or greater");   
    } 

}