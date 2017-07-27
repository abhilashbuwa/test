
package Abhi;

import java.util.Scanner;
class ReverseString
{

public static void main(String args[])
{
    String data;
    String ch="Y";
	Scanner input=new Scanner(System.in);
	do
	{
	print("Enter the String:");
	data=input.nextLine();
	print("Reversed String is: "+reverse(data));
	print("Do you want to continue? [y/n]:");
	ch=input.nextLine();
	}while(!(ch.equalsIgnoreCase("n")));

}

private static String reverse(String data)
{
if(data.length()>0)
{
	String reversedData="";
	String formatData=data.replaceAll("\\s","");
	for(int i=formatData.length()-1;i>=0;i--)
		reversedData=reversedData + formatData.charAt(i);
	return (reversedData);
}
else
	return "Invalid String";
}

private static void print(String text)
	{
		System.out.println(text);
	}
}