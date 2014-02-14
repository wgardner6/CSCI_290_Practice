public class Day
{
private static ArrayList<int> endOfMonth = new ArrayList<int>();
private static ArrayList<int> beginningOfMonth = new ArrayList<int>();
private static ArrayList<int> endOfMonthLeap = new ArrayList<int>();
private static ArrayList<int> beginningOfMonthLeap = new ArrayList<int>();

public Day(int day, int month, int year)
Day(Day)
Day() //returns today's date
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







}
