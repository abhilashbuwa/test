package sessionFive;

public class OddEvenThreads extends Thread {
	
	 static void print(int tid)
	{
		System.out.println("Thread "+tid+" Running");
	}

	public static void main(String args[])
	{
		Thread threads[]=new Thread[11];	
		for(int i=0;i<=threads.length;){
			EvenThread et=new EvenThread();
			et.setTid(i);
			threads[i]=new Thread(et);
			threads[i].start();			//start even threads
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			i+=2;						//move i to next even index
		}
		for(int i=1;i+1<=threads.length;){
			
				OddThread ot=new OddThread();
				ot.setTid(i);
				threads[i]=new Thread(ot);
				threads[i].start();		//start odd threads
				try {
					sleep(1000);	//sync among them
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				i+=2;   //move i to next odd index
		}
	}
}
