package com.qa.helloworld;

public class CalcRevisit {
	public static int num1 = 100;
	public static int num2 = 200;

	public static void main(String[] args) {

		if (num1 < num2) {
			System.out.println(divideNumbers(num1, num2));
		} else {
			System.out.println("Divison cannot be performed");
		}
	}

	private static int divideNumbers(int num1, int num2) {
		return num1 / num2;
	}
}
