package sessionTwo;

class Operations {
	
	int getValue(int num1,int num2){
		return (num1+num2);
	}
	String getValue(String string_one,String string_two ){
		return string_one.concat(string_two);
	}
}
public class MethodOverloading extends Operations
{
	public static void main(String args[]){
	MethodOverloading operations=new MethodOverloading();
	System.out.println("Addition is: "+operations.getValue(10,20)); 
	System.out.println("Concatenated String is: "+operations.getValue("John", null));
	}
}
