package treeset_comparable;

import java.util.TreeSet;

public class MobileApp {
	public static void main(String[] args) {
		Mobile m1=new Mobile(4,"iphone",1500000);
		Mobile m2=new Mobile(4,"iphone",1500000);
		Mobile m3=new Mobile(4,"iphone",1500000);
		Mobile m4=new Mobile(4,"iphone",1500000);
		Mobile m5=new Mobile(4,"iphone",1500000);
		TreeSet<Mobile> mobiles=new TreeSet<Mobile>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);
		System.out.println(mobiles.size());
		
	}

}
