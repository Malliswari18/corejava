package firstproject;

public class Kangroo {
	double height=5.5;
	public Kangroo() {
		double height=4.4;
		System.out.println(height);//4.4
		System.out.println(this.height);//5.5// this key word depict the current object
		
	}
	public static void main(String[] args) {
		Kangroo k=new Kangroo();
		Kangroo k1=new Kangroo();
	}
	

}
