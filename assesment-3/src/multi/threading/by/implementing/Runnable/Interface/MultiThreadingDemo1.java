package multi.threading.by.implementing.Runnable.Interface;

public class MultiThreadingDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MultiThreadingDemo fe = new MultiThreadingDemo();
		Thread t = new Thread(fe);//Using this thread we can create the target of the parent thread (or) otherwise we get error
		//t.start();
		t.start();
		MultiThreadingDemo2 fe2 = new MultiThreadingDemo2();
		Thread t1 = new Thread(fe2);
		t1.start();
		t1.join();
		for(int i=0; i<4; i++)
		{
			System.out.println("Main method");
		}

	}

}
