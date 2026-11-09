package firstproject;

public class Demo {
	Demo(){
		System.out.println("Hello Students");
	}
	Demo(int a){
		System.out.println("Go for lunch");

}
Demo(double b){
	System.out.println("Get placed");
}
Demo(int c, String d){
	System.out.println("See you tommorow");
}
Demo(String d, int c){
	System.out.println("go for break");
}

public static void main(String[] args) {
	Demo d1=new Demo();
	Demo d2=new Demo(20);
	Demo d3=new Demo(23.56);
	Demo d4=new Demo(23,"hello");
	Demo d5=new Demo("hey",18);
	
}
}