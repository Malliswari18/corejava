package runtime;

public class App {
	public static void main(String[] args) {
		Vehicle v=new Car();
		Vehicle vh=new Bike();
		v.Start();
		vh.Start();
	}

}
