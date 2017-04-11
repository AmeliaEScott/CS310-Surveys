import java.util.List;
import java.util.LinkedList;

public class member{

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