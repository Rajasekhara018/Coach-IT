package java8.feauters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.*;

public class FilteringCollectionsByStreams 
{
	
	public static void main(String[] args)
	{
		List<Product>list = new ArrayList<Product>();
		list.add(new Product("Lenovo", 90000));
		list.add(new Product("Msi", 75000));
		list.add(new Product("Dell", 65000));
		
		long count=list.stream().filter(p-> p.Price > 50000).count();
		//System.out.print(count);  
	//Map<Float>list1 =list.stream().collect(Collectors.toMap(P ->P.Pname, ->P.Price));
	//list.stream().filter(p-> p.Price > 75000).collect(Collectors.toList()).forEach(product -> System.out.println(product.Price));	
	Double Totalprice = list.stream().collect(Collectors.summingDouble(Product ->Product.Price));
	//System.out.println(list1);
	//System.out.print(Totalprice);
	long count1=list.stream().filter(p-> p.Price > 75000).count();
	//System.out.print(count); 
	list.parallelStream().forEach(P ->System.out.println(P.Price));

	}

}
