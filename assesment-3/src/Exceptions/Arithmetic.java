package Exceptions;

public class Arithmetic {
	
	
	
	public static void main(String[] args) {
		try
		{
			//int a=100/0;
			String a = "fgfh";
		}
		//catch(ArithmeticException a)
		catch(NullPointerException a)
		{
			System.out.println(((CharSequence) a).length());
			a.printStackTrace();
		}

		System.out.println("hello");

	}

}
