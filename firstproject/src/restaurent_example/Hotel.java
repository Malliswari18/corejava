package restaurent_example;

public class Hotel {
	public Food Order (int choice) {
		if(choice==1) {
			Idly i=new Idly();
		return i;	
		}
		else if(choice==2) {
			Dosa d=new Dosa();
			return d;
		}
		else if(choice==3) {
			Vada v=new Vada();
			return v;
		}
		else {
			System.out.println("Input invalid)");
			
		}
		return null;
		
		
		
	}
	

}
