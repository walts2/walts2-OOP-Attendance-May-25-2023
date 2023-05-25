
public class FandangoYacht extends Vehicle {
	String type = "Motor Yacht";
	String classification = "3";
	String mainsail = "Blue";
	
	void floating(){
		System.out.println("Float");
	}

	@Override
	void stop() {
		System.out.println("Throw Anchor");
		super.stop();
	}
}

