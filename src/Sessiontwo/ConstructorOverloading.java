package sessionTwo;

class MathOperation
{
	int num1,num2;
	float num3,num4;
	public MathOperation(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("First Constructorr Invoked!");
	}
	public MathOperation(float num1,float num2)
	{
		num3=num1;
		num4=num2;
		System.out.println("Second Constructorr Invoked!");
	}
	void getIntData()
	{
		System.out.println(num1+" + "+num2+" :"+(num1+num2));
	}
	void getFloatData(){
		System.out.println(num3+" + "+num4+" :"+ (num3+num4));
	}
	
}
public class ConstructorOverloading {
	public static void main(String args[])
	{
		MathOperation constructorOne=new MathOperation(1,8);
		constructorOne.getIntData();
		MathOperation constructorTwo=new MathOperation(2.5f,1.55f);
		constructorTwo.getFloatData();
	}
}
