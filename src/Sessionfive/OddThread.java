package sessionFive;

public class OddThread extends Thread {
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
		PrintThreads.print(getTID());
		
	}
}
