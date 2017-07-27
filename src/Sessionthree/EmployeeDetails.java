package sessionThree;
import java.io.*;
import java.util.List;
import java.util.Scanner;
public class EmployeeDetails implements Serializable  {
	
	/**
	 * Write/Read objects to/from file 
	 */
	public static final String FILE_PATH="C:\\Users\\sujiti\\Desktop\\employee.txt";
	private static final long serialVersionUID = -7177435321228421542L;
	static int count;
	
	String id,name;
	
	public void setID(String id)
	{
		this.id=id;
	}
	public String getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	String street;
	String country;
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+getID()+"\nName: "+getName()+"\nCity: "+getStreet()+"\nCountry: "+getCountry();

	}
	void accept()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ID:");
		id=scan.next();
		System.out.println("Name:");
		name=scan.next();
		System.out.println("City:");
		street=scan.next();
		System.out.println("State:");
		country=scan.next();

		
	}
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Current Database: ");
		FileAction.readAll(FILE_PATH);
		
		while(true){
			System.out.println("\n1.Enter Data\n2.Display\n3Exit");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				EmployeeDetails emp=new EmployeeDetails();
				emp.accept();
				FileAction.serialize(emp, FILE_PATH);
				System.out.println("File writing completed");
				break;
			case 2:
				
				FileAction.readAll(FILE_PATH);
				break;
			default:
				System.out.println("Invalid Input!");
			}
		}
	}
}
