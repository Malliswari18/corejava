package single_ton;

public class Aadhar_Card {
	private static Aadhar_Card ac;
	private Aadhar_Card() {
		System.out.println("Adharcard object is created");
		
	}
	public static void getAadhar() {
		if(ac==null) {
			ac=new Aadhar_Card();
		}
		else {
			System.out.println("Object is created");
		}
		
	}

}
