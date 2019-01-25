import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public void main(String[] args)
	{
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
			
		}
		System.out.println("inital data:"+l);
		Iterator i=l.listIterator();
		while(i.hasNext())
		{
			Integer i1 =(Integer)i.next();
			if(i1%2==0)
			{
				System.out.println("data:"+i1);
			}
			else
			i.remove();
		
			
		}
		System.out.println("final data:"+l);
		
	}
}
