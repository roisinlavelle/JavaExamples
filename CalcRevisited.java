package com.qa.helloworld;

public class CalcRevisited {
	public static int num1 = 20;
	public static int num2 = 10;
	public static int num3;

	public static void main(String[] args) {
		divideNumbers();
		numberLessThan();

	}

	public static void divideNumbers() {
		System.out.println(num1 / num2);

	}

	public static void numberLessThan() {
		num3 = num1 / num2;
		if (num3 < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("The division cannot be performed");
		}
	}
}
