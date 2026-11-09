package String;

public class Demo1 {
	public static void main(String[] args) {
		String s=new String("A");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		
		String s2=new String("java");
		String s3=new  String("java");
		System.out.println(s2.equals(s3));
	}

}
