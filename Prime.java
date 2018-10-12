package com.deloitte;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n = scan.nextInt();
		if (n==1)
			System.out.println("Neither prime nor composite");
		else if(n<=3)
			System.out.println("Prime");
		
		else {
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				System.out.println("Not prime");
				break;
			}
			else if(i==n/2)
				System.out.println("Prime");
				
			
		}
		
		}
	}

}
