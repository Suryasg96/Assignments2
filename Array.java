package com.deloitte;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		System.out.println("Enter the no of elements: ");
		n = scan.nextInt();
		int [] no= new int[100];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			no[i] = scan.nextInt();
		}

	}
}
