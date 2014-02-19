public class Day
{
    private int day;
    private int month;
    private int year;
    private static final int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
    private static final int[] monthSize = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final int[] monthSizeLeap = {31,29,31,30,31,30,31,31,30,31,30,31};
    private static final int[] endOfMonth = {31,59,90,120,151,181,212,243,273,304,334,365};
    private static final int[] endOfMonthLeap = {31,60,91,121,152,182,213,244,274,305,335,366};
    private static final int[] beginningOfMonth = {1,32,60,91,121,152,182,213,244,274,305,335};
    private static final int[] beginningOfMonthLeap = {1,32,61,92,122,153,183,214,245,275,306,336};
    /**
       Constructs a day with user inputted day, month, and year in that specific format.
       @param iday Day between 1 and 31.
       @param imonth Month between 1 and 12
       @param iyear Year not equal to zero
       
    */
    public Day(int iday, int imonth, int iyear){
	if(iday<32&&iday>0){
            day = iday;
        }
	else {
	    throw new IllegalArgumentException("Day out of range.");
	}
	if(imonth>0&&imonth<13){
	    month = imonth;
	}
	else {
	    throw new IllegalArgumentException("Month out of range.");
	}
	if (iyear>0&&iyear<10001){
	    year = iyear;
	}
	else {
	    throw new IllegalArgumentException("Month out of range.");
	}
	if(day==31 && (month==2|month==4|month==6|month==9|month==11)){
	    System.out.println("Error Here");
	    throw new IllegalArgumentException("Day exceeds days in month.");
	}
	else if (day==30 && (month==2))
	    throw new IllegalArgumentException("Day exceeds days in month.");
	else if (day==29 && !isLeap(year))
	    throw new IllegalArgumentException("Day exceeds days in month.");
		    
    }
    /**
       Copy constructor. 
       @param other Separate instance of Day.
    */
    public Day(Day other){
	day = other.day;
	month = other.month;
	year = other.year;
    }
    /**
       getDayOfWeek. Returns 0-6 representing day of the week starting on Sunday.
       
    */    
    public int getDayOfWeek(){
	int[] doomsDays;
	doomsDays = new int[13];	
	doomsDays[0] = 0;
	if (this.isLeapYear() == false) {
	    doomsDays[1] = 3;
	    doomsDays[2] = 28;
	}
	else {
	    doomsDays[1] = 4;
	    doomsDays[2] = 29;
	}
	doomsDays[3] = 0;
	doomsDays[4] = 4;
	doomsDays[5] = 9;
	doomsDays[6] = 6;
	doomsDays[7] = 11;
	doomsDays[8] = 8;
	doomsDays[9] = 5;
	doomsDays[10] = 10;
	doomsDays[11] = 7;
	doomsDays[12] = 12;
	int a = this.year;
	int n = String.valueOf(a).length();
	int lastTwo = Integer.parseInt((""+a).substring(n-2,n));
	int multOfLastDigits = lastTwo/12;
	int remOfLastDigits = lastTwo%12;
	int numFours = remOfLastDigits/4;
	int sumRems = multOfLastDigits + remOfLastDigits + numFours;
	int remSumRems = sumRems%7;
	int firstTwo = Integer.parseInt((""+a).substring(n-n,n-n+2));
	int anchorDay = 10;
	if (firstTwo%4==0)
	    anchorDay = 2;
	else if (firstTwo%4==1)
	    anchorDay = 0;
	else if (firstTwo%4==2)
	    anchorDay = 5;
	else if (firstTwo%4==3)
	    anchorDay = 3;
	else
	    System.out.println("Failure, anchorDay could not be computed.");
	int doomsday = (remSumRems+anchorDay)%7;
	int diff = this.day - doomsDays[this.month];
	int dayWeek = (remSumRems+anchorDay+diff)%7;
	if (dayWeek<0)
	    dayWeek+=7;
	if (dayWeek>6)
	    dayWeek-=7;
	return dayWeek;	
    }
    /**
       Private function to determine if argument is a leap year.
       @param year 
    */
    private static boolean isLeap(int year){
        if((year%4==0)&&(year%100!=0)||(year%400==0))
            return true;
        else
            return false;
    }
    /**
       Public function to determine if instance of Day is a leap year.
    */
    public boolean isLeapYear(){
	return isLeap(this.year);
    }
    /**
       Public function to determine if two instances of Day are equal.
       @param other Separate instance of Day
    */
    public boolean equals(Day other){
	if(this.day==other.day && this.month==other.month && this.year==other.year)
	    return true;
	else
	    return false;
    }
    /**
       Private function to count number of days including possible leap years.
       @param days Integer representing given number of days.
    */
    private int totDays(int days){
	int years = days/365;
	int remDays = days%365;
	int totDays = years*365;
	if(years>0){
	    for (int n=0;n<=years;n++){
		if (isLeap(this.getYear()+n)){
		    totDays++;
		}
	    }
	}
	else if(years<0){
	    for (int n = years; n<=0;n++){
		if(isLeap(this.getYear()-n)){
		    totDays--;
		}
	    }
	}
	totDays += remDays;
	return totDays;
    }
    /**
       Public function to compute the difference in days between two dates.
       @param other Separate instance of day.
    */
    public int dayDifference(Day other){
	int tDays = convertToTotalDays(this.day,this.month, this.year);
	tDays += this.year*365;
	int oDays = convertToTotalDays(other.day, other.month, other.year);
	oDays += other.year*365;
	int dayDiff = totDays(tDays-oDays);
	return dayDiff;
    }    
    /**
       Public function to return year of instance.
    */
    public int getYear()
    {
	return year;
    }
    /**
       Public function to return month of instance.
    */
    public int getMonth()
    {
	return month;
    }
    /**
       Public function to return day of instance.
    */
    public int getDay()
    {
	return day;
    }
    /**
       Public function to determine if given instance is the end of the month.
    */
    public boolean isLastDayOfMonth()
    {
	if (this.isLeapYear())
	    {
		if (monthSizeLeap[this.month-1]==this.day)
		    return true;
		else
		    return false;
	    }
	else
	    {
		if (monthSize[this.month-1]==this.day)
		    return true;
		else
		    return false;
	    }
    }
    /** 
	Public function to determine if given instance is the beginning of the month.
    */
    public boolean isBeginningOfMonth()
    {
	if (this.day==1)
	    {
		return true;
	    }
	else
	    {
		return false;
	    }
    }
    /**
       Private function to convert day and month to which day they represent in the year. It accounts for leap year if necessary.
       @param thisDay Day of interest
       @param thisMonth Month of interest
       @param thisYear Year of interest
    */
    private int convertToTotalDays(int thisDay, int thisMonth, int thisYear)
    {
        int daysFromMonth = 0;
        int totalDays;
        if (isLeap(thisYear) == false)
	    {
		for (int i = 0; i <= (thisMonth-2); i++)
		    {
			daysFromMonth = monthSize[i] + daysFromMonth;
		    }
		totalDays = thisDay + daysFromMonth;
		return totalDays;
	    }
        else
	    {
		for (int i = 0; i <= (thisMonth-2); i++)
		    {
			daysFromMonth = monthSizeLeap[i] + daysFromMonth;
		    }
		totalDays = thisDay + daysFromMonth;
		return totalDays;
	    }
    }
    /**
       Public function to compare two instances of Day.
       @param other Separate instance of Day
    */
    public int compareTo(Day other){
	return dayDifference(other);
    }
    /**
     * This function takes a given number of days that represent the sum of the day and month attributes, and it updates the day and month attributes. The arguement totalDays must
     * be within the range of 1 to 365 days.
     * @param totalDays (The sum of the day and month attributes). Needs to be within range of 1 to 365 days.
     */
    private void convertToDay(int totalDays)
    {
        if (totalDays < 1 || totalDays > 365)
	    {
		throw new IllegalArgumentException("totalDays out of range.");
		    }
        
        int newMonth = 0;
        int newDay = 1;
        
        for (int i = 0; i < (beginningOfMonth.length - 1); i++)
	    {
		if (totalDays < beginningOfMonth[i])
		    {
			newMonth = months[i-1];
			totalDays = totalDays - beginningOfMonth[i-1];
		    }
	    }
        newDay = newDay + totalDays;
        day = newDay;
        month = newMonth;
    }




    /**
     * Takes an argument for the number of days to increment. Negative argument decrements in days.
     * @param incrementDays Integer representing days to increment
     */
    public void incrementDay(int incrementDays)
    {
        int yearsToAdvance;
        int daysToBeConverted;
        
        int totalDays = totDays(incrementDays);
	yearsToAdvance = totalDays / 365;
        daysToBeConverted = totalDays % 365;
        year += yearsToAdvance;
        convertToDay(daysToBeConverted);
    }
    
    /**
     * Takes an argument for the number of months to increment. Negative argument decrements in months.
     * The standard number of days in a month for this function is 31 days. So each month in the argument will be thought of as having 31 days.
     * @param incrementMonths Integer representing months to increment
          
    public void incrementMonth(int incrementMonths)
    {
        int numberOfDays = incrementMonths * 31;
        incrementDay(numberOfDays);
    }
    */
    /**
     * Takes an argument for the number of years to increment. Negative argument decrements in years.
     * @param incrementYears Integer representing years to increment
     */
    public void incrementYear(int incrementYears)
    {
        int numberOfDays = incrementYears * 365;
        incrementDay(numberOfDays);
    }


    // void setDay(int d, int m, int y)
    // void parseDay(String) // works for “2014-02-09” or “5/11/1970”
    // int compareTo(Day other)//if this is less than other return negative. 0 if equal.
    // string toString() 
}
