package com.deloitte;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,f=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n = scan.nextInt();
		for (int i = 1; i <=n; i++) {
			f*=i;
			
		}
		System.out.println("Factorial = "+f);

	}

}
