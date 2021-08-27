package com.qa.helloworld;

public class ResultsExample {

	public static int physics = 100;
	public static int chemistry = 100;
	public static int biology = 100;
	public static int total = physics + chemistry + biology;
	public static int percentage;

	public static void main(String[] args) {
		addSubjects();
		percentageSubjects();

	}

	public static void addSubjects() {
		System.out.println("Your result for physics is " + physics);
		System.out.println("Your result for chemistry is " + chemistry);
		System.out.println("Your result for biology is " + biology);
		System.out.println("Your total result is " + total);
	}

	public static void percentageSubjects() {
		percentage = total * 100 / 450;
		System.out.println("Your percentage result is " + percentage);
	}
}