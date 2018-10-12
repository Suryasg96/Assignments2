package com.deloitte;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int a,b, ch;
	System.out.println(" Enter the nos:");
	a= scan.nextInt();
	b= scan.nextInt();
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("5. Exit");
	ch= scan.nextInt();
	switch (ch) {
	case 1: System.out.println("Sum of "+a+" and "+b+ " is "+(a+b));
		
		break;
	case 2: System.out.println("Difference of "+a+" and "+b+ " is "+(a-b));
	
	break;
	case 3: System.out.println("Product of "+a+" and "+b+ " is "+(a*b));
	
	break;
	case 4: System.out.println("Quotient of "+a+" and "+b+ " is "+(a/b));
	
	break;
	case 5: System.out.println("Thank You.. Exiting...");
		System.exit(0);
	break;
	default:System.out.println("Enter nos from 1 to5 only");
		break;
	}
	
	
	}
	
}
