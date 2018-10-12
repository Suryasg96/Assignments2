package com.deloitte;

import java.util.Scanner;

public class NumberUtil {
	public static int Product(int a, int b) {

		return a * b;
	}

	public static double SquareRoot(double a) {

		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		int ch, a, b, c;
		double d;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Product");
		System.out.println("2. Square Root");
		System.out.println("3. Exiting");
		ch = scan.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the nos: ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = Product(a, b);
			System.out.println("Product is " + c);
			break;
		case 2:
			System.out.println("Enter the nos ");
			a = scan.nextInt();
			d = SquareRoot(a);
			System.out.println("Product is " + d);
			break;
		case 3:
			System.out.println("Thank You.. Exiting...");
			System.exit(0);
			break;
		default:
			System.out.println("Enter nos 1 to 3 only");
			break;
		}

	}

}
