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
	
	Day anotherDay = new Day(17,2,2014);
	Day copyDay = new Day(anotherDay);
	System.out.println(anotherDay.equals(copyDay));
	//System.out.println(myDay.getDayOfWeek());
	//System.out.println(myDay.isLeapYear());
	//System.out.println(myDay);
    }
    
    
    
    
    
}