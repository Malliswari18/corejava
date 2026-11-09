package treeset_comparable;
import java.util.*;
public class Mobile {
	private int id;
	private String model;
	private int price;

	public Mobile(int id, String model, int price) {
		this.id=id;
		this.model=model;
		this.price=price;
	}

	public class Mobile implements Comparable<Mobile>{
		int id;
		String model;
		double price;
		
		/* sorting based on model*/
		@Override
		public int compareTo(Mobile o) {
			int result=this.model.compareTo(o.model);
			return result;
		}
		/*sorting based on price*/
		@Override
		public int compareTo(Mobile o) {
			int result =this.price.comapreTo(o.price);
			return result;
		}
		@Override
		public String toString() {
			return "mobile:"+id +model+price;
		}
	}

}
