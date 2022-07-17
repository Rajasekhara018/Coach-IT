package realtime.example.on.oops;
import java.util.Scanner;
public class Changepin 
{
	static Scanner sc = new Scanner(System.in);
	long accnum=123456789012l;
	long phonenum=6281298823l;
	static String pin="1234";
	public void Setpin(String pin)
	{
		this.pin=pin;
	}
	public static String getpin()
	{
		return pin;
	}
	void options()
	{
		System.out.print("04 Change pin using BankAccount"+"\n"+"05 chnage pin using Phone number");
		int num=sc.nextInt();
		switch(num)
		{
			case 04:
			{
				System.out.print("Enter your account number:");
				long Accnum=sc.nextLong();
				if(accnum==Accnum)
				{
					System.out.print("Updated pin:");
					System.out.print(getpin());
				}
				else
				{
					System.out.print("Invalid Credentials");
				}
				break;
			}
			case 05:
			{
				System.out.print("Enter your mobile number:");
				long mnum=sc.nextLong();
				if(phonenum==mnum)
				{
					System.out.print("Updated pin:");
					System.out.print(getpin());
				}
				else
				{
					System.out.print("Invalid Credentials");
				}
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		Changepin c = new Changepin();
		System.out.print("Reset your pin:");
		c.Setpin(sc.next());
		c.options();
	}
}
