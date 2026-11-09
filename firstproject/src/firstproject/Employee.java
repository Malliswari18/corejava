package firstproject;

public class Employee {
double salary;
String name;

Employee(double salary,String name){
	this.salary=salary;
	this.name=name;
}
public static void main(String[] args) {
	Employee e1=new Employee(200000,"tom");
	System.out.println(e1.salary);
	System.out.println(e1.name);
	Employee e2=new Employee(40000,"Tim");
	System.out.println(e2.salary);
	System.out.println(e2.name);
}
}
