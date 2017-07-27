package sessionThree;
import java.util.Scanner;

class NotEligibleException extends Exception
{
	/**
	 * Exception will be thrown if user is not eligible for marriage
	 */
	private static final long serialVersionUID = 1L;

	NotEligibleException(String message)
	{
		super(message);
	}
}
public class CustomException {

	Scanner scan;
	String name,gender;
	int age;
	void accept()
	{
		scan =new Scanner(System.in);
		System.out.println("Enter your name:");
		name=scan.next();
		System.out.println("Enter Age:");
		age=scan.nextInt();
		System.out.println("Enter Gender:");
		gender=scan.next().toLowerCase();
	}
	int getAge()
	{
		return age;
	}
	String getGender()
	{
		return gender;
	}
	private void isEligible(int age,String gender) throws NotEligibleException
	{
		if((age>21 && gender.equals("male")) || (age>18 && gender.equals("female")))
		{
			System.out.println("Eligible for marriage!");
		}
		else
		{
		throw new NotEligibleException("Not Eligible");
		}
	}
	public static void main(String args[])
	{
		CustomException user_data=new CustomException();
		user_data.accept();
		try
		{
			user_data.isEligible(user_data.getAge(),user_data.getGender());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
