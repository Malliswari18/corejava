package throws_keyword;

public class App_unchecked {
	public static void main(String[] args)  {
		System.out.println("Start");
		Unchecked_demo ud=new Unchecked_demo();
		try {
			ud.display();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	

}
