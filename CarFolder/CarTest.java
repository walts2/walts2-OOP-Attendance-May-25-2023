
public class CarTest {

	public static void main(String[] args) {
		Car obj = new Car();
		
		System.out.println(obj.speed);
		System.out.println(obj.color);
		System.out.println(obj.price);
		System.out.println(obj.chassis);
		System.out.println(obj.tireType);
		System.out.println(obj.vehicleName);
		
		obj.drive();
		obj.stop();

	}
}
