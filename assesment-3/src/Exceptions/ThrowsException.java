package Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsException {
	private String a;
	public void meth1(String a)
	{
		this.a="raja";
	}
	public static void main(String[] args) throws IOException 
	{
		FileWriter se = new FileWriter("abc.txt");

		try
		{
			System.out.print(10/0);
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			se.close();
		}
	}

}
