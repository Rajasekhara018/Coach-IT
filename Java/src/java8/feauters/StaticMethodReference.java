package java8.feauters;

public class StaticMethodReference
{
	public static void say1()
	{
		System.out.print("This is Badam Rajasekhara Reddy");
	}

	public static void main(String[] args) 
	{
		sayable sable = StaticMethodReference::say1;
		sable.say();

	}

}
