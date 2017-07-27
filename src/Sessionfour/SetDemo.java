package sessionFour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class SetDemo {

	static String input="Dissddiscisoddvosedorrsd";	
	char ch;//input data
	static ArrayList<SetDemo> output=null;
	
	SetDemo(char c)
	{
		ch=c;
	}
	
	ArrayList<SetDemo> getList()
	{
		return output;
	}
	public static void main(String args[])
	{
		
		output=new ArrayList<SetDemo>();
		for(int i=0;i<input.length();i++)
		{
		output.add(new SetDemo(input.charAt(i)));
		
		}
	/*	Map<String, ArrayList<SetDemo>> map1 = new HashMap<String, ArrayList<SetDemo>>();
		
		map1.put("key1",output);
	       Display content using Iterator
	     
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }*/
		Collections.sort(output,new ASCIIComparator());

	}

	char getChar()
	{
		return ch;
	}
	 void setChar(char chr)
	{
			ch=chr;
	}
	static void setData()
	{
		
	}


}
