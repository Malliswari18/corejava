package set.hashset;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(12.5);
		hs.add(null);
		hs.add(false);
		hs.add('R');
		hs.add("werty");
		hs.add(null);
		hs.add(10);
		System.out.println(hs.size());
		System.out.println(hs);
	}

}
