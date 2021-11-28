
public class APCalendar {
	
	private static boolean isLeapYear (int year) {
		return false;
	}
	
	public static int numberOfLeapYears (int year1, int year2) {
		int numLeapYears = (year2 - year1) / 4;
		if (isLeapYear(year1) || isLeapYear(year2)) {
			numLeapYears++;
		}
		return numLeapYears;
	}
	
	private static int firstDayOfYear (int year) {
		return 0;
	}
	
	private static int dayOfYear (int month, int day, int year) {
		return 0;
	}
	
	public static int dayOfWeek (int month, int day, int year) {
		
		int first = firstDayOfYear(year);
		int date = dayOfYear(month, day, year);
		
		int dayOfWeek = (date % 7 - 1) + first;
		if (dayOfWeek < 0) {
			dayOfWeek = 6;
		}
		return dayOfWeek;
	}
	
}
