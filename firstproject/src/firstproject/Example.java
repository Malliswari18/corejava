package firstproject;

public class Example {
	Example(){
		System.out.println("A");	
	}
	static {
		System.out.println("B");
	}
	{
		System.out.println("D");
	}
	public static void main(String[] args) {
		Example e1=new Example();
		System.out.println("c");
		
	}

}
