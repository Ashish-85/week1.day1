package week1.day1;

public class Mobile {

	String mobileModel = "Realme C25";
	Float mobileWeight = 200.1f;
	Boolean isFullCharged = true;
	int mobileCost = 1000;

	public static void main(String[] args) {

		System.out.println("In Main Method");

		Mobile mob = new Mobile();

		mob.makeCall();
		mob.sendMsg();
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isFullCharged);
		System.out.println(mob.mobileCost);

	}
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void sendMsg() {
		System.out.println("Send Message");
	}

}
