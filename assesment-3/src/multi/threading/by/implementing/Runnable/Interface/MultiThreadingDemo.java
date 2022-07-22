package multi.threading.by.implementing.Runnable.Interface;

public class MultiThreadingDemo implements Runnable 
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
	   for(int i=0; i<4; i++)
	   {
		   System.out.println("demo");

			   try 
			   {
				Thread.sleep(1000);
			   } 
			   catch (InterruptedException e) 
			   {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	}
}
