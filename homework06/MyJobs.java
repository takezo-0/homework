// Delta College - CST 283 - Klingler  
// This application manages a list of jobs of various categories.

import java.util.ArrayList;

public class MyJobs
{
    public static void main(String args[])
    {
        ArrayList<Job> taskList = new ArrayList<Job>();   // 20 is enough tasks for one day

        // Instantiate total job list.  Store as general Job objects in an ArrayList.
        taskList.add(new PaintJob("Kitchen Painting",2,800));
        taskList.add(new PlumbingJob("Housewide Plumbing",2,12));
        taskList.add(new PaintJob("Office Painting",3,400));
        taskList.add(new ElectricalJob("Housewide Wiring",1,28));
        taskList.add(new PlumbingJob("Sprinkler System",2,30));
        taskList.add(new ElectricalJob("Holiday Lighting",3,8));

        // Initialize accumulators
        int totalTime = 0;
        int totalCost = 0;

        // Accumulate total cost and time for all work
        for (Job aJob : taskList)
        {
            totalCost += aJob.calcCost();
            totalTime += aJob.calcTime();
        }

        // Report totals
        System.out.println("Total Time: " + totalTime);
        System.out.println("Total Cost: " + totalCost);
    }

}
