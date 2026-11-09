package single_ton;

public class PrimeMinister {
	String name="Narendramodi";
	int term=3;
	private static  PrimeMinister pm;
	private PrimeMinister() {
		System.out.println("PM is elected");
	}
	public static PrimeMinister getPmObj() {
		if(pm==null) {
		pm=new PrimeMinister();
		}
		return pm;
	}
	

}
