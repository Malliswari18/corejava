package nonPrimitiveDatatype;

public class App {
public static void main(String[] args) {
	/*UPCASTING*/
	System.out.println("After upcasting");
	Father f=new Son();
	System.out.println(f.age);
//	
/*DOWNCASTING*/
	
	System.out.println("After downcasting");
	Son s=(Son)f;
	System.out.println(s.age);
	System.out.println(s.height);
	
	
}
}
