package sessionFour;

import java.util.Comparator;

public class ASCIIComparator implements Comparator<SetDemo> {

	

	@Override
	public int compare(SetDemo o, SetDemo o1) {
		
		char ch =o1.getChar();
		int ascii = (int) ch;
		if((ascii>65 && ascii<90) && !(o1.getList().contains(o1.getChar())))
		{
			System.out.println("Ascii: "+ascii);
			//o1.getList().add(new SetDemo((char)(ascii+32)));
			
			return 0;
		}
		return 1;
	}
}
	