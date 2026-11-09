package single_ton;

public class Country {
	public static void main(String[] args) {
		PrimeMinister pm= PrimeMinister.getPmObj();
		System.out.println(pm.name +" elected as priminister");
		System.out.println("he is serving "+pm.term+"rd term");
	}

}
