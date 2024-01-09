/**
 * Prints the calendars of the selected year
 */
public class Calendar {
	static int dayOfMonth = 1;
	static int year = 1990 ;
	static int month = 1;
	static int dayOfWeek = 2;    // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	/** 
	 * Prints the calendars of all the days in the selected year in the year.
	 */
	public static void main(String args[]) {
		int Myyear = Integer.parseInt(args[0]);
	 	while ((year != Myyear) ||  (month != 1) || (dayOfMonth != 1)) {
	 		advance(); 
	 		}
	 	while ((year != Myyear + 1) ||  (month != 1) || (dayOfMonth != 1)) {
			if (dayOfWeek == 1){
				System.out.println(dayOfMonth+"/"+month+"/"+year+" Sunday");
			}
			else {
				System.out.println(dayOfMonth+"/"+month+"/"+year);
			}
			advance();
	 		}
	}

	private static void advance() {
	 	if (dayOfWeek==7) {
	 		dayOfWeek = 1 ;
	 	} else {
	 		dayOfWeek++;
	 	}
	 	if (dayOfMonth == nDaysInMonth(month,year)) {
	 		dayOfMonth = 1;
			if (month == 12) {
				month = 1;
				year++;
			} 
			else {
				month++;
			}
		}
	 	else {
	 		dayOfMonth++;
	 	}
	
	 } 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear ;
		isLeapYear = ((year % 400) == 0) ;
		isLeapYear = isLeapYear || (((year % 4) == 0)&& ((year % 100) != 0)) ;
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if ((month == 1) || (month == 3) || (month == 7) || (month == 8) || (month ==10) || (month == 12) || (month == 5)) {
			return 31;
		}
		if (month == 2) {
			if (isLeapYear(year)== true) {
				return 29;
			}
			else {
				return 28 ; 
			}
		}
		return 30;
	
	}
}

