package set.hashset;

public class Student {
	String name;
	int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name +" "+age;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student stu=(Student) obj;
			return this.name.equals(stu.name)&& this.age==stu.age;
		}
		return false;
			
		}
	@Override
	public int hashCode() {
		return this.age;
	}

}
