import java.util.LinkedList;
import java.util.ListIterator;

public class ListIeratorDemo 
{

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("omi");
		l.add("tanishka");
		l.add("rohot");
		System.out.println("data:"+l);
		ListIterator l1=l.listIterator();
		while(l1.hasNext())
		{
			String s=(String)l1.next();
			if(s.equals("omi"))
			{
				l1.remove();
			}
			else if(s.equals("tanishka"))
			{
				l1.add("omkar");
				System.out.println("index next:"+l1.nextIndex());
			}
			else
			{
				l1.set("omya");
				System.out.println("index previous:"+l1.previousIndex());
			}
			
		}
		System.out.println("final result:"+l);
	}
}
