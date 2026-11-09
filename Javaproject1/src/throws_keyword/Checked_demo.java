package throws_keyword;

public class Checked_demo {
	void print() throws InterruptedException{
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
