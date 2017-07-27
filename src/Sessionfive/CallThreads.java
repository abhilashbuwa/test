package sessionFive;

public class CallThreads {
	public static void main(String args[])
	{
		new ThreadOne().start();
		new ThreadTwo().start();
	}

}
