
public class FrogSimulation {
	private int goalDistance;
	
	private int maxHops;
	
	public FrogSimulation (int dist, int numHops)
	{
		goalDistance = dist;
		maxHops = numHops;
	}
	
	private int hopDistance()
	{
		return 0;
	}
	
	public boolean simulate()
	{
		boolean reachedGoal = false;
		boolean negative = false;
		boolean takenMax = false;
		int hops = 0;
		int dist = 0;
		while (!reachedGoal && !negative && !takenMax)
		{
			dist += hopDistance();
			hops++;
			if (dist >= goalDistance)
			{
				reachedGoal = true;
			}
			if (hops == maxHops)
			{
				takenMax = true;
			}
			if (dist < 0)
			{
				negative = true;
			}
		}
		return reachedGoal;
	}
	
	public double runSimulations(int num)
	{
		double numTrue = 0;
		for (int i = 0; i < num; i++)
		{
			if(simulate())
			{
				numTrue += 1.0;
			}
		}
		return numTrue / num;
	}
}
