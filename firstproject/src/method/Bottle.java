package method;

public class Bottle {

void calculate(int a,int b){
	int c=a+b;
	System.out.print("sum :"+ c);
}
public static void main(String[] args) {
	Bottle b=new Bottle();
	b.calculate(10,20);
}

}
