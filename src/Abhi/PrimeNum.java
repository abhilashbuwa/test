package Abhi;
class PrimeNum
{
public static void main(String args[])
{
	boolean flag=false;
for(int i=100;i>1;i--)
	{
	for(int j=2;j<=i-1;j++)
	{
	   
	if(i%j==0)
	{	flag=false;
		break;
	    
	}
	else
	    flag=true;
	    
	}
	if(flag){
		System.out.println(i);}
	}
}

}