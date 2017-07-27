package sessionFive;

public class EvenThread extends Thread{

	int tid;
	void setTid(int tid)
	{
		this.tid=tid;
	}
	int getTID()
	{
		return tid;
	}
	@Override
	public void run()
	{
		OddEvenThreads.print(getTID());			
		
	}
	
}
