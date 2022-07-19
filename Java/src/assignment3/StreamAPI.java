package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI 
{

	public static void main(String[] args) 
	{
		List<Person>list1 = new ArrayList<Person>();
		list1.add(new Person("Raja", 21));
		list1.add(new Person("Akshata", 17));
		list1.add(new Person("Rama", 15));
		list1.add(new Person("Mounika", 23));
		list1.add(new Person("chandu", 11));
		list1.add(new Person("Bharat", 25));
		list1.add(new Person("sanjeev", 9));
		
		//list1.stream().filter( P -> P.age>18).collect(Collectors.toList()).forEach( P -> System.out.print(P.name+" "));
		list1.stream().filter( P -> P.age<18).collect(Collectors.toList()).forEach( P -> System.out.print(P.name+" "));
	}

}
