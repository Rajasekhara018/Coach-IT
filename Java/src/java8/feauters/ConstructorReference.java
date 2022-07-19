package java8.feauters;

public class ConstructorReference 
{
	ConstructorReference(	String msg)
	{
		System.out.print(msg);
	}
	public static void main(String[] args)
	{
		Messageable sable = ConstructorReference::new;
		sable.getmessage("Raja");

	}

}
