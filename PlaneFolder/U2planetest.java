
public class U2planetest {

	public static void main(String[] args) {
		U2SpyPlane obj = new U2SpyPlane();
		
		System.out.println(obj.speed);
		System.out.println(obj.color);
		System.out.println(obj.price);
		System.out.println(obj.wingspan);
		
		obj.fly();
		obj.stop();
	}
}
