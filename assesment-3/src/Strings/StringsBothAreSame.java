package Strings;

public class StringsBothAreSame
{
	public static void main(String[] args)
	{
	String s1="keep";
	String s2="peek";
	int c=0;
	for(int i=0; i<s1.length(); i++)
	{
	   for(int j=0; j<s2.length(); j++)
	   {
	      if((s1.charAt(i))==(s2.charAt(j)))
	       {
	       c++;
	       break;
	       
	       }
	    }
	}
	if(c==s1.length() || c==s2.length())
	{
	System.out.print("true");
	}
	else
	   {
	   System.out.print("false");
	   }
   }
}

