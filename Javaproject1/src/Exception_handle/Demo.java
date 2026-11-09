package Exception_handle;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
	System.out.println("Start");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	try {
		System.out.println(a/b);
	}
	catch(ArithmeticException e){
		System.out.println("cannot divide by 0");
		
		
	}
	System.out.println("end");
	
	
	}
}
