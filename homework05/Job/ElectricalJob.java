// This class manages the time and cost requirements for electrical workl.

public class ElectricalJob extends Job
{
   private int wiringTasks;

   private final double COST_PER_TASK  = 15.00;  // Dollars
   private final double TIME_PER_TASK  = 0.25;  // Hours per square wiring task

   public ElectricalJob()
   {
      super();
      wiringTasks = 0;
   } 
   
   public ElectricalJob(String d, int p, int t)
   {
      super(d, p);   // Pass description and priority to superclass
      wiringTasks = t;
   } 

   public void setWritingTasks(int t)
   {
      wiringTasks = t;
   }
   public double getWritingTasks() {  return wiringTasks;  }

   public double calcCost()
   {
      return wiringTasks * COST_PER_TASK;
   }

   public double calcTime()
   {
      return wiringTasks * TIME_PER_TASK;
   }

   public String toString()
   {
      return  super.toString() + " - " + "Wiring tasks: " + wiringTasks;
   }
} 

