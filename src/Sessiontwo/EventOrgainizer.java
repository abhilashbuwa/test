package sessionTwo;

abstract class Event
{
	abstract void perform();
}

class ParticipantOne extends Event
{
	void perform(){
		System.out.println("Participate-1 will be singing");
	}
}
class ParticipantTwo extends Event
{
	void perform(){
		System.out.println("Participate-2 will be doing stand-up comedy act");
	}
}

class ParticipantThree extends Event
{
	void perform(){
		System.out.println("Participate-3 will be dancing");
	}
}

public class EventOrgainizer {
	public static void main(String args[]){
		Event participant=new ParticipantOne();  //Base class Reference
		participant.perform();
		participant=new ParticipantTwo();
		participant.perform();
		participant=new ParticipantThree();
		participant.perform();
	}
}
