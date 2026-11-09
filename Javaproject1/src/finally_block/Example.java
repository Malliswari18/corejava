package finally_block;

public class Example {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);//throws ArthimeticEception
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			
			
		}
		finally {
			System.out.println("mandatory Lines");
		}
		System.out.println("end");
	}

}
