
public class Car extends Vehicle {
	String chassis = "Subcompact Car";
	String vehicleName = "Toyota Vios";
	String tireType = "195/50 R16 Alloy";
	
	void drive() {
		System.out.println("Step on the accelator");
	}

	@Override
	void stop() {
		System.out.println("Step on the brakes");
		super.stop();		
	}
}
