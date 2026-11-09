package nonPrimitiveDatatype;

public class Main {
	public static void main(String[] args) {
		System.out.println("After upcasting");
		Vehicle v=new Car();
		System.out.println(v.brand);
		System.out.println("After downcasting");
		Car c=(Car)v;
		System.out.println(c.brand);
		System.out.println(c.type);
		
	}

}
