package exception.handlings;

import java.util.Scanner;

public class GmailApplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username="Badam@123";
		String password="Raja@143";
		System.out.print("Enter username:");
		String username1=sc.next();
		System.out.print("Enter password:");
		String password1=sc.next();
		if(username.equals(username1) && password.equals(password1))
		{
			System.out.print("Welcome");
		}
		else
		{
			throw  new InvalidLogin("InvalidLoginException");
		}
	}

}
