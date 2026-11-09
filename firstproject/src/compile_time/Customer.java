package compile_time;

public class Customer {
	public static void main(String[] args) {
		Myntra m=new Myntra();
		m.purchase(50000);
		m.purchase("Shoes");
		m.purchase(20,"diwali");
		m.purchase("nike",5);
		
		
	}

}
