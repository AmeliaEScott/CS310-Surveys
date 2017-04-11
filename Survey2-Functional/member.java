/*
Function: Member
Language: Java
Author: Timothy Scott
Team: Haskers
*/

import java.util.List;
import java.util.LinkedList;

public class member{

	/*
	Certified to be referentially transparent by Timothy Scott
	Reason: This function does not reference any variables outside of the scope of the
	function, meaning that it cannot store any information between different calls
	of the function.
	*/
	public static boolean member(Number x, List<Number> list){
		if(list.size() <= 0){
			return false;
		}else if(x == list.get(0)){
			return true;
		}else{
			return member(x, list.subList(1, list.size()));
		}
	}

	public static void main(String[] args){
		List<Number> list = new LinkedList<Number>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(member(6, list));
	}


}