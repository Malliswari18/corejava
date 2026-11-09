package This_calling;

public class Demo {
	Demo(){
		System.out.println(1);
	}
Demo(int a){
	this();
	System.out.println(2);
}
public static void main(String[] args) {
	System.out.println("Start");
	Demo d=new Demo();
	Demo d1=new Demo(20);
	System.out.println("End");
	
}
}
