package java8.feauters;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamExample 
{
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product("HP Laptop",25000f));  
        productsList.add(new Product("Dell Laptop",30000f));  
        productsList.add(new Product("Lenevo Laptop",28000f));  
        productsList.add(new Product("Sony Laptop",28000f));  
        productsList.add(new Product("Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream().map(p->p.Price).collect(Collectors.toList());// filtering data   
        System.out.println(productPriceList2);  
    }  
}  
