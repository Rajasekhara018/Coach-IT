package Strings;

public class StringsBothAreSame
{
	public static void main(String[] args)
	{
	String s1="keep";
	String s2="pe";
	int count=0;
	for(int i=0; i<s1.length(); i++)
	{
	   for(int j=0; j<s2.length(); j++)
	   {
	      if((s1.charAt(i))==(s2.charAt(j)))
	       {
	       count++;
	       break;       
	       }
	    }
	}
	//System.out.print(count);
	if(count==s1.length() || count==s2.length())
	{
	System.out.print(count+"true");
	}
	else
	   {
	   System.out.print("false");
	  }
   }
}

