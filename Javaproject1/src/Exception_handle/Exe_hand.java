package Exception_handle;

public class Exe_hand {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
			
		}
		catch(NullPointerException e){
			System.out.println("null pointer eception");
			
		}
		catch( ClassCastException e) {
			System.out.println("invalid index");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("not divide by 0");
			
		}
		catch(Exception e) {
			System.out.println("Super exception handleer");
			
		}
		System.out.println("end");
	}

}
