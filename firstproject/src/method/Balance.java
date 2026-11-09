package method;

public class Balance {

 int calculate(int bal,int withdraw) {
	int result=bal-withdraw;
	return result;
	
}
public static void main(String[] args) {
	Balance b=new Balance();
	int result=b.calculate(10000, 2500);
	System.out.println("result:"+result);
	
}
}
