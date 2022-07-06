package Exceptions;

public class EmptyCatchBLock 
{

	public static void main(String[] args) 
	{
		int i=10;
		int j=0;
		int k=2;
		int l=0;
		System.out.println(i);
		try
		{
		System.out.println(i/j);
		}
		catch(ArithmeticException ae)
		{
			//ae.getMessage();
			//ae.toString();
			//ae.printStackTrace();
		}
		System.out.println(k);
	}

}
