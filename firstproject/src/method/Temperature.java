package method;
import java.util.Scanner;

 class Temperature {
int  Convert(int c) {
	int f=(c*9/5)+32;
	return f;
}
public static void main(String[] args) {
	Temperature temp=new Temperature();
	Scanner sc =new Scanner(System.in);
	int c=sc.nextInt();
	int res=temp.Convert(c);
	System.out.println(res);
	
	
}
}
