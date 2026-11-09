package Exception_handle;

public class MethodFromThrowable2 {
	public static void main(String[] args) {
		String s1=null;
		try {
			System.out.println(s1.length());
		}
		catch(NullPointerException e) {
			String mesge=e.getMessage();
			System.out.println(mesge);
			System.out.println(e.getMessage());
			
		}
		System.out.println("end");
	}

}
