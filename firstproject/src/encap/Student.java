package encap;

public class Student {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			System.out.println("Age is initialized");
			this.age=age;
		}
		else {
			System.out.println("Age cannot be initialized");
		}
	}

}
