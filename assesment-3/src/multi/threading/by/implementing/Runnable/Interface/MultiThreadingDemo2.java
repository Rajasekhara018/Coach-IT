package multi.threading.by.implementing.Runnable.Interface;

public class MultiThreadingDemo2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<4; i++)
		{
			System.out.print(Thread.currentThread().getName()+":"+"Demo2");
		}
	}

}
