package multi.threading.by.extending.thread.clasl;

public class MyThreadDemo1 
{

	public static void main(String[] args)
	{
		MyThreadDemo t = new MyThreadDemo();
		MyThreadDemo2 t1= new MyThreadDemo2();
		//t1.start();
		t1.run();
		//t.start();//But, in the case of start the main method will be executed first
		t.run();  //when we will give run() method it will automatically prints the thread class first then it will moves to the main thread.
		for(int i=0; i<4; i++)
		{
			System.out.println("Main Thread");
		}

	}

}
