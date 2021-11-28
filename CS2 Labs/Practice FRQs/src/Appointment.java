public class Appointment {
	
	public TimeInterval getTime()
	{
		TimeInterval time = new TimeInterval();
		return time;
	}
	
	public boolean conflictsWith (Appointment other)
	{
		if (getTime().overlapsWith(other.getTime()))
		{
			return true;
		}
		return false;
	}
	
}
