package Constructor_overloading;

public class Product {
	Product(){
		System.out.println("Sheos order");
	}
	Product(int price){
		System.out.println("Price"+ price);
	}
	Product(String brand){
		System.out.println("Brand"+ brand);
	}
	Product(String model,int discount){
		
		System.out.println("model"+ model + "discount"+ discount);
	}

}
