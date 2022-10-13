public class DayOfYear {

	static int[][] daysMonthIfLeap = {
			{1,31},
			{2,29},
			{3,31},
			{4,30},
			{5,31},
			{6,30},
			{7,31},
			{8,31},
			{9,30},
			{10,31},
			{11,30},
			{12,31},
			};
	
	static int[][] daysMonthIfNotLeap = {
			{1,31},
			{2,28},
			{3,31},
			{4,30},
			{5,31},
			{6,30},
			{7,31},
			{8,31},
			{9,30},
			{10,31},
			{11,30},
			{12,31},
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Given a year, month, and day (each as an integer), return the day of the year as an integer.
        System.out.println(dayOfYear(2022, 1, 1)); // January 1, 2022 is the 1st day of the year
        System.out.println(dayOfYear(2022, 3, 1)); // March 1, 2022 is the 57th day of the year
        System.out.println(dayOfYear(2022, 12, 31)); // December 31, 2022 is the 365th day of the year
        System.out.println(dayOfYear(1912, 8, 15)); // December 31, 2022 is the 365th day of the year                
        // Watch out for leap years!
        System.out.println(dayOfYear(2022, 1, 1)); // January 1, 2022 is the 1st day of the year
        System.out.println(dayOfYear(2020, 3, 1)); // March 1, 2020 is the 58th day of the year
        System.out.println(dayOfYear(2020, 12, 31)); // December 31, 2020 is the 356th day of the year
        
        // Bonus points: Handle (throw an exception?) bad dates:
        /*
        dayOfYear(0, 0, 0);
        dayOfYear(2020, 13, 1);
        dayOfYear(2020, 5, 0);
        dayOfYear(2020, 5, 40);
        dayOfYear(-2020, -5, -40);
        */
	}

	
	//return True if the year is Leap, False if not Leap
	public static boolean isLeap(int year) {
		
		if ( (year % 4 ) == 0 ) {
			//if year is evenly divided 4 and also is evenly divided by 100 and 400 then is Leap
			if ((year%100==0)) {
				if ((year%400)==0) { 
					return true; 
				} else return false;
			} else return true; // if year is evenly divided by 4 but not evenly divided by 100 it is Leap year
			
			} else return false;
	
	}
	
	
	//return an integer with the day of the year
    public static int dayOfYear(int year, int month, int day) {
    	int totalDays=0;
    	//if year is not leap
    	boolean Leap = isLeap(year);
    	
    	if(Leap == false) {
    		for (int currentMonth =1; currentMonth<month;currentMonth++) {
    			totalDays = daysMonthIfNotLeap[currentMonth][1] + totalDays;
    		}
    		//finally add day to totalDays
    		totalDays += day;
    	} else {
    		for (int currentMonth =1; currentMonth<month;currentMonth++) {
    			totalDays = daysMonthIfLeap[currentMonth][1] + totalDays;
    		}
    		//finally add day to totalDays
    		totalDays += day;
    	}
    	
        return totalDays;
    }
}
