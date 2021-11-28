import java.util.List;
import java.util.ArrayList;
public class MasterOrder {
	
	private List<CookieOrder> orders;
	
	public MasterOrder ()
	{
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder (CookieOrder theOrder)
	{
		orders.add(theOrder);
	}
	
	public int getTotalBoxes ()
	{
		int totalBoxes = 0;
		for (CookieOrder order : orders)
		{
			totalBoxes += order.getNumBoxes();
		}
		return totalBoxes;
	}
	
	public int removeVariety (String cookieVar)
	{
		int removedBoxes = 0;
		for (int i = orders.size() - 1; i >= 0; i--)
		{
			if (orders.get(i).getVariety().equals(cookieVar))
			{
				removedBoxes += orders.get(i).getNumBoxes();
				orders.remove(i);
			}
		}
		return removedBoxes;
	}
	
}
