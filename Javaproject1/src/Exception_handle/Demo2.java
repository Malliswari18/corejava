package Exception_handle;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("start");
		int[] marks= {67,78,90,40};
		try {
			System.out.println(marks[50]);// critical line
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");//handling code
		}
		System.out.println("end");
	}

}
