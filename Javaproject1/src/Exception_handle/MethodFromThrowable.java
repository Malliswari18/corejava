package Exception_handle;

public class MethodFromThrowable {
	public static void main(String[] args) {
		System.out.println("Startt");
		String s=null;
		try {
			System.out.println(s.length());
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		System.out.println("end");
		
	}

}
