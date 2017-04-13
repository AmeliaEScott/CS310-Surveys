import java.util.ArrayList;
import java.util.List;

/**
 * Function: append
 * Language: Java
 * @author Edwin Velasquez
 */

public class append{
	public static <E> void main(String[] args){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(7);


		list2.add(4);
		list2.add(5);
		list2.add(6);

		List<Integer> list3 = append(list1, list2);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();

		list4.add("hello");
		list4.add("this");
		list4.add("is");

		list5.add("another");
		list5.add("append");
		list5.add("test");
		
		List<String> list6 = append(list4, list5);

		System.out.println(list4);
		System.out.println(list5);
		System.out.println(list6);

	}

	/*
	Referential transparency: this function 
	doesn't reference any variables
	outside of the function, and it does not alter 
	the lists passed to it.
	*/
	private static <E> List<E> append(List<E> list1, List<E> list2) {
		List<E> result = new ArrayList<E>();
		result.addAll(list2);
		if(list1.isEmpty()){
			return result;
		}
		else{
			result.add(0, list1.get(list1.size()-1));
			result = append(list1.subList(0, list1.size()-1), result);
		}
		return result;
	}

}