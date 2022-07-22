package multi.threading.by.extending.thread.clasl;

public class MultiThreadDemo extends Thread
{
   public void run()
    {
	   for(int i=0; i<5; i++)
	   {
		   System.out.println(Thread.currentThread().getName()+":"+"demo");
	   }
	
    }

}
