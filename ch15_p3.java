// Java Program to illustrate isLeapYear() function
// of GregorianCalendar

import java.io.*;
import java.util.*;

class ch15_p3            //gregorian calendar class 
 {
	public static void main(String[] args) {
	
	// Create a new calendar
	GregorianCalendar c = (GregorianCalendar)
				GregorianCalendar.getInstance();

	// Display the current date and time
	System.out.println("Current Date and Time : "
								+ c.getTime());

	int year = c.get(GregorianCalendar.YEAR);
	if(c.isLeapYear(year))
	{
		System.out.println(year +
						" is leap year");
	}
	else
	{
		System.out.println(year +
					" is Not a leap year");
	}
}
}
