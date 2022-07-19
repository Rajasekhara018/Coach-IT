package java8.feauters;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class LambdaExpressionInStreams
{
	int num;

	public static void main(String[] args) 
	{
		List<Integer>list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		Stream str =list.stream();
		ArrayList<Integer>list2 =(ArrayList<Integer>) list.stream().filter(i->i >2).collect(Collectors.toList());

	}
	
}
