package sessionFour;

import java.util.ArrayList;
import java.util.Collections;

public class Fruits {
	 
	String fruitName;
	public Fruits(String fruitName)
	{
		this.fruitName=fruitName;
	}

	public static void main(String args[])
	{
		ArrayList<Fruits> fruitList=new ArrayList<Fruits>();
		fruitList.add(new Fruits("Kiwi"));
		fruitList.add(new Fruits("Mango"));
		fruitList.add(new Fruits("Apple"));
		fruitList.add(new Fruits("Grapes"));
		fruitList.add(new Fruits("Banana"));
		fruitList.add(new Fruits("Orange"));
		fruitList.add(new Fruits("Pomogranate"));
		fruitList.add(new Fruits("Guava"));
		fruitList.add(new Fruits("Watermelon"));
		Collections.sort(fruitList,new FruitComparator());  //sort the list items in ascending order
		for(Fruits name:fruitList)
		{
			System.out.println(name.fruitName);
		}
		
	}
}
