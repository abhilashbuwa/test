package sessionTwo;

class Employee
{
	String name,address;
	public Employee(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
}
class Account extends Employee {

	float salary;
	public Account (String name,String address,float salary){
		super(name,address);
		this.salary=salary;
	}
	void display()	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
	}
}
public class ConstructorChaining {

	public static void main(String args[])
	{
		Account accInfo=new Account("Sujit Ingale","Terra Tower",25000);
		accInfo.display();
	}
}
