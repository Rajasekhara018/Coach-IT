package java8.feauters;
import java.util.*;
public class ForEachDemo 
{
	public void each(String name)
	{
		System.out.print(name);
	}

	public static void main(String[] args)
	{
		List<String>list = new ArrayList<String>();
		list.add("Raja");
		list.add("Shekar");
		
		list.stream().forEach( Name -> System.out.println(list));

	}

}
