package sessionFive;

public class ThreadOne extends Thread {

	@Override
	public void run() {
		ThreadSync.print(1);
		super.run();
	}

	
}
