package multi.threading.by.extending.thread.clasl;

public class MultiThreadDemoMain 
{

	public static void main(String[] args) 
	{
		MultiThreadDemo t = new MultiThreadDemo();
		t.setName("thread1");
		t.setPriority(1);
		t.start();
		MultiThreadDemo1 t1 = new MultiThreadDemo1();
		t1.setName("thread2");
		t1.setPriority(10);
		t1.start();
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+"main method");
		}
	}
}
