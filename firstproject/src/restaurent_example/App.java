package restaurent_example;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your choice:");
	        System.out.println("1 - Idly");
	        System.out.println("2 - Dosa");
	        System.out.println("3 - Vada");
	        int choice = sc.nextInt();  
	        Hotel h=new Hotel();
	        Food f=h.Order(2);

if(f instanceof Idly) {
	Idly idly=(Idly)f;
	System.out.println("FoodType:"+idly.Type);
	System.out.println("idlyPrice:"+ idly.idlyPrice);
	
}
else if(f instanceof Dosa){
	Dosa dosa=(Dosa)f;
	System.out.println("FoodType:"+dosa.Type);
	System.out.println("DosaPrice:"+ dosa.dosaPrice);
	
}
else if(f instanceof Vada) {
	Vada vada=(Vada)f;
	System.out.println("FoodType:"+vada.Type);
	System.out.println("vadaPrice:"+ vada.vadaPrice);
}
	}
}
