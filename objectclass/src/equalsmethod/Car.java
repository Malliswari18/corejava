package equalsmethod;

public class Car {
	int price;
	String brand;
	public Car(String brand,int price) {
		this.brand=brand;
		this.price=price;
		
	}
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c=(Car) obj;
			return this.brand==c.brand && this.price==c.price;
			
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Car c=new Car("audi",800);
		Car c2=new Car("audi",800);
		Car c3=new Car("bmw",700);
		System.out.println(c==c2);
		System.out.println(c.equals(c2));
		System.out.println(c==c3);
		System.out.println(c.equals(c3));
	}

}
