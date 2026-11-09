package custom_exception;
import java.util.*;

public class Shadhi_application {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=21) {
			System.out.println("get married soon");
		}
		else {
			try{
				throw new InvalidAgeException("wait ");
			}
			catch (InvalidAgeException e) {
				e.printStackTrace();
		}
		}
	}

}
