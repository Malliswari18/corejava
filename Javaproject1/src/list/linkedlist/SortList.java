package list.linkedlist;
import java.util.*;

public class SortList {
	
public static void main(String[] args) {
	LinkedList<Integer> marks=new LinkedList<Integer>();
	marks.add(40);
	marks.add(10);
	marks.add(30);
	marks.add(40);
	marks.add(20);
	System.out.println("before sorting");
	for(int i=0;i<marks.size();i++) {
		System.out.println(marks.get(i));
	}
	Collections.sort(marks);
	System.out.println("after Sorting");
	for(int var:marks) {
		System.out.println(var);
	}
	System.out.println();
	Collections.sort(marks,Collections.reverseOrder());
	System.out.println("reverse");
	for(int var:marks) {
		System.out.println(var);
	}
}
}
