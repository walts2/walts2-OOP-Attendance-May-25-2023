
public class U2SpyPlane extends Vehicle {
	String wingspan = "105 feet (32 meters)";
	
	void fly(){
		System.out.println("the plane will take off");
	}

	@Override
	void stop() {
		System.out.println("The plane will land on the runway");
		super.stop();
	}
	
}
