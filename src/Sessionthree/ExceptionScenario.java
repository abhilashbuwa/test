package sessionThree;

import java.util.Scanner;

class InvalidTransactionException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidTransactionException(String message)
	{
		super(message);
	}
}

class Bank
{
	static float balance=10000;
	void withdraw(float amount) throws InvalidTransactionException
	{
		if(balance >500 && (balance-amount)>=500)
		{
			balance-=amount;
			System.out.println("Transaction Successful\nNew balance: "+balance);
		}
		else
		{
			throw new InvalidTransactionException("Not enough balance!");
		}
		
		
	}
	
	boolean isValid(String user_name,int password)
	{
		try{
		if(!user_name.equals(null)&& (password<9999)){
			System.out.println("User Verified!");
			return true;
		}
		else
		{
			System.out.println("Wrong Credentials!");
			return false;
		}
		}catch(NullPointerException e)
		{
			System.out.println("Please Enter  Username.");
		}
		return false;
			
	}
	float getBalance()
	{
		return balance;
	}
}
public class ExceptionScenario {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String user_name;
		float amount;
		int password;
		while(true){
		Bank account=new Bank();
		System.out.println("Enter username:");
		user_name=scan.next();
		System.out.println("Enter PIN:");
		password=scan.nextInt();
		if(account.isValid(user_name,password))
		{
			System.out.println("Enter ammount tobe withdrawn:");
			amount=scan.nextFloat();
			try{
			account.withdraw(amount);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			finally{
				System.out.println("\n*****New Transaction*****");
			}
		}
		}
		
		
	}
	
}
