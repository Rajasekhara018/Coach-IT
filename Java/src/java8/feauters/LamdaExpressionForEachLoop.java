package java8.feauters;
import java.util.*;
public class LamdaExpressionForEachLoop
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Raja");
		list.add("Shekar");
		list.forEach((num)->System.out.println(num)); 

	}

}
