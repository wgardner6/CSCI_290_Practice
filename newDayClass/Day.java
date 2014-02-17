public class Day
{
    private int day;
    private int month;
    private int year;
    private static int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
    private static int[] monthSize = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static int[] monthSizeLeap = {31,29,31,30,31,30,31,31,30,31,30,31};
    private static int[] endOfMonth = {31,59,90,120,151,181,212,243,273,304,334,365};
    private static int[] endOfMonthLeap = {31,60,91,121,152,182,213,244,274,305,335,366};
    private static int[] beginningOfMonth = {1,32,60,91,121,152,182,213,244,274,305,335};
    private static int[] beginningOfMonthLeap = {1,32,61,92,122,153,183,214,245,275,306,336};
    /**
       Constructs a day with user inputted day, month, and year.
       @param day Day between 1 and 31.
       @param month Month between 1 and 12
       @param year Year not equal to zero
       
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
	//System.out.println(dayWeek)
	
	
	
	if (dayWeek<0)
	    dayWeek+=7;
	if (dayWeek>6)
	    dayWeek-=7;
	return dayWeek;	
    }
    
    boolean isLeapYear(){
	if((this.year%4==0)&&(this.year%100!=0)||(this.year%400==0))
	    return true;
	else
	    return false;
    }
    boolean equals(Day other){
	if(this.day==other.day && this.month==other.month && this.year==other.year)
	    return true;
	else
	    return false;
    }    
    int dayDifference(Day other){
	if(this.year!=other.year){
	    int yearDiff = other.year-this.year;
	}

    }    
    
    //Day() //returns today's date
    /**
       int getDayOfWeek() // Use “Principle of Least Surprise” 0-6 or 1-7 which is similar to Python and C
       boolean isLeapYear()
       boolean equals(Day other)
       void setDay(int d, int m, int y)
       void parseDay(String) // works for “2014-02-09” or “5/11/1970”
       Rick
       int getYear()
       int getMonth()
       int getDay()
       boolean isLastDayOfMonth()  
       boolean isBeginningOfMonth()
       Antanas
       void incrementDay(int) //argument is optional, defaults to 1. Negative arg. decrements day
       void incrementMonth(int)
       void incrementYear(int)
       int dayDifference(Day other)
       private int convertToDays()
       private int convertToDate()
       
       boolean isHoliday()
       
       int compareTo(Day other)//if this is less than other return negative. 0 if equal.
       string toString() 
       
    */
    
    
    
    
    
}
