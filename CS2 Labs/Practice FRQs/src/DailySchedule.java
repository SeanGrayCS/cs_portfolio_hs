import java.util.ArrayList;
public class DailySchedule {
	
	private ArrayList<Appointment> apptList;
	
	public DailySchedule ()
	{
		apptList = new ArrayList<>();
	}
	
	public void clearConflicts (Appointment appt)
	{
		for (int i = apptList.size() - 1; i >= 0; i--)
		{
			if (apptList.get(i).conflictsWith(appt))
			{
				apptList.remove(i);
			}
		}
	}
	
	public boolean addAppt (Appointment appt, boolean emergency)
	{
		boolean added = true;
		if (emergency)
		{
			clearConflicts(appt);
		}
		else
		{
			for (int i = apptList.size() - 1; i >= 0; i--)
			{
				if (!added)
				{
					break;
				}
				if (apptList.get(i).conflictsWith(appt))
				{
					added = false;
				}
			}
		}
		if (added)
		{
			apptList.add(appt);
		}
		return added;
	}
	
}
