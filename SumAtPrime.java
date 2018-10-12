package com.deloitte;

import java.util.Scanner;

public class SumAtPrime {

	public static void main(String[] args) {
		int n;
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n = scan.nextInt();
		int sum=0;
		System.out.println("Enter the nos: ");
		int []no= new int[n];
		for(int i=0;i<n;i++)
			no[i] = scan.nextInt();
		for (int i = 1; i < n; i++) {
			if(isPrime(i))
				sum+=no[i];
	}
		System.out.println("Sum ="+sum);
	}

	private static boolean isPrime(int n) {
		
		if (n==1)
			return false;
		else if(n<=3)
			return true;
		
		else {
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				return false;
				
			}
			else if(i==n/2)
				return true;
				
			
		}
		
		}
				
			
		
		
		
		return true;
	}

}
