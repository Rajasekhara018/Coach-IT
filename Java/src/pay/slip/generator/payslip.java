package pay.slip.generator;

import java.util.ArrayList;
import java.util.Scanner;

public class payslip 
{
	String [] empname1= {"Chitikena Akshata","Kotagiri Ramadevi","Badam Rajasekhara Reddy",
			"Kummari Sanjeev","Kesepagolu Venkatesh","Gumma Naveen","Grandhi Lavanya","Madduri Vineela",
			"Kamisetti Mounika","Bora Chandrasekhar","Bharat Kumar","mohamed Ameer"};
	String [] PanNumber1= {"DXFPB1301E","DXFPB1302E","DXFPB1303E","DXFPB1304E","DXFPB1305E","DXFPB1306E",
			"DXFPB1307E","DXFPB1308E","DXFPB1310E","DXFPB1311E","DXFPB1312E"};
	String [] Id1= {"t016","t017","t018","t019","t020","t021","t022","t023","t024","t025","t026","t027"};
	void details()
    {
	ArrayList<String>empname = new ArrayList<String>();
	empname.add("Chitikena Akshata");
	empname.add("Kotagiri Ramadevi");
	empname.add("Badam Rajasekhara Reddy");
	empname.add("Kummari Sanjeev");
	empname.add("Kesepagolu Venkatesh");
	empname.add("Gumma Naveen");
	empname.add("Grandhi Lavanya");
	empname.add("Madduri Vineela");
	empname.add("Kamisetti Mounika");
	empname.add("Bora Chandrasekhar");
	empname.add("Bharat Kumar");
	empname.add("mohamed Ameer");
    //System.out.print(empname);
	ArrayList<String>PanNumber = new ArrayList<String>();
	PanNumber.add("DXFPB1301E");
	PanNumber.add("DXFPB1302E");
	PanNumber.add("DXFPB1303E");
	PanNumber.add("DXFPB1304E");
	PanNumber.add("DXFPB1305E");
	PanNumber.add("DXFPB1306E");
	PanNumber.add("DXFPB1307E");
	PanNumber.add("DXFPB1308E");
	PanNumber.add("DXFPB1309E");
	PanNumber.add("DXFPB1310E");
	PanNumber.add("DXFPB1311E");
	PanNumber.add("DXFPB1312E");
	ArrayList<String>Id = new ArrayList<String>();
	Id.add("t016");
	Id.add("t017");
	Id.add("t018");
	Id.add("t019");
	Id.add("t020");
	Id.add("t021");
	Id.add("t022");
	Id.add("t023");
	Id.add("t024");
	Id.add("t025");
	Id.add("t026");
	Id.add("t027");
    }
	    static Scanner s = new Scanner(System.in); 
		int Std_Dec=4167;
		int Tele=2000;
		int Education=200;
		int Books_Perodicals =1250;
		int PF=2700;
		int PT=200;
		int month=12;
		void options()
		{
			System.out.println("Enter Employee name:");
			String empName= s.nextLine();
			System.out.print("Enter EmployeeID: ");
			String ID=s.nextLine();
			System.out.println("Enter your pan number:");
			String pan=s.nextLine();
			System.out.println("Enter CTC:");
			long CTC=s.nextLong();
			CTC= CTC/month;
			long Basic= (long)(CTC*0.45);
			long HRA=(long)(Basic*0.45);
			long Net_Pay= CTC-PF-PT;
			long SpecialAll= CTC-Basic-HRA-Std_Dec-Tele-Education-Books_Perodicals;
			System.out.print("01 Print Payment slip"+"\n"+"02 Print Employ details and payment slip");
			int num=s.nextInt();
			switch(num)
			{
			  case 01:
			  {
				if(empName.equals(empname) && ID.equals(Id) && pan.equals(PanNumber)) 
				{
				System.out.println(
						"\nBasic: "+Basic+
						"\nHRA: "+HRA+
						"\nSts Deduction (Medical and Conveyance): "+Std_Dec+
						"\nTelephone and Communication:"+Tele+
						"\nEducational Allownace:"+Education+
						"\nBooks & periodicals:"+Books_Perodicals+
						"\nSpecial Allowance:"+SpecialAll+
						"\nPF:"+PF+
						"\nPT:"+PT+
						"\nCTC/MONTH:"+CTC +
						"\nNetPay:"+Net_Pay
						);
				}
				else
				{
					System.out.println("Invalid credentials");
					System.out.println("Please enter your details again");
					options();
				}
				break;
			  }
			  case 02:
			  {
				if(empName.equals(empname)&& ID.equals(Id) && pan.equals(PanNumber))
				{
					System.out.println(
							"\nEmployee Name:"+ empName+
							"\nEmployee ID: "+ID+
							"\nPan No"+pan+"Basic: "+Basic+
							"\nHRA: "+HRA+
							"\nSts Deduction (Medical and Conveyance):"+Std_Dec+
							"\nTelephone and Communication:"+Tele+
							"\nEducational Allownace:"+Education+
							"\nBooks & periodicals:"+Books_Perodicals+
							"\nSpecial Allowance:"+SpecialAll+
							"\nPF:"+PF+"\nPT:"+PT+
							"\nCTC/MONTH:"+CTC +
							"\nNetPay:"+Net_Pay);
				}
				else
				{
					System.out.println("Invalid credentials");
					System.out.println("Please enter your details again");
					options();
				}
				break;
			  }
		   }
		}
		public static void main(String[] args) 
		{
		System.out.println("\n **Welcome To** \n Toucan Payments (India) Pvt.Ltd. ");
		payslip v = new payslip();
		v.options();
        }
}
