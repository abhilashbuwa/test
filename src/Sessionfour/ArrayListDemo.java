package sessionFour;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int roll;
		String name;
		StudentInfo student;
		ArrayList<StudentInfo> studentList=new ArrayList<StudentInfo>();
		System.out.println("Enter number of students:");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Roll NO:");
			roll=scan.nextInt();
			System.out.println("Name:");
			name=scan.next().toLowerCase();
			studentList.add(new StudentInfo(roll,name));
		}
		scan.close();
		System.out.println("Data saved");
		Iterator<StudentInfo> it=studentList.iterator(); //initialize the iterator
		System.out.println("Filtered Data");
		while(it.hasNext())	{
			student=it.next();					//get the object pointed by iterator
			if(student.name.matches("s.*")){   //if name starts with 'S' then remove that item
				it.remove();
			}
			else{
				
				System.out.println(student);
			}
				
		}
		
	}
}

class StudentInfo
{
	int roll;
	String name;
	public StudentInfo(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + "]";
	}
	
	
}
