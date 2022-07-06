package Strings;

public class ReverseOfAString {

	public static void main(String[] args) 
	{
		String name = "hello all";
		String rname = "";
		char ch;
		for(int i=0; i<name.length(); i++)
		{
			ch=name.charAt(i);
			rname=ch+rname;
			              
		}
		System.out.println(rname);
	}
}
