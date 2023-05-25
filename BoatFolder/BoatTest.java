
public class BoatTest {

	public static void main(String[] args) {
		FandangoYacht obj = new FandangoYacht();
		
		System.out.println(obj.type);
		System.out.println(obj.classification);
		System.out.println(obj.mainsail);
		System.out.println(obj.speed);
		System.out.println(obj.color);
		System.out.println(obj.price);
		
		obj.stop();
		obj.floating();
	}
}
