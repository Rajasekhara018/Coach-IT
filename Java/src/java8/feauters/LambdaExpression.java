package java8.feauters;

import java.util.Scanner;

public class LambdaExpression 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		Student sd =(name) ->
		{
			System.out.println("Name:"+name);
			System.out.print("Enter your Native place:");
			return sc.next(); 
		};
		System.out.print("Native Place is:"+sd.Student1(sc.next()));
	}

}
