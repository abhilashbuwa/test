package sessionFive;

import java.sql.*;
import java.util.Scanner;

public class StudentDetails {

	String name,stud_class,grade;
	static Connection con;
	
	static{
		MyDatabase.LoadDriver();
		con=MyDatabase.getConnection();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStud_class() {
		return stud_class;
	}
	public void setStud_class(String stud_class) {
		this.stud_class = stud_class;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		int n,ch;
		createTable(con);
		do{
			System.out.println("1.Enter Data\n2.Display\n3.Exit");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter number of record:");
				n=scan.nextInt();
				StudentDetails[] student=new StudentDetails[n];
				for(int i=0;i<n;i++)
				{
					student[i]=new StudentDetails();
					student[i].accept();
				}
					addToDatabase(student);
				break;
			case 2:
				display();
				break;
			default:
				System.out.println("Invalid choice!");
			}
			
		}while(ch!=3);
		
	}
	
	/*Method to insert records*/
	public static void addToDatabase(StudentDetails[] students)
	{	try{
			PreparedStatement insert=con.prepareStatement(CONSTANTS.insertQuery);
			for(StudentDetails std:students)
			{
				insert.setString(1, std.getName());
				insert.setString(2, std.getStud_class());
				insert.setString(3, std.getGrade());
				insert.addBatch();
			}
			int n[]=insert.executeBatch();
			System.out.println(n.length+" Record inserted!");
			} catch (SQLException e) {
				System.out.println(e.getMessage());}
			
	}
	
	/*Method to create a table*/
	public static void createTable(Connection con)
	{
		try {
			Statement stmt=con.createStatement();
			stmt.executeUpdate(CONSTANTS.createQuery);
			System.out.println("Table created");
		} catch (SQLException e) {
			System.out.println("Error while creating a table"+e.getMessage());
		}
	}
	
	/*Method to Accept the user data*/
	private void accept()
	{
		System.out.println("*****Enter Data*****");
		Scanner scan=new Scanner(System.in);
		System.out.println("Name:");
		setName(scan.next());
		System.out.println("Class:");
		setStud_class(scan.next());
		System.out.println("Grade:");
		setGrade(scan.next());
	}
	/*Load data from database*/
	static void display()
	{
		try{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(CONSTANTS.selectQuery);
		System.out.println("*****Current Database*****\nRoll_No\tName\tClass\tGrade");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		
		}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
