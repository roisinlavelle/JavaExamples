package com.qa.helloworld;

public class HelloWorld2 {
	public static void main(String[] args) {
		System.out.println(addNumbers(10, 5));
		printMessage("Hello");
	}

	private static String printMessage(String message) {
		return message;

	}

	private static int addNumbers(int num1, int num2) {
		return num1 + num2;

	}
}
