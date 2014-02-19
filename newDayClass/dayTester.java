import java.util.ArrayList;

public class dayTester{
    public static void main(String[] args){
	Day anotherDay = new Day(17,2,2014);
	Day copyDay = new Day(anotherDay);
	Day exDay = new Day(17,2,1900);
        Day diffDay = new Day(17,4,2018);
	Day leapDay = new Day(17,4,2012);
	Day monthDay = new Day(1,4,2014);
	Day endDay = new Day(28,2,2014);
	ArrayList<Day> list = new ArrayList<Day>();
	int count = 0;
	for (int d = 16; d < 23; d++){
	    list.add(new Day(d,2,2014));
	    Day checkDay = new Day(d,2,2014);
	    if(checkDay.getDayOfWeek()!=count)
		System.out.format("Error in day of week calculation");
	    count++;
	}
	System.out.format("%nChecking to see if copy constructor and equals works, should return true, returns:  %b%n%n",anotherDay.equals(copyDay));
	System.out.format("Checking to see if equals check works, should return false, returns:  %b%n%n",anotherDay.equals(exDay));
	System.out.format("Both equals checks work so we can proceed to traditional testing%n%n");
	if (exDay.isBeginningOfMonth()==true)
	    System.out.format("isBeginningOfMonth failed");
	if (monthDay.isBeginningOfMonth()==false)
	    System.out.format("isBeginningOfMonth failed on start of month");
	if (endDay.isLastDayOfMonth()==false)
	    System.out.format("isLastDayOfMonth failed on end of month");
	if (exDay.getDay()!=17)
	    System.out.format("getDay failed");
	if (exDay.getMonth()!=2)
	    System.out.format("getMonth failed");
	if (exDay.getYear()!=1900)
            System.out.format("getYear failed");
	if (exDay.dayDifference(diffDay)!=-43158)
	    System.out.format("dayDifference failed with a negative difference");
	if (diffDay.dayDifference(exDay)!=43158)
	    System.out.format("dayDifference failed with a positive difference");
	if (exDay.compareTo(diffDay)==0)
	    System.out.format("compareTo failed with two different days");
	if (anotherDay.compareTo(copyDay)!=0)
	    System.out.format("compareTo failed with two identical days");
	if (anotherDay.getDayOfWeek()!=1)
	    System.out.format("getDayOfWeek failed with known day of Monday");
	if (leapDay.isLeapYear()==false)
	    System.out.format("isLeapYear failed with known leap year");
	if (diffDay.isLeapYear()==true)
	    System.out.format("isLeapYear failed with known non leap year");
	//Trial 1

        Day currentDay1 = new Day(19,2,2014);
        Day correctDay1 = new Day(20,2,2014);

        currentDay1.incrementDay(1);

        if (currentDay1.equals(correctDay1) == false)
	    {
		System.out.println("incrementDay did not work in trial 1.");
	    }

        // Trial 2

        Day currentDay2 = new Day(27,2,2016);
        Day correctDay2 = new Day(3,3,2016);

        currentDay2.incrementDay(5);

        if (currentDay2.equals(correctDay2) == false)
	    {
		System.out.println("incrementDay did not work in trial 2.");
	    }

        // Trial 3

        Day currentDay3 = new Day(31,12,2015);
        Day correctDay3 = new Day(30,12,2016);

        currentDay3.incrementDay(365);

        if (currentDay3.equals(correctDay3) == false)
	    {
		System.out.println("incrementDay did not work in trial 3.");
	    }

        // Trial 4

        Day currentDay4 = new Day(19,2,2014);
        Day correctDay4 = new Day(18,2,2014);

        currentDay4.incrementDay(-1);

        if (currentDay4.equals(correctDay2) == false)
	    {
		System.out.println("incrementDay did not work in trial 4.");
	    }

        // Trial 5

        Day currentDay5 = new Day(1,3,2016);
        Day correctDay5 = new Day(28,2,2016);

        currentDay5.incrementDay(-2);

        if (currentDay5.equals(correctDay2) == false)
	    {
		System.out.println("incrementDay did not work in trial 5.");
	    }

        // Trial 2

        Day currentDay6 = new Day(3,3,2016);
        Day correctDay6 = new Day(1,1,2015);

        currentDay6.incrementDay(-427);

        if (currentDay6.equals(correctDay2) == false)
	    {
		System.out.println("incrementDay did not work in trial 6.");
	    }

        // Testing incrementYear

        // Trial 1

        Day currentDay7 = new Day(1,1,2015);
        Day correctDay7 = new Day(1,1,2016);

        currentDay7.incrementYear(1);

        if (currentDay7.equals(correctDay1) == false)
	    {
		System.out.println("incrementYear did not work in trial 1.");
	    }

        // Trial 2

        Day currentDay8 = new Day(1,1,2016);
        Day correctDay8 = new Day(1,1,2015);

        currentDay8.incrementYear(-1);

        if (currentDay8.equals(correctDay1) == false)
	    {
		System.out.println("incrementYear did not work in trial 2.");
	    }



    }
    
    
    
    
    
}
