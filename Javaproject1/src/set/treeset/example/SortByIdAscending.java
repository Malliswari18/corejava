package set.treeset.example;
import java.util.Comparator;
public class SortByIdAscending implements Comparator<Shoe> {
	@Override
	public int compare(Shoe newElement,Shoe existingElement) {
	return newElement.price.compareTo(existingElement.price);
	}
	

}
