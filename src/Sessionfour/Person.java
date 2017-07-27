package sessionFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

	String personName;
	
	Person(String personName)
	{
		this.personName=personName;
	}

	public static void main(String args[])
	{
		
		ArrayList<Person> namesList=new ArrayList<Person>();
		Scanner scan=new Scanner(System.in);
		namesList.add(new Person("Sujit"));
		namesList.add(new Person("Amit"));
		namesList.add(new Person("Sagar"));
		namesList.add(new Person("Saurabh"));
		namesList.add(new Person("Pratik"));
		System.out.println("Enter name of the person tobe searcherd");
		String name=scan.nextLine();
		scan.close();
		Person p=new Person(name);
		if(namesList.contains(p))		//check for equality
		{
			System.out.println("Person found in a ArrayList");
		}
		else
		{
			System.out.println("Could not find Person in ArrayList");
		}
	}
	 @Override
	    public boolean equals(Object object)
	    {
	        boolean isSame = false;
	        if (object != null && object instanceof Person)
	        {
	        	//System.out.println("in equals"+((Person) object).personName);
	            isSame = this.personName.equals(((Person) object).personName);
	        }

	        return isSame;
	    }

}
