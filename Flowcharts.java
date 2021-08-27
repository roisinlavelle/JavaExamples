package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {
		method1(20, 30, true);
		methodOne(50);
		
	}

	public static void method1(int num1, int num2, boolean boolie) {
		if (boolie) {
			int result = num1 + num2;
			System.out.println(result);
			
		} else {
			int result = num1 * num2;
			System.out.println(result);
		}
		
	}
	public static void methodOne(int A) {
		if (A > 2000) {
            System.out.println("A");
            if (A > 6000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                if (A > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if (A > 100) {
                System.out.println("3");
                if (A > 600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if (A > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }
}
