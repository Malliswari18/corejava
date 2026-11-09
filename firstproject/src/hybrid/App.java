package hybrid;

public class App {
public static void main(String[] args) {
	Employee emp=new Employee();
	 emp.E_id=101;
	 emp.E_name="MAlli";
	emp.details();
	emp.login();
	emp.work();
	emp.logout();
	System.out.println();
	Lead ld=new Lead();
	ld.assignwork();
	ld.execute();
	
	 
	
	 

}
}
