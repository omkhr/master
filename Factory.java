import java.util.Collection;

public class Factory {
	
	
	 
	@SuppressWarnings("rawtypes")
	Collection col;
	 
    	@SuppressWarnings({ "rawtypes", "unchecked" })
		Collection order(int items)
	{
		for(int i=0;i<items;i++)
		{
			Bike b1=new Bike();
			System.out.println("value:"+b1);
			col.add(b1);	
		}
		
		return col;
		
	}

}
