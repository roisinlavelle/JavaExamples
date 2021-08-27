package com.qa.helloworld;

public class CalcEx {
	public static int num1 = 20;
	public static int num2 = 10;

	public static void main(String[] args) {
		addNumbers();
		multiplyNumbers();
		subtractNumbers();
		divideNumbers();

	}

	public static void addNumbers() {
		System.out.println(num1 + num2);

	}

	public static void multiplyNumbers() {
		System.out.println(num1 * num2);

	}

	public static void subtractNumbers() {
		System.out.println(num1 - num2);

	}

	public static void divideNumbers() {
		System.out.println(num1 / num2);

	}
}