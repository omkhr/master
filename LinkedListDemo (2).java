import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add("omi");
		l1.add("hello");
		l1.add(null);
		l1.add("my");
		l1.set(1, "rohit");
		l1.add(1,"jay");
		l1.addLast("haldankar");
		l1.addFirst("sahana");
		System.out.println("data:"+l1);
	}
}
