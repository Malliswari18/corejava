package method;
import java.util.Scanner;
public class BankIntrest {
	int SimpleIntrest(int p,int r,int t){
		int SI=(p*r*t)/100;
		return SI;
		
		
	}
	public static void main(String[] args) {
		BankIntrest BI=new BankIntrest();
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		int result=BI.SimpleIntrest(p,r,t);
		System.out.println(result);
	}

}
