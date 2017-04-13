import java.util.*;
import java.lang.*;
import java.io.*;

class MapClass
{
	public interface MapInterface<T,V>
	{
		public T mapFunc(V val);
	}
	public static double squareFunc(double val)
	{
		return val*val;
	}
	
	public static <E> Collection<E> map(Collection<E> c, MapInterface<E,E> mappedFunc)
	{
		ArrayList<E> list = new ArrayList();
		Iterator<E> it = c.iterator();
		while(it.hasNext())
		{
			list.add(mappedFunc.mapFunc(it.next()));
		}
		c.clear();
		c.addAll(list);
		return list;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Double> list = new ArrayList<>(10);
		list.add(10.0);
		list.add(2.0);
		list.add(9.0);
		map(list,  new MapInterface<Double,Double>() {
   						public Double mapFunc(Double val) {
        					return squareFunc(val);
   						}
					});
		System.out.println(list.toString());
	}
}
