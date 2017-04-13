import java.util.*;

/*
Function: equalsimp
Language: Java 
@author Kenneth Redillas
*/
public class same {
    public static <e> void main(String [] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();

	list1.add(1);
	list1.add(2);
	list2.add(1);

	System.out.println(same(list1, list2));

	list2.add(2);

	System.out.println(same(list1, list2));
	
    }


    /*
	Referrential transparency: This function does not reference any variables outside the scope
	of the function, and it does not modify the list passed to it. Therefore, it is referrentially transparent.
    */
    public static <e> boolean same(List<e> list1, List<e> list2) {
		if (list1.isEmpty() && list2.isEmpty()) return true;
		else if (list2.isEmpty()) return false;
		else if (list1.get(0).equals(list2.get(0))) {
		    return same(list1.subList(1, list1.size()) , list2.subList(1, list2.size()));
		}
		else return false;
    }
}
