package compile_time;

public class Myntra {
	void purchase(String product) {
		System.out.println("product:"+product);		
	}
	void purchase(int price) {
		System.out.println("cost:"+price);
	}
	void purchase(String brand, int qlty) {
		System.out.println("brand:"+ brand +"qlty:"+qlty);
	}
	void purchase(int discount,String offerName) {
		System.out.println("Discount:"+discount +",offerName:"+offerName);
		
	}

}
