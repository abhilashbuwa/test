package sessionFive;

public class PrintThreads extends Thread {
	
	public static boolean startOdd;
	synchronized static void print(int tid)
	{
		System.out.println("Thread "+tid+" Running");
	}

	void notifyThread(){
		this.notifyAll();
	}
	public static void main(String args[])
	{
		PrintThreads pr=new PrintThreads();
		Thread threads[]=new Thread[11];	
		
		for(int i=0;i<threads.length;i++){
		if(i%2==0){
			EvenThread et=new EvenThread();
			et.setTid(i);
			threads[i]=new Thread(et);
			threads[i].setPriority(MAX_PRIORITY);
			threads[i].start();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(threads[i].isAlive())
			{
				System.out.println("doing nothing");
			}
			threads[i].notify();
			}
		else
			{
	
			OddThread ot=new OddThread();
			threads[i]=new Thread(ot);
			ot.setTid(i);
			synchronized(threads[i]){
			threads[i].setPriority(MIN_PRIORITY);
			threads[i].start();
			if(threads[i-1].isAlive())
			{
			try {
				threads[i].wait();
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
			}
		}	
	}
}
