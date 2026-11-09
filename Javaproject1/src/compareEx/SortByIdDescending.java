package compareEx;

public class SortByIdDescending implements Comparator<Employee>{
	@Override
	public int compare(Employee newElement,Employee existingELement) {
		int result=existingElement.id-newElement.id;
		return result;
	}
	

}
