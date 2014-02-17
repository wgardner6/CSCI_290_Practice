import java.util.ArrayList;

public class dayTester{
    public static void main(String[] args){
	ArrayList<Day> list = new ArrayList<Day>();
	for (int d = 1; d < 31; d++){
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
	for (int d = 1; d<29; d++){
	    Day myDay = new Day(d,2,2014);
	    System.out.println(myDay.getDayOfWeek());
	}
	
	Day anotherDay = new Day(17,2,2013);
	Day copyDay = new Day(anotherDay);
	System.out.println(anotherDay.equals(copyDay));
	Day exDay = new Day(17,2,2010);
	Day diffDay = new Day(17,4,2010);
	System.out.format("Final difference %d%n",exDay.dayDifference(diffDay));
	//System.out.println(myDay.getDayOfWeek());
	System.out.format("Checking to see if leap year %s%n",anotherDay.isLeapYear());
	//System.out.println(myDay);
    }
    
    
    
    
    
}
