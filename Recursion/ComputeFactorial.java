package Recursion;

import java.util.Scanner;

public class ComputeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer");
		int n = input.nextInt();
		
		System.out.println("Factorial of n " + n + " is " + factorial(n));

	}

	private static long factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else
			return n * factorial(n-1);
		
	}

}
