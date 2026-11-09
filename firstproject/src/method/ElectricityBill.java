package method;
import java.util.Scanner;
public class ElectricityBill {
	 int  bill(String name,int units,int price) {
		 int res=units*price;
		 return res;
		
	}
	 public static void main(String[] args) {
		 ElectricityBill eb=new ElectricityBill();
		 Scanner sc=new Scanner(System.in);
		 String name=sc.nextLine();
		 int units=sc.nextInt();
		 int price=sc.nextInt();
		 int result=eb.bill(name, units, price);
		 System.out.println(result);
	 }

}
