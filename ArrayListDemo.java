
import java.util.*;

public class ArrayListDemo 

{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add('A');
		l.add('B');
		l.add(null);
		System.out.println("elements are :"+l);
		l.remove(1);
		l.add('c');
		l.add(1, 'd');
		System.out.println("elements are:"+l);
		
	}
}
