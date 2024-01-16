package Assignment1;
/*
 * File name: MyHealthDataBase.java
 * Author: Tsaichun Chang
 * Course: CST8284-312
 * Assignment: Assignment1
 * Date: 2023-10-10
 * Lab Professor: Daniel Cormier
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest
 */

/** MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
 * also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
 * @author Tsaichun Chang 
 * @version 0.1
 * @see MyHealthData
 * @see MyHealthDataTest
 * @since JDK 17.0.7
 */

public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return BMI value after calculation.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    /**
     * This method returns the incorrect Body Mass Index (BMI) due to the math error. 
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     * @return incorrect BMI value after calculation.
     */
    public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam / 703 / (heightParam * heightParam);
    }
    
}