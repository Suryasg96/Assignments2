package com.deloitte;

public class Square {

	public static void main(String[] args) {
		int square=0,n=1;
		while(square<900)
		{
			if(isPrime(n))
			{
				square=n*n;
				if(square<900)
				System.out.println(square);
			}
			n++;
		}
	}

	private static boolean isPrime(int n) {

		if (n == 1)
			return false;
		else if (n <= 3)
			return true;

		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;

				} else if (i == n / 2)
					return true;

			}

		}

		return true;
	}
}
