package assignment3;

import java.util.Scanner;

public class ReverseWordAndFirstLetterCapital
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		String []Name =name.split(" ");
		for(int i=0; i<Name.length; i++)
		{
			String word = Name[i];
			String rword=" ";
			for(int j=0; j<word.length(); j++)
			{
				char ch=word.charAt(j);
				if(j==word.length()-1)
				{
					ch=Character.toUpperCase(word.charAt(j));//Special method implemented for converting the cases.
				}
				rword = ch+rword;
			}
			System.out.print(rword);
		}
	}
}
