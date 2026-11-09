package list_vector;
import java.util.*;
public class ConstructorsExample {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		System.out.println(al);
		LinkedList<Integer> ll=new LinkedList<Integer>(al);
		ll.add(20);
		System.out.println(ll);
		Vector<Integer> v=new Vector<Integer>(ll);
				v.add(30);
		System.out.println(v);
		
	}

}
