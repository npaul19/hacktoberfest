
public class DayOfYear {
    public static void main(String... args) {
        System.out.println(dayOfYear(2022, 1, 1)); // January 1, 2022 is the 1st day of the year
        System.out.println(dayOfYear(2022, 3, 1)); // March 1, 2022 is the 57th day of the year
        System.out.println(dayOfYear(2022, 12, 31)); // December 31, 2022 is the 365th day of the year
                
        // Watch out for leap years!
        System.out.println(dayOfYear(2022, 1, 1)); // January 1, 2022 is the 1st day of the year
        System.out.println(dayOfYear(2020, 3, 1)); // March 1, 2020 is the 58th day of the year
        System.out.println(dayOfYear(2020, 12, 31)); // December 31, 2020 is the 356th day of the year
        
        // Bonus points: Handle (throw an exception?) bad dates:
        dayOfYear(0, 0, 0);
        dayOfYear(2020, 13, 1);
        dayOfYear(2020, 5, 0);
        dayOfYear(2020, 5, 40);
        dayOfYear(-2020, -5, -40);
    }
    
    public static int dayOfYear(int year, int month, int day) {
        return 0;
    }
}
