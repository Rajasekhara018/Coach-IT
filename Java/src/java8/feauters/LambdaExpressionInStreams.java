package java8.feauters;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class LambdaExpressionInStreams
{

	public static void main(String[] args) 
	{
		List<Integer>list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		Stream str =list.stream();
		ArrayList<Integer>llist2 =new ArrayList<Integer>(list.stream().filter((i)->i=>2);

	}
	
}
