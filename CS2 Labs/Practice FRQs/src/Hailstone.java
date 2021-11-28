public class Hailstone {
	
	public static int hailstoneLength (int n)
	{
		return numHailstones(n, 1);
	}
	
	// Helper Method
	private static int numHailstones (int n, int len) {
		if (n == 1) {
			return len;
		}
		if (n % 2 == 0) {
			return numHailstones(n / 2, len + 1);
		}
		if (n % 2 == 1) {
			return numHailstones((3 * n) + 1, len + 1);
		}
		return len;
	}
	
	public static boolean isLongSeq (int n)
	{
		if (n < hailstoneLength(n)) {
			return true;
		}
		return false;
	}
	
	public static double propLong (int n)
	{
		double total = 0.0;
		for (int i = 0; i < n; i++) {
			boolean isLong = isLongSeq(i + 1);
			if (isLong) {
				total++;
			}
		}
		return total / n;
	}
	
	public static void main(String[] args) {
		System.out.println(hailstoneLength(1));
		System.out.println(hailstoneLength(2));
		System.out.println(hailstoneLength(3));
		System.out.println(hailstoneLength(4));
		System.out.println(hailstoneLength(5));
		System.out.println(hailstoneLength(6));
		System.out.println(hailstoneLength(7));
		System.out.println(hailstoneLength(8));
		System.out.println(hailstoneLength(9));
		System.out.println(hailstoneLength(10));
		System.out.println(propLong(10));
	}
	
}
