package multi.threading.by.extending.thread.clasl;

public class MyThreadDemo2 extends Thread
{
	public void run() 
	{
		for(int i=0; i<4; i++)
		{
			System.out.println("Demo2");
		}
	}
}
