package object_array;

public class Person {
	 int age;
	 String name;
	 public  Person(int age,String name) {
		 this.age=age;
		 this.name=name;		 
	 }
	 public String toString(){
		 return "age: "+ age+" Name: "+name;
	 }
	 public static void main(String[] args) {
		 Person p1=new Person(20,"tom");
		 Person p2=new Person(19,"hari");
		 Person p3=new Person(12,"leena");
		 Person[] people=new Person[3];
		 people[0]=p1;
		 people[1]=p2;
		 people[2]=p3;
		 /* after overriding toStrin()*/
		 for(int i=0;i<people.length;i++) {
			 System.out.println(people[i]);
		 }
		 System.out.println();
		 for(Person p:people) {
			 System.out.println(p);
		 }
		 
	 }

}
