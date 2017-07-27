package sessionTwo;

import java.util.Scanner;
abstract class Address
{
	abstract String getAddress();
}
class World extends Address
{
	String getAddress(){
		return "S.B.Road";
	}
}
class Globus extends Address
{
	String getAddress(){
		return "Baner";
	}
}
class TerraTower extends Address
{
	String getAddress(){
		return "Baner Highway";
	}
}
class NextGen extends Address
{
	String getAddress(){
		return "Baner Road";
	}
}

class PolymorphismDemo
{
static enum offices{WORLD,NEXTGEN,GLOBUS,TERRATOWER};
public static void main(String args[])
{
World world=new World();
Globus globus=new Globus();
TerraTower terraTower=new TerraTower();
NextGen nextGen=new NextGen();

Scanner scan=new Scanner(System.in);
System.out.println("Enter Bitwise Office name:");
String office_name=scan.next();
scan.close();

	switch(offices.valueOf(office_name.toUpperCase())){
		case WORLD:
			System.out.println(world.getAddress());
				break;
		case NEXTGEN:
			System.out.println(nextGen.getAddress());
				break;
		case GLOBUS:
			System.out.println(globus.getAddress());
				break;
		case TERRATOWER:
			System.out.println(terraTower.getAddress());
				break;
		default:
			System.out.println("Address not found!");
	}

}
}
