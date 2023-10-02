// This program receives an integer year and returns the
// first and last day of daylight savings time in the U.S.
// Rule: daylight savings time:
//    ==> begins at 2:00 a.m. on the second Sunday of March
//    ==> ends at 2:00 a.m. on the first Sunday of November

public class DSTcalc
{
    public static void main(String args[])
    {
        int theYear;
        int day;
        Date dstStartDate = new Date();
        Date dstEndDate   = new Date();
        boolean done;

        theYear = 2023;
        
        
        
            // ENTER YOUR ALGORITHM(S) HERE
        
        

   
        // Report results
        System.out.println("In " + theYear);

        System.out.println("  DST begins: " + dstStartDate.getMonth() + "/"
                + dstStartDate.getDay() +"/" + dstStartDate.getYear() + "\n");

        System.out.println("  DST ends: " + dstEndDate.getMonth() + "/"
                + dstEndDate.getDay() +"/" + dstEndDate.getYear() + "\n");
    }
}

