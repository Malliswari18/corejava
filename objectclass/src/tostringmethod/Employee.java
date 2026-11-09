package tostringmethod;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "id:"+id+" Name:"+name+" Salary:"+salary;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(201,"tom",34567.45);
		System.out.println(e);
		
	}

	
}
