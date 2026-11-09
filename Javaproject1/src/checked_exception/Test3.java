package checked_exception;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("start");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
		System.out.println("end");
	}

}
