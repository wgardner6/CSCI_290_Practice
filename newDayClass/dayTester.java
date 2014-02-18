import java.util.ArrayList;

public class dayTester{
    public static void main(String[] args){
	ArrayList<Day> list = new ArrayList<Day>();
	/**for (int d = 1; d < 31; d++){
	    for (int m = 1; m < 13; m++){
		for (int y = 1900; y < 2020; y++){
		    //System.out.println(y);
		    list.add(new Day(d,m,y));
		    //System.out.format("The year is %d%n",y);
		    Day checkDay = new Day(d,m,y);
		    //System.out.println(checkDay.isLeapYear());
		}
	    }
	}
	*/		
	/**for (int d = 1; d<29; d++){
	    Day myDay = new Day(d,2,2014);
	    System.out.format("The day of the week for day = %d, month = %d, and year = %d is %d", d,m,y,myDay.getDayOfWeek());
	}
	*/
	Day anotherDay = new Day(17,2,2014);
	Day copyDay = new Day(anotherDay);
	Day exDay = new Day(17,2,1900);
        Day diffDay = new Day(17,4,2018);

	System.out.format("Checking to see if copy constructor works %b%n%n",anotherDay.equals(copyDay));
	System.out.format("Checking to see if equals check works %b%n%n",anotherDay.equals(exDay));
	System.out.format("The day is %s, the month is %s, the year is %s%n%n", exDay.getDay(), exDay.getMonth(), exDay.getYear());
	System.out.format("Final difference between exDay and diffDay %d and reversed %d%n%n",exDay.dayDifference(diffDay),diffDay.dayDifference(exDay));
	System.out.format("Checking compareTo function for above difference %d%n%n",exDay.compareTo(diffDay));
	System.out.format("Checking compareTo function for identical dates %d%n%n", anotherDay.compareTo(copyDay));
	System.out.format("Checking to see if %d-%d-%d is indeed Monday %b.%n%n",anotherDay.getDay(),anotherDay.getMonth(), anotherDay.getYear(),anotherDay.getDayOfWeek());
	System.out.format("Checking to see if %d is leap year %s%n%n",exDay.getYear(),exDay.isLeapYear());
	System.out.format("Checking to see if error thrown outside range for Feb-31%n%n");
	Day febDay = new Day(31,2,2010);
    }
    
    
    
    
    
}
