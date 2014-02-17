public class Day
{
private static ArrayList<int> endOfMonth = new ArrayList<int>();
private static ArrayList<int> beginningOfMonth = new ArrayList<int>();
private static ArrayList<int> endOfMonthLeap = new ArrayList<int>();
private static ArrayList<int> beginningOfMonthLeap = new ArrayList<int>();
private int day;
private int month;
private int year;
/**
	Constructs a day with user inputted day, month, and year.
	@param day Day between 1 and 31.
	@param month Month between 1 and 12
	@param year Year not equal to zero

*/
public Day(int iday, int imonth, int iyear){
	if(iday<32&&iday>0)
	day = iday;
	if(imonth>0&&imonth<13)
	month = imonth;
	if (iyear>0&&iyear<10001)
	year = iyear;
}
/**
	Copy constructor. 
	@param other Separate instance of Day.
*/
public Day(Day other){
	this.day = other.day;
	this.month = other.month;
	this.year = other.year;
}

public int getDayOfWeek(){
	int[] monthTable;
	monthTable = new int[12];
	if this.isLeapYear(){
		monthTable[0] = 0;
		monthTable[1] = 3;
		monthTable[2] = 3;
		monthTable[3] = 6;
		monthTable[4] = 1;
		monthTable[5] = 4;
		monthTable[6] = 6;
		monthTable[7] = 2;
		monthTable[8] = 5;
		monthTable[9] = 0;
		monthTable[10] = 3;
		monthTable[11] = 5; 
	}
	else {
		monthTable[0] = -1;
		monthTable[1] = 2;
		monthTable[2] = 3;
		monthTable[3] = 6;
		monthTable[4] = 1;
		monthTable[5] = 4;
		monthTable[6] = 6;
		monthTable[7] = 2;
		monthTable[8] = 5;
		monthTable[9] = 0;
		monthTable[10] = 3;
		monthTable[11] = 5; 
	}
	int d = day;
	int m = monthTable[month-1];
	
}

boolean isLeapYear(){
	if((this.year%4==0)&&(this.year%100==0)&&(this.year%400==0))
	  return 1;
	else
	  return 0;
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
