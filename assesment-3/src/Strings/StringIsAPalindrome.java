package Strings;

public class StringIsAPalindrome
{
	public static void main(String[] args)
	{
		{
			String name = "naran";
			String Name=name;
			String rname = "";
			char ch;
			for(int i=0; i<name.length(); i++)
			{
				ch=name.charAt(i);
				rname=ch+rname;
			}
			if(Name.equals(rname))
			{
			System.out.println("true");
			}
			else
			{
				System.out.print("false");
			}
		}
	}
}
