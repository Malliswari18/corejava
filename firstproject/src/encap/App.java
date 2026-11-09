package encap;

public class App {
	public static void main(String[] args) {
		Product p1=new Product();
		System.out.println(p1.readPrice());
		p1.writePrice(150);
		
		System.out.println(p1.readPrice());
	}

}
