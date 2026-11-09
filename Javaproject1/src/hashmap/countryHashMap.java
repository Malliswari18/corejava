package hashmap;
import java.util.*;
public class countryHashMap {
	public static void main(String[] args) {
		Country c1=new Country(91,"India","1.48b");
		Country c2=new Country(1,"usa","349.7m");
		Country c3=new Country(7,"russia","456.4m");
		Country c4=new Country(34,"spain","34.56m");
		Country c5=new Country(34,"spain","34.56m");
		Country c6=new Country(55,"brazil","214.56m");
		Country c7=new Country(55,"brazil","214.56m");
		
		HashMap<Country,String> countries=new HashMap<Country,String>();
		countries.put(c1, "asia");
		countries.put(c2, "southAmerica");
		countries.put(c3, "northAmerica");
		countries.put(c4, "southAmerica");
		countries.put(c5, "Europe");
		Set<Country>keys=countries.keySet();
		for(Country c:keys) {
			System.out.println(c.countrycode+" "+ c.countryname+"->"+ countries.get(c));
			
		}
		
		System.out.println("=================");
		System.out.println("****LinkedHashMap*****");
		LinkedHashMap<Country,String> countries2=new LinkedHashMap<Country,String>();
		
		countries2.put(c1, "asia");
		countries2.put(c2, "southAmerica");
		countries2.put(c3, "northAmerica");
		countries2.put(c4, "southAmerica");
		countries2.put(c5, "Europe");
		countries2.put(c6, "asia");
		countries2.put(c7, "southAmerica");
		System.out.println(countries.size());
		Set<Country> keys2=countries2.keySet();
		for(Country c:keys2) {
			System.out.println(c.countrycode+" "+c.countryname+"->"+ c.population);
		}
		
		
		
	}

}
