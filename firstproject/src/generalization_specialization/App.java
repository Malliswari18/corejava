package generalization_specialization;

public class App {
	
		public void hire(Employee e) {
			if(e instanceof Developer) {
				Developer d=(Developer)e;
				System.out.println("hired as a Developer");
				System.out.println("company:" + d.company);
				System.out.println("Salary:"+ d.devSalary);
				System.out.println("--------------");
				
				
			}
			else if(e instanceof HR) {
				HR h= (HR)e;
				System.out.println("hired as a Hr");
				System.out.println("company:"+ h.company);
				System.out.println("salary:"+ h.hrSalary);
				System.out.println("--------------");
				
				
			}
			else if (e instanceof Tester){
				Tester t=(Tester)e;
				System.out.println("hired as a Tester");
				System.out.println("company:"+t.company);
				System.out.println("salary:"+t.testerSalary);
				System.out.println("--------------");
				
				
			}
		}
		
		
		
	

}
