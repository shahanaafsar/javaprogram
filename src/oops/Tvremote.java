package oops;

interface tvremotee
{
	public void volumeup();
	void channeldown();
}
interface smarttvremote extends tvremotee
{
	public void volumemute();
}
class smarttv implements smarttvremote
{

	@Override
	public void volumeup() {
		System.out.println("volume increase");
	}

	@Override
	public void channeldown() {
		System.out.println("channge channel");
		
	}

	@Override
	public void volumemute() {
		System.out.println("volume reduce");
		
	}

	
	
	}
	

public class Tvremote {

	public static void main(String[] args) {
	
		smarttv ob= new smarttv();
		ob.channeldown();
		ob.volumeup();
		
		ob.volumemute();
		
	}

}
