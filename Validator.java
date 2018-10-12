package com.deloitte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	Pattern pattern,pattern1;
	Matcher matcher,matcher1;
	String regex = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	String regex1="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#$%^&*]).{8,}$";

	public Validator() {
		pattern = Pattern.compile(regex);
		pattern1 = Pattern.compile(regex1);
	}

	private boolean validate(String input) {
		matcher = pattern.matcher(input);
		return matcher.matches();
	}
	private boolean pvalidate(String input) {
		matcher1 = pattern1.matcher(input);
		return matcher1.matches();
	}

	
	public static void main(String[] args) {
		Validator nv = new Validator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID");
		String input = scan.nextLine();
		boolean valid = nv.validate(input);

		if (valid) {
			System.out.println("Enter Password");
			String password = scan.nextLine();
			boolean pvalid = nv.pvalidate(password);
			if(pvalid) 
				System.out.println("Valid username and password");
				else {
					
					System.out.println("Valid username");
				}	
				
			}
			else
				System.out.println("Invalid username and password");
		}
		
	}


