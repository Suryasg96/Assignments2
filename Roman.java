package com.deloitte;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		int n=0;
		String r="";
		System.out.println("Enter the no:");
		Scanner scan= new Scanner(System.in);
		n= scan.nextInt();
		if(n<1||n>3000)
			System.out.println("Invalid input");
		else {
		while(n>0) {
			if(n>=1000)
			{r+="M";
			n-=1000;
			}
			else if(n>=900)
			{
				r+="CM";
				n-=900;
				
			}
			else if(n>=500)
			{
				r+="D";
				n-=500;
								
			}
			else if(n>=400)
			{
				r+="CD";
				n-=400;
			}
			else if(n>=100)
			{
				r+="C";
				n-=100;
				
			}
			else if(n>=90)
			{
				r+="XC";
				n-=90;
			}
			else if(n>=50)
			{
				r+="L";
				n-=50;
								
			}
			else if(n>=40)
			{
				r+="XL";
				n-=40;
			}
			else if(n>=10)
			{
				r+="X";
				n-=10;
				
			}
			else if(n>=9)
			{r+="IX";
			n-=9;
							
			}
			else if(n>=5)
			{
				r+="V";
				n-=5;
			}
			else if(n>=4)
			{
				r+="IV";
				n-=4;
			}
			else
			{
				r+="I";
				n-=1;
			}
			
			
		}
		System.out.println(r);
		
		
	}

}
}
