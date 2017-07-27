package sessionFive;

public class ThreadSync extends Thread {

	synchronized static void print(int tid)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+tid+" ended!");
	}
	
}
