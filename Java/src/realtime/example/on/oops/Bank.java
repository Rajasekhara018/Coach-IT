package realtime.example.on.oops;
import java.util.Scanner;
public class Bank extends Changepin implements balance, withdrawel
{
	long Balance = sc.nextLong();
	static Scanner sc = new Scanner(System.in);
	@Override
	public void credit(String balance)
	{
		
		
	}

	@Override
	public void debit(String balance) 
	{
	
		
	}
	void options()
	{
		System.out.print("01 Balance"+"\n"+"02 With drawel"+"\n"+"03 change pin"+"\n"+"04 Update Aadhar"+"\n"+"05 credit amount");
		int sopt=sc.nextInt();
		switch(sopt)
		{
		case 01:
			System.out.print(Balance);
			break;
		case 02:
			
		}
		
	}
	public static void main(String[] args) 
	{
		

	}

}
