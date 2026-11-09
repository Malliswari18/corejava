package list.linkedlist;
import java.util.*;
public class Sort_String {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("elephant");
		a1.add("bear");
		a1.add("cat");
		a1.add("dog");
		a1.add("tiger");
		a1.add("application");
		System.out.println("before sorting");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("after sorting");
		System.out.println("===============");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		Collections.sort(a1);
		System.out.println("after Sorting");
		System.out.println("===============");

		for(String var:a1) {
			System.out.println(var);
		}
		System.out.println();
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println("reverse");
		for(String rev:a1) {
		
			System.out.println(rev);
		}
		
	}

}
