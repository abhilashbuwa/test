package Abhi;

import java.util.Scanner;
public class MinMaxNum
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		print("Enter number of elements:");
		int n=input.nextInt();
		print("Enter "+n+" elements:");
		int[] numbers=new int [n];
		for(int i=0;i<n;i++)
			numbers[i]=input.nextInt();
		findMinMax(numbers);
	}
	
	private static void print(String text)
	{
		System.out.println(text);
	}
	private static void findMinMax(int  numbers[])
	{
		int smallest,largest;
		smallest=numbers[0];
		largest=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<smallest)
				smallest=numbers[i];
			if(numbers[i]>largest)
				largest=numbers[i];
		}
		print("Largest Number is: "+largest);
		print("Smallest Number is:" +smallest);
	}
}