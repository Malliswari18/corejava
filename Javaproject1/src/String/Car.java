package String;

public class Car {
	public static void main(String[] args) {
		 Car c=new Car();
		 System.out.println(c);
		 System.out.println(c.toString());
		 System.out.println(c.hashCode());
		 
		 Car c2=new Car();
		 Car c3=new Car();
		 System.out.println(c2.equals(c3));
		 
		
	}

}
