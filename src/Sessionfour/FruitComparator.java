package sessionFour;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruits> {

	

	@Override
	public int compare(Fruits fruit_name1, Fruits fruit_name2) {
		// TODO Auto-generated method stub
		return fruit_name1.fruitName.compareTo(fruit_name2.fruitName);
	}

}
