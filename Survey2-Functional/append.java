import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Edwin Velasquez
 * CS 310: Survey 2
 * Append: Java
 */

public class append{
	public static <E> void main(String[] args){
		List<E> test1 = new ArrayList<>();
		List<E> test2 = new ArrayList<>();
//		List<E> test3 = new ArrayList<>();
//		test3.appendsList(test1, test2);
		
		test1.add((E) "hello");
		test2.add((E) "world");
		List<E> test3 = appendsLists(test1,test2);
		System.out.println(test1 + " " + test2);
		System.out.println(test3);
		
	}

	
	
	// This doesn't work because it makes a new list each recursive call
	// so it'll only return list2 at the end
	// I also tried making the method non-static but it comes up with 
	// some obscure error in the main class(Commented out lines 15&16)
	
	
	public static <E> List<E> appendsLists(List<E> List1, List<E> List2) {
		List<E> List3 = new ArrayList<>();
		if(List1.isEmpty()){
			List3.addAll(List2);
			return List3;
		}
		else{
			List3.add(List1.get(0));
			return  appendsLists(List1.subList(1, List1.size()), List2);
		}
	}
	
}