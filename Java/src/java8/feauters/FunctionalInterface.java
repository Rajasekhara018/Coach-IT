package java8.feauters;

public class FunctionalInterface implements sayable
{
	@Override
	public void say()
	{
		System.out.print("Raja");
		
	}

	public static void main(String[] args) 
	{
		FunctionalInterface fi = new FunctionalInterface();
		fi.say();

	}



}
