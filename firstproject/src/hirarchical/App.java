package hirarchical;

public class App {
	public static void main(String[] args) {
		Cow c=new Cow();
		c.type="Domestic";
		c.name="gauri";
		c.details();
		c.eat();
		c.sleep();
		c.moo();
		c.graze();
		System.out.println();
		Tiger t=new Tiger();
		t.type="wild";
		t.name="sheru";
		t.details();
		t.sleep();
		t.eat();
		t.roar();
		t.hunt();
		
		
	}

}
