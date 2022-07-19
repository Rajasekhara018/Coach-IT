package strings;

import java.util.Scanner;

public class AlternativeLettersCapitalAfterTheReverseOfString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		String[]Name =name.split(" ");
		String RName="";
		String Rname="";
		System.out.println("Reverse of Name:");
		for(int i=0; i<Name.length; i++)
		{
			String word=Name[i];
			RName=" ";
			for(int j=0; j<word.length(); j++)
			{
				char ch = word.charAt(j);
				RName=ch+RName;
			}
			Rname=Rname+RName;
			System.out.print(RName+" ");
		}
		System.out.print("\nRname:"+Rname);
		    String[] Cname=Rname.split(" ");
		    char ch=' ';
		    String Cname1="";
		    String Cname2="";
		    System.out.print("\nEvery second letter should be capital in the name:");
		    for(int i=0; i<Cname.length;i++)
		    {
		    	String CWord=Cname[i];
			   for(int k=0; k<CWord.length(); k++)
			    {
				   if(k%2==1)
				ch=Character.toUpperCase(CWord.charAt(k));
				   else
				   {
				ch=Character.toLowerCase(CWord.charAt(k));
				   }
				Cname1=Cname1+ch;
			    }
			   Cname2=Cname2+Cname1+" ";
			  
		    }
			 System.out.println(Cname2+" ");
	}
}
