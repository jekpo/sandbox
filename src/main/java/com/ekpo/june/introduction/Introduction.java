package com.ekpo.june.introduction;

/**
 * Introduction to Java
 * 
 * @author June Ekpo <june.ekpo@gmail.com>
 */
public class Introduction {

	/**
	 * First Example Illustrating Branching <p>
	 * 
	 * An integer is declared and then we use branching to perform a statement 
	 * based on the value of that integer <p>
	 */
	public static void branchingUno() {

		int myAge = 4;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		}
	}


	/**
	 * Second Example Illustrating Branching <p>
	 * 
	 * Here an integer is also declared and a statement is executed depending on the
	 * truth of the test in the branch.
	 */
	public static void branchingDos() {

		int myAge = 12;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		}
	}

	/**
	 * Third Example Illustrating Branching <p>
	 * 
	 * In this example, an integer is also declared an one of the two branches will
	 * be selected depending on the test for that branch.
	 */
	public static void branchingTres() {

		int myAge = 4;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		} else {
			System.out.println("The age is less than 10");
		}
	}

	/**
	 * Fourth Example Illustrating Branching <p>
	 * 
	 * In this example, we have 4 branches <p>
	 * 
	 * One of the branches will be selected based on the test for that branch.
	 */
	public static void branchingQuatro() {

		int myAge = 4;

		if (myAge > 9) {
			System.out.println("The age is greater than 10");
		} else if (myAge > 5){
			System.out.println("The age is greater than 5");
		} else if (myAge > 4) {
			System.out.println("The age is greater than 4");
		} else {
			System.out.println("Default Message: The value of myAge is " + myAge);
		}
	}

	/**
	 * First Example Illustrating Repetition Using For Loops <p>
	 * 
	 * In this example, we are attempting to repeat a statement multiple times
	 * based on the value of the test in the for loop.
	 * 
	 * For loops generally have the following structure: <p>
	 * 
	 * for (initialize the test variable; check the test variable; update the test variable) <p>
	 * 
	 * The first portion of the for loop sets the initial value of the test variable <p>
	 * The second portion of the loop checks if the test is still true after each loop <p>
	 * The last portion of the for loop is used to update (increase or reduce) the test variable <p>
	 */
	public static void forLoops() {

		for (int i=0; i < 10; i++) {
			System.out.println("The current value of i is : " + i);
		}
	}

	/**
	 * Second Example Illustrating Repetition Using For Loops <p>
	 * 
	 */
	public static void forLoopsDos() {

		for (int i=0; i <= 10; i++) {
			System.out.println("The current value of i is : " + i);
		}
	}
	
	/**
	 * Third Example Illustrating Repetition Using For Loops <p>
	 * 
	 */
	public static void forLoopsTres() {

		for (int i=10; i > 0; i--) {
			System.out.println("The current value of i is : " + i);
		}
	}

	/**
	 * First Example Illustrating Repetition Using While Loops <p>
	 * 
	 */
	public static void whileLoops() {

		int i = 0;

		while (i <=12) {
			System.out.println("The current value of i is : " + i);
			i++;
		}
	}
	
	/**
	 * Second Example Illustrating Repetition Using While Loops <p>
	 * 
	 */
	public static void whileLoopsDos() {

		int i = 100;

		while (i > 95) {
			System.out.println("The current value of i is : " + i);
			i--;
		}
	}

	/**
	 * Main Method <p>
	 * 
	 * This is the only function the computer directly interacts with <p>
	 * 
	 * When the program is run, the computer calls the main() function <p>
	 * 
	 * Whatever logic that is present in the main method will be invoked. <p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Here we are invoking the Introduction.whileLoops() method
		// You can comment out this invocation to add another statement that invokes a different method.
		forLoopsTres();
		whileLoopsDos();
	}
}
