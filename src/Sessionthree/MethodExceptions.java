package sessionThree;

public class MethodExceptions {

	private static void A(String name)
	{
		try{
		String message="Hello ";
		String data=message.concat(name);
		System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception Throwsn Thrown From A");
			throw e;
		}
	}
	private static void b()
	{
		try{
			A(null);
		}catch(Exception e)
		{
			System.out.println("NullPointerException");
		}
	}
	public static void main(String args[])
	{
		b();
	}
}
