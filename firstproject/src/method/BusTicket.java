package method;
import java.util.Scanner;
public class BusTicket {
int TicketsPrice(int tickets,int price) {
	int res=tickets*price;
	return res;
	
}
public static void main(String[]args) {
	BusTicket bt=new BusTicket();
	Scanner sc=new Scanner(System.in);
	int tickets=sc.nextInt();
	int price=sc.nextInt();
	
	int result=bt.TicketsPrice(tickets,price);
	System.out.println(result);
}
}
