package Strings;

public class ReverseEachWordInString 
{

	public static void main(String[] args) 
	{
		String name = "this is java";
        String Name[]=name.split(" ");
        char ch;
		for(int i=0; i<Name.length; i++)
		{
			String word=Name[i];
			String reword="";
			for(int j=0; j<word.length(); j++)
			{
				ch =word.charAt(j);
				reword=ch+reword;
			}
		System.out.print(reword+" ");
		}
	}
}
