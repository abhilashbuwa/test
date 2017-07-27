package sessionFour;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String args[])
	{
		HashMap<Integer,String> student=new HashMap<Integer,String>();
		student.put(1, "Sujit");		
		student.put(2, "Anil");
		student.put(3, "Akshada");
		student.put(4, "Mahima");
		student.put(5, "Wadiraj");
		student.put(6, "Sagar");
		student.put(7, "Rajat");
		student.put(8, "Amit");
		student.put(9, "Saurabh");
		student.put(10, "Divya");
		display(student,5,8);
		
		}
	private static void display(HashMap<Integer,String> student,int start,int end)
	{
		Iterator it = student.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Integer,String> pair = (Map.Entry)it.next();
	        if(pair.getKey().intValue()>=5 && pair.getKey().intValue()<=8){
	        	
	        	System.out.println(pair.getKey() + " = " + pair.getValue());  //print if roll number is between 5-8
	        
	        }
	    }	
	}
}
