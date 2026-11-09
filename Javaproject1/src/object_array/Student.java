package object_array;

public class Student {
	int age;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s1=new Student(20,"james");
		Student s2=new Student(30,"adam");
		Student s3=new Student(25,"will");
		Student[] students=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].age+" "+students[i].name);
		
		}
		System.out.println();
		for(Student s:students) {
			System.out.println(s.age+" "+s.name);
		}
		
	}

}
