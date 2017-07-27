package sessionFive;

public class ThreadTwo extends Thread {

	@Override
	public void run() {
		ThreadSync.print(2);
		super.run();
	}

}
