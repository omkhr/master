import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.io.*;


public class SampleArrayList 
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		LinkedList l=new LinkedList();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l instanceof RandomAccess);
		
	}
}
