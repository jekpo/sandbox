package com.ekpo.june.introduction;

public class Introduction {

	public static void branchingUno() {

		int myAge = 4;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		}
	}

	public static void branchingDos() {

		int myAge = 12;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		}
	}

	public static void branchingTres() {

		int myAge = 4;

		if (myAge > 10) {
			System.out.println("The age is greater than 10");
		} else {
			System.out.println("The age is less than 10");
		}
	}

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

	public static void forLoops() {

		for (int i=0; i < 10; i++) {
			System.out.println("The current value of i is : " + i);
		}
	}

	public static void whileLoops() {

		int i = 0;

		while (i < 10) {
			System.out.println("The current value of i is : " + i);
		}
	}

	public static void main(String[] args) {

	}
}
