package com.ekpo.june.introduction;

public class Parameters {

	/**
	 * Is the person an Adult
	 * 
	 * @param age
	 * @return
	 */
	public static boolean isAdult(int age) {
		
		if (age > 17) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Is the person a teenager
	 * 
	 * @param age
	 * @return
	 */
	public static boolean isTeenager(int age) {
		
		if (age > 12 && age < 18) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Is the person a child
	 * 
	 * @param age
	 * @return
	 */
	public static boolean isChild(int age) {
		
		if (age < 13) {
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * This function calculates the sum between two numbers
	 * 
	 * It adds the first number to the second number and returns the result
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public static double calculateSum(double firstNumber, double secondNumber) {
		
		double result = firstNumber + secondNumber;
		
		return result;
	}
	
	/**
	 * Subtracts the second number from the first number
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public static long calculateDifference(long firstNumber, long secondNumber) {
		
		long result = firstNumber - secondNumber;
		
		return result;
	}
	
	/**
	 * Multiplies two numbers together
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public static int calculateProduct(int firstNumber, int secondNumber) {
	
		return (firstNumber * secondNumber);
	}
	
	/**
	 * Computes the result of dividing the first number by the second number
	 * 
	 * For example 80 divided by 10 should give 8
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static double calculateQuotient(double dividend, double divisor) {
	
		double quotient = dividend / divisor;
		
		return quotient;
	}
	
	/**
	 * Calculates what is left over after division
	 * 
	 * For example 53 divided by 10 is 5 but 3 is left over.
	 * 
	 * Hence the remainder of dividing 53 by 10 is 3.
	 * 
	 * If we calculate the remainder after dividing 50 by 10 the remainder is 0.
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static int calculateRemainder(int dividend, int divisor) {
		
		int modulus = dividend / divisor;
		
		return modulus;
	}
	
	/**
	 * This function concatenates the title, first name, last name and suffix to create the full name
	 * 
	 * @param title
	 * @param fName
	 * @param lName
	 * @param suffix
	 * @return
	 */
	public static String prepareFullName(String title, String fName, String lName, String suffix) {
		
		String fullName = title + " " + fName + " " + lName + " " + suffix;
		
		return fullName;
	}
	
	/**
	 * Uses the prepareFullName() function to display the persons full name
	 * 
	 * @param title
	 * @param fName
	 * @param lName
	 * @param suffix
	 */
	public static void displayFullName(String title, String fName, String lName, String suffix) {
		
		String personFullName = prepareFullName(title, fName, lName, suffix);
		
		System.out.println("The person's full name is " + personFullName);
	}
	
	/**
	 * Displays the result of adding two numbers
	 *  
	 * @param a
	 * @param b
	 */
	public static void displayAdditionResult(double a, double b) {
		
		double sum = calculateSum(a, b);
		
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	/**
	 * Displays the result of subtracting one number from another number.
	 * 
	 * @param a
	 * @param b
	 */
	public static void displaySubtractionResult(long a, long b) {
		
		long difference = calculateDifference(a, b);
		
		System.out.println("The difference between " + a + " and " + b + " is " + difference);
	}
	
	/**
	 * Computes the product between two numbers and displays the result
	 * 
	 * @param a
	 * @param b
	 */
	public static void displayMultiplicationResult(int a, int b) {
		
		int product = calculateProduct(a, b);
		
		System.out.println("The result of multiply " + a + " and " + b + " is " + product);
	}
	
	/**
	 * Computes the quotient and displays the result.
	 * 
	 * @param a
	 * @param b
	 */
	public static void displayDivisionResult(double a, double b) {
		
		double quotient = calculateQuotient(a, b);
		
		System.out.println("The result of dividing " + a + " with " + b + " is " + quotient);
	}
	
	/**
	 * Computes the modulus and displays the result
	 * 
	 * @param a
	 * @param b
	 */
	public static void displayModulusResult(int a, int b) {
		
		int modulus = calculateRemainder(a, b);
		
		System.out.println("The remainder after dividing " + a + " with " + b + " is " + modulus);
	}
	
	/**
	 * Displays the age ground of the individual
	 * 
	 * @param personAge
	 */
	public static void displayAgeGroup(int personAge) {
		
		if (true == isAdult(personAge)) {
	
			System.out.println("A person with age " + personAge + " is an adult");
			
		} else if (true == isTeenager(personAge)) {
			
			System.out.println("A person with age " + personAge + " is a teenage");
			
		} else if (true == isChild(personAge)) {
			
			System.out.println("A person with age " + personAge + " is a child");
			
		} else {
			
			System.out.println("I should never reach this portion of the code");
		}
	}
	
	public static void loopAndSayTheAgeGroup() {
		
		for (int currentAge = 11; currentAge < 23; currentAge++) {
			
			displayAgeGroup(currentAge);
		}
	}
	
	/**
	 * Main Function
	 * 
	 * When calling any function above, only call one function at a time.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// (1) Call the loopsAndSayTheAgeGroups function and explain why the screen is showing what it is showing
		
		// (2) Call displayFullName with the following arguments
		// Mr. Israel Ekpo, Sr.
		// Mrs. June Ekpo
		// Mr. Dale Einhart Jr.
		
		
		// (3) Call displayAdditionResult with 560 and 30 and explain what is going on
		
		// (4) Call displaySubtractionResult with 560 and 30 and explain what is going on
		
		// (5) Call displayMultiplicationResult with 4 and 7
		
		// (6) Call displayDivisionResult with 62 and 15
		
		// (7) Call displayModulusResult with 62 and 15
		
		// (8) Call displayAgeGroups with 11, 16 and 19 and explain why you observe what you saw
	}
}
