package java8.feauters;

public class InstanceMehodReferemce
{
	public  void say1()
	{
		System.out.print("This is Badam Rajasekhara Reddy");
	}

	public static void main(String[] args) 
	{
		sayable sable = new InstanceMehodReferemce()::say1;
		sable.say();

	}

}

