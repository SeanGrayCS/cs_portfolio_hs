public class SelfDivisor {
	
	public static boolean isSelfDivisor (int number)
	{
		boolean selfDivisible = true;
		String num = "" + number;
		String[] divisors = num.split("");
		int[] divs = new int[divisors.length];
		for (int i = 0; i < divisors.length; i++)
		{
			divs[i] = Integer.parseInt(divisors[i]);
		}
		for (int div : divs)
		{
			if (!selfDivisible)
			{
				break;
			}
			if (number % div != 0)
			{
				selfDivisible = false;
			}
		}
		return selfDivisible;
	}
	
	public static int[] firstNumSelfDivisors (int start, int num)
	{
		int[] divisors = new int[num];
		int divisorsFound = 0;
		int number = start;
		while (divisorsFound < num)
		{
			if (isSelfDivisor(number))
			{
				divisors[divisorsFound] = number;
				divisorsFound++;
			}
			number++;
		}
		return divisors;
	}
}
