package hybrid;

public class Employee {
	String E_name;
	int E_id;
	void login() {
		System.out.println("Employee is logining");
	}
	void work() {
		
		System.out.println("Employee is working");
		
		
	}
	void logout() {
		System.out.print("Employee is logout ");
		
	}
	void details() {
		System.out.println("employee id :"+ E_id);
		System.out.println("employeename:"+E_name);
	}

}
