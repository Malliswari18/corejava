package multilevel;

public class App {
	public static void main(String[] args) {
		System.out.println("properties accessed by the object");
Vehicle v=new Vehicle();
v.Start();
System.out.println();
System.out.println("Brand :"+ v.brand);
v.Stop();
System.out.println();

System.out.println("properties accesseble by car object");
Car c=new Car();
c.Start();
System.out.println();
System.out.println("brand :"+ c.brand);
System.out.println("model:"+ c.model);

c.Stop();
c.openBoot();
System.out.println();
System.out.println();

System.out.println("properties accessed by ev ");
 ElectricCar ev=new ElectricCar();
 ev.Start();
 System.out.println();
 ev.Stop();
 ev.openBoot();
 System.out.println();
 System.out.println("Brand:"+ ev.brand);
 System.out.println("model:"+ ev.model);
 ev.ChargeBattery();
 System.out.println("battery:"+ ev.batteryType);

	}


}
