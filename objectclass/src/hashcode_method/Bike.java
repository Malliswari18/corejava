package hashcode_method;

public class Bike {
	public static void main(String[] args) {
		Bike b1=new Bike();
		int hashcode=b1.hashCode();
		System.out.println(b1.toString());
		System.out.println(b1.toString());
		/*breaking down the internal implementation of 
		toString() method */
		System.out.println(b1.getClass().getName());
		System.out.println(Integer.toHexString(hashcode));
	}

}
