package Exceptions;

import java.util.Scanner;

public class customizedException 
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18)
		{
			throw new TooYoungException("u r not eligible");
		}
		else if(age>60)
		{
			throw new TooOldException("u r too late");
		}
		else
		{
			System.out.print("Your eligible for the marriage");
		}
	}

}
