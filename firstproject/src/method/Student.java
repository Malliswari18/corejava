package method;
import java.util.Scanner;

public  class Student {
	
String  PassorFail(int marks) {
	if(marks<=40) {
		return "fail";
	}
	else {
		return "pass";
	}
	
	
}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	Student s =new Student();
	String Result=s.PassorFail(marks);
	System.out.println(Result);
	
	
}
}
