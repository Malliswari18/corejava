package equalsmethod;

public class Employee {
	int id;
	String email;
	double salary;
	
	Employee(int id,String email,double salary){
		this.id=id;
		this.email=email;
		this.salary=salary;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			return this.id==e.id && this.email==e.email && this.salary==e.salary;
		}
		return false;
	}
	public static void main(String[] args) {
		Employee e=new Employee(23,"a@gmail.com",234.56);
		Employee e1=new Employee(24,"b@gmail.com",3456.456);
		Employee e2=new Employee(24,"b@gmail.com",3456.456);
		System.out.println(e.equals(e1));
		System.out.println(e==e1);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
